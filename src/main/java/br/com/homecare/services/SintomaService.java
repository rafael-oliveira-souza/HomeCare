
package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Doenca;
import br.com.homecare.models.entities.Especialidade;
import br.com.homecare.models.entities.Sintoma;
import br.com.homecare.repositories.SintomaRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class SintomaService {
	
	@Autowired
	private SintomaRepository repo;

	@Autowired
	private EspecialidadeService especService;
	
	@Autowired
	private DoencaService doencaService;
	
	public Optional<Sintoma> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Sintoma> getAll() {
		return this.repo.findAll();
	}
	
	public List<Sintoma> saveAll(List<Sintoma> list) {
		for (Sintoma sintoma : list) {
			this.save(sintoma);
		}
		
		return list;
	}
	
	public Sintoma save(Sintoma entity) {
		try {
			entity = this.repo.save(entity);
			
			List<Especialidade> especialidades = entity.getEspecialidades();
			for(Especialidade espec: especialidades) {
				if(espec.getId() == null) {
					espec.getSintomas().add(entity);
					this.especService.save(espec);
				}
			}

			List<Doenca> doencas = entity.getDoencas();
			for(Doenca doenca: doencas) {
				if(doenca.getId() == null) {
					doenca.getSintomas().add(entity);
					this.doencaService.save(doenca);
				}
			}
			
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Sintoma update(Sintoma entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Sintoma> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Especialidade"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Sintoma> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Especialidade"));
        }
	}

}
