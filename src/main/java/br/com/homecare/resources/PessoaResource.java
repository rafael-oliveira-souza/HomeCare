package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/buscar/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Pessoa> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}


	@PostMapping("/salvar")	
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
		Pessoa objeto = service.save(pessoa);

		return ResponseEntity.ok().body(objeto);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Pessoa> update(@RequestBody Pessoa Pessoa) {
		Pessoa objeto = service.update(Pessoa);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
