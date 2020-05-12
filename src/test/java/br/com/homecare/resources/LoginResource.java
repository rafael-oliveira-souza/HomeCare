package br.com.homecare.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/login")
public class LoginResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String logar() {
		return "teste";
	}
}
