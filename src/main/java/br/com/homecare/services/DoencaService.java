package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Doenca;
import br.com.homecare.models.entities.Sintoma;
import br.com.homecare.repositories.DoencaRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class DoencaService {

	@Autowired
	private DoencaRepository repo;

	@Autowired
	private SintomaService sintomaService;

	public Optional<Doenca> find(Long id) {
		return this.repo.findById(id);
	}

	public List<Doenca> getAll() {
		return this.repo.findAll();
	}

	public List<Doenca> saveAll(List<Doenca> list) {
		for(Doenca doenca: list) {
			this.save(doenca);
		}
		
		return list;
	}

	public Doenca save(Doenca entity) {
		try {
			entity = this.repo.save(entity);
			
			List<Sintoma> sintomas = entity.getSintomas();
			for(Sintoma sintoma: sintomas) {
				if(sintoma.getId() == null) {
					sintoma.getDoencas().add(entity);
					this.sintomaService.save(sintoma);
				}
			}
			
			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}

	public Doenca update(Doenca entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Doenca> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			return this.repo.save(entity);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Profissao"));
		}
	}

	public void delete(final Long id) {
		if (id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Doenca> objeto = this.find(id);
		if (objeto.isPresent()) {
			this.repo.delete(objeto.get());
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Educacao"));
		}
	}
}
