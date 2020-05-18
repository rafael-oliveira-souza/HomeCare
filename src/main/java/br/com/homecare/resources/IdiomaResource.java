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

import br.com.homecare.models.entities.Idioma;
import br.com.homecare.services.IdiomaService;

@RestController
@RequestMapping("/idioma")
public class IdiomaResource {

	@Autowired
	private IdiomaService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Idioma>> getAll() {
		List<Idioma> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Idioma>> find(@PathVariable(value = "id") Long id) {
		Optional<Idioma> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Idioma> save(@RequestBody Idioma idioma) {
		Idioma objeto = service.save(idioma);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Idioma> update(@RequestBody Idioma idioma) {
		Idioma objeto = service.update(idioma);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
