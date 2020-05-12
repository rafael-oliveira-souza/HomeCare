package br.com.homecare.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.services.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;

	@RequestMapping(value="/(id)", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Pessoa> pessoa = this.service.buscar(id);
		
		return ResponseEntity.ok().body(pessoa);
	}

}
