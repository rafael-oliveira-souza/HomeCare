package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Atendimento;
import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.repositories.AtendimentoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class AtendimentoService {
	
	@Autowired
	private AtendimentoRepository repo;

	@Autowired
	private PessoaService pessoaService;
	
	public Optional<Atendimento> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Atendimento> getAll() {
		return this.repo.findAll();
	}
	
	
	public List<Atendimento> saveAll(List<Atendimento> entity) {
		for (Atendimento atendimento: entity) {
			this.save(atendimento);
		}
		
		return entity;
	}

	public Atendimento save(Atendimento entity) {
		try {
			entity = this.repo.save(entity);
			List<Pessoa> pessoas = entity.getPessoas();
			
			for(Pessoa pessoa: pessoas) {
				pessoa.getAtendimentos().add(entity);
			}
			
			this.pessoaService.saveAll(pessoas);
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
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
