package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Idioma;
import br.com.homecare.repositories.IdiomaRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class IdiomaService {
	
	@Autowired
	private IdiomaRepository repo;

	public Optional<Idioma> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Idioma> getAll() {
		return this.repo.findAll();
	}
	
	public List<Idioma> updateAll(List<Idioma> list) {
		 return this.repo.saveAll((Iterable<Idioma>)list);
	}
	
	public List<Idioma> saveAll(List<Idioma> list) {
		 return this.repo.saveAll((Iterable<Idioma>)list);
	}

	public void deleteAll(List<Idioma> list) {
		 this.repo.deleteAll((Iterable<Idioma>)list);
	}

	public Idioma save(Idioma entity) {
		try {
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Idioma update(Idioma entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Idioma> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Idioma"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Idioma> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Idioma"));
        }
	}

}