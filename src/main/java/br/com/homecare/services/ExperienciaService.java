package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Experiencia;
import br.com.homecare.repositories.ExperienciaRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class ExperienciaService {
	
	@Autowired
	private ExperienciaRepository repo;

	public Optional<Experiencia> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Experiencia> getAll() {
		return this.repo.findAll();
	}

	public List<Experiencia> saveAll(List<Experiencia> entity) {
		for (Experiencia experiencia: entity) {
			this.save(experiencia);
		}
		
		return entity;
	}

	public Experiencia save(Experiencia entity) {
		try {
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Experiencia update(Experiencia entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Experiencia> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Experiencia"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Experiencia> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Experiencia"));
        }
	}

}