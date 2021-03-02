package br.com.homecare.services;

import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.config.security.JwtUtil;
import br.com.homecare.config.security.UserSecurity;
import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.dtos.EmailDTO;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.repositories.UsuarioRepository;
import br.com.homecare.services.commons.InterfaceEmailService;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class AuthService {
	private Random rand = new Random();
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private BCryptPasswordEncoder crypt;

	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private InterfaceEmailService emailService;
	
	public void refreshToken(HttpServletResponse response) {
//		UserSecurity user = UsuarioService.usuarioLogado();
//		String token = jwtUtil.generateToken(user.getEmail());
//		response.addHeader(jwtUtil.AUTHORIZATION, jwtUtil.BEARER + token);
	}
	
	public void recoverPassword(Usuario usuario) {
		usuario = this.repo.findByEmail(usuario.getEmail());
		if(usuario == null) {
			throw new RequestErrorException(ExceptionMessages.EMAIL_CADASTRADO);
		}
		
		try {
			String novaSenha = generateRandomPassword();
			usuario.setSenha(crypt.encode(novaSenha));
        	usuario = this.repo.save(usuario);
			EmailDTO emailDTO = new EmailDTO.Builder()
					.subject("Homecare - Recuperacao de senha.")
					.usuario(usuario).template("email/padrao")
					.titulo("Recuperacao de senha")
					.msg("Sua nova senha é : " + novaSenha).build();
        	this.emailService.sendEmailRecoverPassword(emailDTO);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	private String generateRandomPassword() {
		char[] vet = new char[10];
		for(int i=0; i<10; i++) {
			vet[i] = randonChar();
		}
		return new String(vet);
	}
	
	private char randonChar() {
		int opt = rand.nextInt(3);
		if(opt == 0) {
			return (char)(rand.nextInt(10) + 48);
		}else if (opt == 1){
			return (char)(rand.nextInt(26) + 65);
		}else {
			return (char)(rand.nextInt(26) + 97);
			
		}
	}
}