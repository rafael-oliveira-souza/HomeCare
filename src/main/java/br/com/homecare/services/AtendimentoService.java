package br.com.homecare.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Atendimento;
import br.com.homecare.repositories.AtendimentoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class AtendimentoService {
	
	@Autowired
	private AtendimentoRepository repo;

	public Optional<Atendimento> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Atendimento> getAll() {
		return this.repo.findAll();
	}

	public List<Atendimento> updateAll(Set<Atendimento> atendimentos) {
		 return this.repo.saveAll((Iterable<Atendimento>)atendimentos);
	}
	
	public List<Atendimento> saveAll(Set<Atendimento> atendimentos) {
		 return this.repo.saveAll((Iterable<Atendimento>)atendimentos);
	}

	public void deleteAll(Set<Atendimento> atendimentos) {
		 this.repo.deleteAll((Iterable<Atendimento>)atendimentos);
	}
	
	public Atendimento save(Atendimento entity) {
		try {
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Atendimento update(Atendimento entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Atendimento> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Atendimento"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Atendimento> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Atendimento"));
        }
	}

}
