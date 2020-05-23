
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
			if(sintoma.getId() == null) {
				this.save(sintoma);
			}
		}

		return list;
	}

	public void deleteAll(List<Sintoma> list) {
		for (Sintoma sintoma : list) {
			if(sintoma.getId() != null) {
				this.delete(sintoma.getId());
			}
		}
	}

	public Sintoma save(Sintoma entity) {
		try {
			entity = this.repo.save(entity);
			this.saveEspecialidades(entity);
			this.saveDoencas(entity);

			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}

	public Sintoma update(Sintoma entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Sintoma> objeto = this.find(entity.getId());
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

		Optional<Sintoma> objeto = this.repo.findById(id);
		if (objeto.isPresent()) {
			Sintoma sintoma = objeto.get();
			this.deleteEspecialidades(sintoma.getEspecialidades());
			this.repo.delete(sintoma);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Especialidade"));
		}
	}

	private void saveEspecialidades(Sintoma sintoma) {
		for (Especialidade espec : sintoma.getEspecialidades()) {
			if (espec.getId() == null) {
				espec.getSintomas().add(sintoma);
				this.especService.save(espec);
			}
		}
	}

	private void saveDoencas(Sintoma sintoma) {
		for (Doenca doenca : sintoma.getDoencas()) {
			if (doenca.getId() == null) {
				doenca.getSintomas().add(sintoma);
				this.doencaService.save(doenca);
			}
		}
	}

	private void deleteEspecialidades(List<Especialidade> especialidades) {
		for (Especialidade espec : especialidades) {
			if (espec.getId() != null) {
				espec.getSintomas().clear();
				this.especService.delete(espec.getId());
			}
		}
	}

}
