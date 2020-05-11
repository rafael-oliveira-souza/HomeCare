package com.homecare.service.auth;

import com.homecare.utils.exceptions.custom.ErrorResouceException;
import io.fusionauth.jwt.Signer;
import io.fusionauth.jwt.Verifier;
import io.fusionauth.jwt.domain.JWT;
import io.fusionauth.jwt.hmac.HMACSigner;
import io.fusionauth.jwt.hmac.HMACVerifier;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static com.homecare.utils.messages.ExceptionMessages.ERRO_TKN_INV;

public class AuthService {

    public boolean validarToken(String encodedJWT){
        boolean autenticado = false;

        try {
            // Build an HMC verifier using the same secret that was used to sign the JWT
            Verifier verifier = HMACVerifier.newVerifier(System.getProperty("application.secret.app"));
            // Verify and decode the encoded string JWT to a rich object
            JWT jwt = JWT.getDecoder().decode(encodedJWT, verifier);
            // Assert the subject of the JWT is as expected
           autenticado = jwt.subject.equals(System.getProperty("application.secret.key"));
        } catch (Exception exception){
            throw new ErrorResouceException(ERRO_TKN_INV);
        }

        return autenticado;
    }

    public String gerarToken(){
        String token = null;

        try {
            // Build an HMAC signer using a SHA-256 hash
            Signer signer = HMACSigner.newSHA256Signer(System.getProperty("application.secret.app"));
            // Build a new JWT with an issuer(iss), issued at(iat), subject(sub) and expiration(exp)
            JWT jwt = new JWT().setIssuer("www.homecare.com")
                    .setIssuedAt(ZonedDateTime.now(ZoneOffset.UTC))
                    .setSubject(System.getProperty("application.secret.key"))
                    .setExpiration(ZonedDateTime.now(ZoneOffset.UTC).plusMinutes(60));

            // Sign and encode the JWT to a JSON string representation
            token = JWT.getEncoder().encode(jwt, signer);
        } catch (Exception exception){
            throw new ErrorResouceException(ERRO_TKN_INV);
        }

        return token;
    }
}
