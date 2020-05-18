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

import br.com.homecare.models.entities.Especialidade;
import br.com.homecare.services.EspecialidadeService;

@RestController
@RequestMapping("/especialidade")
public class EspecialidadeResource {

	@Autowired
	private EspecialidadeService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Especialidade>> getAll() {
		List<Especialidade> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Especialidade>> find(@PathVariable(value = "id") Long id) {
		Optional<Especialidade> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Especialidade> save(@RequestBody Especialidade especialidade) {
		Especialidade objeto = service.save(especialidade);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Especialidade> update(@RequestBody Especialidade especialidade) {
		Especialidade objeto = service.update(especialidade);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
