
package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Educacao;
import br.com.homecare.repositories.EducacaoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class EducacaoService {
	
	@Autowired
	private EducacaoRepository repo;

	public Optional<Educacao> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Educacao> getAll() {
		return this.repo.findAll();
	}
	
	public List<Educacao> updateAll(List<Educacao> list) {
		 return this.repo.saveAll((Iterable<Educacao>)list);
	}

	public List<Educacao> saveAll(List<Educacao> list) {
		 return this.repo.saveAll((Iterable<Educacao>)list);
	}

	public void deleteAll(List<Educacao> list) {
		 this.repo.deleteAll((Iterable<Educacao>)list);
	}

	public Educacao save(Educacao entity) {
		try {
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Educacao update(Educacao entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Educacao> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Educacao"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Educacao> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Educacao"));
        }
	}

}
