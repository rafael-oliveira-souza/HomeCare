package br.com.homecare.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginResource {

	@RequestMapping(method=RequestMethod.GET)
	public String login() {
		return "Teste";
	}

}
