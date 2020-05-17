package br.com.homecare.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.homecare.config.interceptors.RequestInterceptor;

@Configuration
@SuppressWarnings("deprecation")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new RequestInterceptor()); 

//	      registry.addInterceptor(new AdminInterceptor())//
//          .addPathPatterns("/admin/*")//
	}
}