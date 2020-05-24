package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Profissao;
import br.com.homecare.repositories.ProfissaoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class ProfissaoService {
	
	@Autowired
	private ProfissaoRepository repo;

	public Optional<Profissao> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Profissao> getAll() {
		return this.repo.findAll();
	}
	
	public List<Profissao> saveAll(List<Profissao> entity) {
		return this.repo.saveAll(entity);
	}

	public Profissao save(Profissao entity) {
		try {
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Profissao update(Profissao entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissao> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Profissao"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissao> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
        	Profissao profissao = objeto.get();
    		this.repo.delete(profissao);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Profissao"));
        }
	}

}
