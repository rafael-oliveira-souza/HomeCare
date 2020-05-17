package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> getAll() {
		List<Pessoa> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Pessoa> objeto = service.buscar(id);

		return ResponseEntity.ok().body(objeto);
	}


	@PostMapping("/salvar")	
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
		Pessoa objeto = service.salvar(pessoa);

		return ResponseEntity.ok().body(objeto);
	}
}
