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

import br.com.homecare.models.entities.Usuario;
import br.com.homecare.services.AuthService;
import br.com.homecare.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService service;

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public Usuario login(@RequestBody Usuario usuario) {
		usuario = this.service.login(usuario);

		return usuario;
	}

	@PostMapping("/usuario/salvar")
	public ResponseEntity<Usuario>  salvar(@RequestBody Usuario usuario) {
		usuario = this.service.save(usuario);

		return ResponseEntity.ok().body(usuario);
	}

	@PostMapping("/usuario/recuperar-senha")
	public ResponseEntity<String>  recoverPassword(@RequestBody Usuario usuario) {
		this.authService.recoverPassword(usuario);

		return ResponseEntity.ok().body("Senha recuperada.");
	}

	@GetMapping("/usuario/buscar/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
		Optional<Usuario> usuario = this.service.find(id);

		return ResponseEntity.ok().body(usuario.get());
	}
	
	@GetMapping("/usuario/todos")
	public ResponseEntity<List<Usuario>> todos() {
		List<Usuario> usuarios = this.service.getAll();

		return ResponseEntity.ok().body(usuarios);
	}

	@PutMapping("/usuario/atualizar")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
		Usuario objeto = service.update(usuario);

		return ResponseEntity.ok().body(objeto);
	}

	@DeleteMapping("/usuario/excluir/{id}")
	public ResponseEntity<Usuario> Delete(@PathVariable(value = "id") Long id) {
		service.delete(id);

		return ResponseEntity.ok().body(null);
	}
}
