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

import br.com.homecare.models.entities.Sintoma;
import br.com.homecare.services.SintomaService;

@RestController
@RequestMapping("/sintoma")
public class SintomaResource {

	@Autowired
	private SintomaService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Sintoma>> getAll() {
		List<Sintoma> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Sintoma>> find(@PathVariable(value = "id") Long id) {
		Optional<Sintoma> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Sintoma> save(@RequestBody Sintoma sintoma) {
		Sintoma objeto = service.save(sintoma);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Sintoma> update(@RequestBody Sintoma sintoma) {
		Sintoma objeto = service.update(sintoma);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
