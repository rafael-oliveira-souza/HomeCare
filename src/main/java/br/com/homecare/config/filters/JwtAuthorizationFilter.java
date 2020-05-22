package br.com.homecare.config.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import br.com.homecare.config.security.JwtUtil;
import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.utils.messages.ExceptionMessages;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {
	private UserDetailsService userDetailService;
	
	private JwtUtil jwtUtil;

	public JwtAuthorizationFilter(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserDetailsService userDetailService) {
		super(authenticationManager);
		this.jwtUtil = jwtUtil;
		this.userDetailService = userDetailService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String authHeader = request.getHeader(jwtUtil.AUTHORIZATION);
		if(authHeader != null && authHeader.startsWith(jwtUtil.BEARER)) {
			//remover bearer
			String tokenNoBearer = authHeader.replaceAll(jwtUtil.BEARER, "");
//			String tokenNoBearer = authHeader.substring(7);
			UsernamePasswordAuthenticationToken auth = getAuthentication(request, tokenNoBearer);
			if(auth != null) {
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		}else {
			throw new RequestErrorException(ExceptionMessages.FALHA_AUTENTICACAO);
		}
		
		chain.doFilter(request, response);
	}

	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request, String token) {
		if(jwtUtil.isTokenValid(token)) {
			String username = jwtUtil.getUsername(token);
			UserDetails userDetail = this.userDetailService.loadUserByUsername(username);
			return new UsernamePasswordAuthenticationToken(userDetail, null, userDetail.getAuthorities());
		}
		
		return null;
	}
	
}
