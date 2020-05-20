package br.com.homecare.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.repositories.UsuarioRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
public class UserSecurityService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = this.usuarioRepo.findByEmail(email);
		
		if(usuario == null) {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Usuário"));
		}

		return new UserSecurity(usuario);
	}

}
