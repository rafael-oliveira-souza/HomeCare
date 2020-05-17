package br.com.homecare.config.filters;

import static br.com.homecare.utils.messages.ExceptionMessages.ERRO_TKN_INV;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import br.com.homecare.core.exceptions.custom.ErrorResouceException;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		if (response.getStatus() != HttpServletResponse.SC_OK) {
			throw new ErrorResouceException(ERRO_TKN_INV);
		}

		// call next filter in the filter chain
		filterChain.doFilter(request, response);
	}

}