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

import br.com.homecare.models.entities.Curriculo;
import br.com.homecare.services.CurriculoService;

@RestController
@RequestMapping("/curriculo")
public class CurriculoResource {

	@Autowired
	private CurriculoService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Curriculo>> getAll() {
		List<Curriculo> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Curriculo>> find(@PathVariable(value = "id") Long id) {
		Optional<Curriculo> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	public ResponseEntity<Curriculo> save(@RequestBody Curriculo curriculo) {
		Curriculo objeto = service.save(curriculo);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Curriculo> update(@RequestBody Curriculo curriculo) {
		Curriculo objeto = service.update(curriculo);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
