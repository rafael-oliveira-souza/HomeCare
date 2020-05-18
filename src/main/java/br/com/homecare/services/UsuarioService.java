package br.com.homecare.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.repositories.UsuarioRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;

	public Usuario login(Usuario usuario) {
		
		return usuario;
	}

	public Optional<Usuario> find(Long id) {
		return this.repo.findById(id);
	}

	public Usuario save(Usuario entity) {
		try {
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Usuario update(Usuario entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Usuario> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Usuario"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Usuario> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Usuario"));
        }
	}

}
