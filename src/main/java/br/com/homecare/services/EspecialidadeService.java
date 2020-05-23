
package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Especialidade;
import br.com.homecare.models.entities.Sintoma;
import br.com.homecare.repositories.EspecialidadeRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class EspecialidadeService {

	@Autowired
	private EspecialidadeRepository repo;

	@Autowired
	private SintomaService sintomaService;

	public Optional<Especialidade> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Especialidade> getAll() {
		return this.repo.findAll();
	}

	public List<Especialidade> saveAll(List<Especialidade> list) {
		for (Especialidade espec : list) {
			this.save(espec);
		}

		return list;
	}

	public void deleteAll(List<Especialidade> list) {
		for (Especialidade espec : list) {
			if (espec.getId() == null) {
				this.delete(espec.getId());
			}
		}
	}

	public Especialidade save(Especialidade entity) {
		try {
			entity = this.repo.save(entity);
			this.saveSintomas(entity);
			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}

	public Especialidade update(Especialidade entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Especialidade> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			return this.repo.save(entity);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Especialidade"));
		}
	}

	public void delete(final Long id) {
		if (id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Especialidade> objeto = this.repo.findById(id);
		if (objeto.isPresent()) {
			Especialidade espec = objeto.get();
//			this.deleteSintomas(espec.getSintomas());
			espec.getProfissoes().clear();
			espec.getSintomas().clear();
			this.repo.delete(espec);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Especialidade"));
		}
	}

	private void saveSintomas(Especialidade espec) {
		for (Sintoma sintoma : espec.getSintomas()) {
			if (sintoma.getId() == null) {
				sintoma.getEspecialidades().add(espec);
				this.sintomaService.save(sintoma);
			}
		}
	}

	private void deleteSintomas(List<Sintoma> sintomas) {
		for (Sintoma sintoma : sintomas) {
			if (sintoma.getId() != null) {
				sintoma.getEspecialidades().clear();
				this.sintomaService.delete(sintoma.getId());
			}
		}
	}
}
