package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Curriculo;
import br.com.homecare.models.entities.Educacao;
import br.com.homecare.models.entities.Experiencia;
import br.com.homecare.models.entities.Idioma;
import br.com.homecare.repositories.CurriculoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class CurriculoService {
	
	@Autowired
	private CurriculoRepository repo;

	@Autowired
	private ExperienciaService experienciaService;

	@Autowired
	private EducacaoService educacaoService;

	@Autowired
	private IdiomaService idiomaService;
	
	public Optional<Curriculo> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Curriculo> getAll() {
		return this.repo.findAll();
	}

	public Curriculo save(Curriculo entity) {
		try {
			entity = this.repo.save(entity);
			
			List<Experiencia> experiencias = entity.getExperiencia();
			for(Experiencia experiencia : experiencias) {
				experiencia.setCurriculo(entity);
			}

			List<Educacao> educacoes = entity.getEducacao();
			for(Educacao educacao : educacoes) {
				educacao.setCurriculo(entity);
			}
			
			List<Idioma> idiomas = entity.getIdioma();
			for(Idioma idioma : idiomas) {
				idioma.setCurriculo(entity);
			}
			
			this.idiomaService.saveAll(idiomas);
			this.educacaoService.saveAll(educacoes);
			this.experienciaService.saveAll(experiencias);

			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Curriculo update(Curriculo entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Curriculo> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Curriculo"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Curriculo> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Curriculo"));
        }
	}

}
