package com.homecare.service;

//import com.homecare.service.auth.AuthService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.homecare.model.entity.Usuario;
import com.homecare.repository.LoginRepository;
import com.homecare.utils.exceptions.custom.ErrorResouceException;

import static com.homecare.utils.messages.ExceptionMessages.ERRO_TKN_INV;

public class LoginService extends LoginRepository {
//    @Inject
//    private AuthService authService;

    public Usuario save(Usuario usuario) {

//        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXUyJ9.eyJpc3MiOiJhdXRoMCJ9.AbIJTDMFc7yUa5MhvcP03nJPyCPzZtQcGEp-zWfOkEE";
//        try {
//            Algorithm algorithm = Algorithm.HMAC256("secret");
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withIssuer("auth0")
//                    .build(); //Reusable verifier instance
//            DecodedJWT jwt = verifier.verify(token);
//        } catch (JWTVerificationException exception){
//            //Invalid signature/claims
//        }
        Usuario novoUsuario = super.save(usuario);
        return  novoUsuario;
    }

    public Usuario update(Usuario usuario) {
        return  super.update(usuario);
    }

    public void delete(Long id) {
        super.delete(id);
    }
}
