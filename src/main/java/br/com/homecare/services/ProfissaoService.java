package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Especialidade;
import br.com.homecare.models.entities.Profissao;
import br.com.homecare.repositories.EspecialidadeRepository;
import br.com.homecare.repositories.ProfissaoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class ProfissaoService {
	
	@Autowired
	private ProfissaoRepository repo;
	
	@Autowired
	private EspecialidadeRepository especialidadeRepo;

	public Optional<Profissao> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Profissao> getAll() {
		return this.repo.findAll();
	}
	
	public List<Profissao> saveAll(List<Profissao> entity) {
		for (Profissao profissao: entity) {
			this.save(profissao);
		}
		
		return entity;
	}

	public Profissao save(Profissao entity) {
		try {
			entity = this.repo.save(entity);
			List<Especialidade> especialidades = entity.getEspecialidades();
			for (Especialidade especialidade: especialidades) {
				especialidade.setProfissao(entity);
			}
			
			this.especialidadeRepo.saveAll(especialidades);
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Profissao update(Profissao entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissao> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Profissao"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissao> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Profissao"));
        }
	}

}
