package br.com.homecare.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.homecare.models.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> find(Long id);

	@SuppressWarnings("unchecked")
	public Usuario save(Usuario usuario) ;
	
	public Usuario update(Usuario usuario);
	
	public void delete(final Long id);
}
