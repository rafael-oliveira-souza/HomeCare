package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Profissional;
import br.com.homecare.models.enums.TipoUsuarioEnum;
import br.com.homecare.repositories.ProfissionalRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class ProfissionalService {

	@Autowired
	private ProfissionalRepository repo;

	@Autowired
	private CurriculoService curriculoService;

	public Optional<Profissional> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Profissional> getAll() {
		return this.repo.findAll();
	}
	
	public List<Profissional> saveAll(List<Profissional> entity) {
		for (Profissional profissional: entity) {
			this.save(profissional);
		}
		
		return entity;
	}
	
	public Profissional save(Profissional entity) {
		try {
			entity.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
			entity = this.repo.save(entity);
			
			entity.getCurriculo().setProfissional(entity);
			this.curriculoService.save(entity.getCurriculo());
			
			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e);
		}
	}

	public Profissional update(Profissional entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Profissional> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			this.curriculoService.update(entity.getCurriculo());
			return this.repo.save(entity);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Profissional"));
		}
	}

	public void delete(final Long id) {
		if (id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Profissional> objeto = this.repo.findById(id);
		if (objeto.isPresent()) {
			Profissional prof = objeto.get();
			this.curriculoService.delete(prof.getId());
			this.repo.delete(prof);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Profissional"));
		}
	}

	public Page<Profissional> findPage(Integer nrPagina, Integer nrLinhas, String ordenaPor, String direcao) {
		Pageable page = PageRequest.of(nrPagina, nrLinhas, Sort.by(Direction.valueOf(direcao), ordenaPor));
		
		return repo.findAll(page);
	}

}
