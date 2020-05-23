package br.com.homecare.services;

import java.util.ArrayList;
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
		List<Doenca> doen = new ArrayList<Doenca>();
		for(Doenca doenca: list) {
			if(doenca.getId() == null) {
				this.save(doenca);
			}
		}
		
		return doen;
	}
	
	public void deleteAll(List<Doenca> list) {
		for(Doenca doenca: list) {
			if(doenca.getId() != null) {
				this.delete(doenca.getId());
			}
		}
	}

	public Doenca save(Doenca entity) {
		try {
			entity = this.repo.save(entity);
			this.saveSintomas(entity);
			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}

	public Doenca update(Doenca entity) {
		if (entity == null || entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Doenca> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			Doenca doenca = objeto.get();
			this.updateSintomas(doenca);
			return this.repo.save(doenca);
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
			Doenca doenca = objeto.get();
			this.deleteSintomas(doenca);
			this.repo.delete(doenca);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Educacao"));
		}
	}
	
	public List<Sintoma> updateSintomas(Doenca doenca) {
		List<Sintoma> sintomas = new ArrayList<Sintoma>();
		for(Sintoma sintoma: doenca.getSintomas()) {
			if(sintoma.getId() != null) {
				sintomas.add(sintoma);
				this.sintomaService.save(sintoma);
			}
		}
		
		return sintomas;
	}
	
	private List<Sintoma> saveSintomas(Doenca doenca) {
		for(Sintoma sintoma: doenca.getSintomas()) {
			if(sintoma.getId() == null) {
				sintoma.getDoencas().add(doenca);
				this.sintomaService.save(sintoma);
			}
		}
		
		return doenca.getSintomas();
	}

	private void deleteSintomas(Doenca doenca) {
		for(Sintoma sintoma: doenca.getSintomas()) {
			if(sintoma.getId() == null) {
				sintoma.getDoencas().clear();
				this.sintomaService.delete(sintoma.getId());
			}
		}
	}
}
