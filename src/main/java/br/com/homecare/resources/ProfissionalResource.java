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
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.entities.Profissional;
import br.com.homecare.services.ProfissionalService;

@RestController
@RequestMapping("/profissional")
public class ProfissionalResource {

	@Autowired
	private ProfissionalService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Profissional>> getAll() {
		List<Profissional> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Profissional>> find(@PathVariable(value = "id") Long id) {
		Optional<Profissional> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Profissional> save(@RequestBody Profissional Profissional) {
		Profissional objeto = service.save(Profissional);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Profissional> update(@RequestBody Profissional Profissional) {
		Profissional objeto = service.update(Profissional);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
