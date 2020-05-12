package br.com.homecare.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.Usuario;

@RestController
@RequestMapping("/login")
public class LoginResource {

	@RequestMapping(method=RequestMethod.GET)
	public Usuario login() {
		Usuario user = new Usuario("teste", "oi");

		return user;
	}

}
