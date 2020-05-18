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

import br.com.homecare.models.entities.Experiencia;
import br.com.homecare.services.ExperienciaService;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaResource {

	@Autowired
	private ExperienciaService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Experiencia>> getAll() {
		List<Experiencia> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Experiencia>> find(@PathVariable(value = "id") Long id) {
		Optional<Experiencia> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Experiencia> save(@RequestBody Experiencia experiencia) {
		Experiencia objeto = service.save(experiencia);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Experiencia> update(@RequestBody Experiencia experiencia) {
		Experiencia objeto = service.update(experiencia);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
