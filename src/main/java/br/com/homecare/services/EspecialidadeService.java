
package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Especialidade;
import br.com.homecare.repositories.EspecialidadeRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class EspecialidadeService {
	
	@Autowired
	private EspecialidadeRepository repo;

	public Optional<Especialidade> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Especialidade> getAll() {
		return this.repo.findAll();
	}

	public Especialidade save(Especialidade entity) {
		try {
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Especialidade update(Especialidade entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Especialidade> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Especialidade"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Especialidade> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Especialidade"));
        }
	}

}
