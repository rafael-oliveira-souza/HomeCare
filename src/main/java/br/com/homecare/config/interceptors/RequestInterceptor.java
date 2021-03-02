package br.com.homecare.config.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.homecare.core.exceptions.custom.RequestErrorException;;

public class RequestInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
		if (exception != null) {
			throw new RequestErrorException(exception.getMessage());
		}

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

//    	if(StringUtils.isEmpty(request.getHeader("app-homecare-login-auth-key"))) {
//    		throw new ErrorResouceException(ERRO_TKN_INV);
//    	}
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//
//        String emailAddress = request.getParameter("emailaddress");
//        String password = request.getParameter("password");
//
//        if(StringUtils.isEmpty(emailAddress) || StringUtils.containsWhitespace(emailAddress) ||
//        StringUtils.isEmpty(password) || StringUtils.containsWhitespace(password)) {
//            throw new Exception("Invalid User Id or Password. Please try again.");
//        }

		return super.preHandle(request, response, handler);
	}

}