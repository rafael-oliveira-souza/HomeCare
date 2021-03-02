package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.entities.Profissao;
import br.com.homecare.services.ProfissaoService;
import br.com.homecare.utils.ProfileUtils;

@RestController
@RequestMapping("/profissao")
public class ProfissaoResource {

	@Autowired
	private ProfissaoService service;

	@GetMapping("/todos")
	public ResponseEntity<List<Profissao>> getAll() {
		List<Profissao> todos = service.getAll();

		return ResponseEntity.ok().body(todos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Optional<Profissao>> find(@PathVariable(value = "id") Long id) {
		Optional<Profissao> objeto = service.find(id);

		return ResponseEntity.ok().body(objeto);
	}

	@PostMapping("/salvar")
	@PreAuthorize(ProfileUtils.HAS_ROLE_ADMIN)
	public ResponseEntity<Profissao> save(@RequestBody Profissao Profissao) {
		Profissao objeto = service.save(Profissao);

		return ResponseEntity.ok().body(objeto);
	}

	@PutMapping("/atualizar")
	@PreAuthorize(ProfileUtils.HAS_ROLE_ADMIN)
	public ResponseEntity<Profissao> update(@RequestBody Profissao Profissao) {
		Profissao objeto = service.update(Profissao);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/excluir/{id}")
	@PreAuthorize(ProfileUtils.HAS_ROLE_ADMIN)
	public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		
		return ResponseEntity.ok().body(null);
	}
}