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

import br.com.homecare.models.entities.Medicamento;
import br.com.homecare.services.MedicamentoService;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoResource {

	@Autowired
	private MedicamentoService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Medicamento>> getAll() {
		List<Medicamento> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Medicamento> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}


	@PostMapping("/salvar")	
	public ResponseEntity<Medicamento> salvar(@RequestBody Medicamento medicamento) {
		Medicamento objeto = service.save(medicamento);

		return ResponseEntity.ok().body(objeto);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Medicamento> update(@RequestBody Medicamento Medicamento) {
		Medicamento objeto = service.update(Medicamento);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}
