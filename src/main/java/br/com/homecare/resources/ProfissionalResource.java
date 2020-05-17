package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.entities.Profissional;
import br.com.homecare.services.ProfissionalService;

@RestController
@RequestMapping("/profissional")
public class ProfissionalResource {

	@Autowired
	private ProfissionalService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Profissional>> getAll() {
		List<Profissional> profissionais = service.getAll();
		
		return ResponseEntity.ok().body(profissionais);
	}


	@RequestMapping(value="/buscar/(id)", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Profissional> profissional = service.buscar(id);
		
		return ResponseEntity.ok().body(profissional);
	}
}
