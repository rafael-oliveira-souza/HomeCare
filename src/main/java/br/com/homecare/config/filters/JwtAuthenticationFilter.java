package br.com.homecare.config.filters;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.homecare.config.security.JwtUtil;
import br.com.homecare.config.security.UserSecurity;
import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.dtos.UsuarioDTO;
import br.com.homecare.utils.messages.ExceptionMessages;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	private AuthenticationManager authManager;
	
	private JwtUtil jwtUtil;

	public JwtAuthenticationFilter(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
		this.authManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		
		try {
			UsuarioDTO usuario = new ObjectMapper().readValue(request.getInputStream(), UsuarioDTO.class);
			List<SimpleGrantedAuthority> authorities = usuario.getPerfis().stream().map(perf -> new SimpleGrantedAuthority(perf.getValue())) .collect(Collectors.toList());
			
			UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(usuario.getEmail(), usuario.getSenha(), authorities);
			Authentication auth = authManager.authenticate(authToken);
			
			return auth;
		}catch (Exception e) {
			throw new RequestErrorException(ExceptionMessages.FALHA_AUTENTICACAO);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		UserSecurity user = (UserSecurity)authResult.getPrincipal();
		String email = user.getEmail();
		String token = jwtUtil.generateToken(email);
		response.addHeader(jwtUtil.AUTHORIZATION, jwtUtil.BEARER + token);
		response.getWriter().write("Login autenticado.");
		response.getWriter().flush();
		response.getWriter().close();
	}
}
