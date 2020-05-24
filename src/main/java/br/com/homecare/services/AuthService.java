package br.com.homecare.services;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.config.security.JwtUtil;
import br.com.homecare.config.security.UserSecurity;
import br.com.homecare.core.exceptions.custom.RequestErrorException;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class AuthService {

	@Autowired
	private JwtUtil jwtUtil;
	
	public void refreshToken(HttpServletResponse response) {
		UserSecurity user = UsuarioService.usuarioLogado();
		String token = jwtUtil.generateToken(user.getEmail());
		response.addHeader(jwtUtil.AUTHORIZATION, jwtUtil.BEARER + token);
	}
}