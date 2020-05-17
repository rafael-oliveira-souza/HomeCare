package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.models.entities.Paciente;
import br.com.homecare.services.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteResource {

	@Autowired
	private PacienteService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Paciente>> getAll() {
		List<Paciente> todos = service.getAll();
		
		return ResponseEntity.ok().body(todos);
	}


	@RequestMapping(value="/buscar/(id)", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Optional<Paciente> objeto = service.buscar(id);
		
		return ResponseEntity.ok().body(objeto);
	}
}
