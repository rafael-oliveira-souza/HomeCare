package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Atendimento;
import br.com.homecare.models.entities.Curriculo;
import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.models.entities.Profissao;
import br.com.homecare.models.entities.Profissional;
import br.com.homecare.repositories.ProfissionalRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class ProfissionalService {
	
	@Autowired
	private ProfissionalRepository repo;

	@Autowired
	private AtendimentoService atendimentoService;
	
	@Autowired
	private ProfissaoService profissaoService;
	
	@Autowired
	private CurriculoService curriculoService;

	@Autowired
	private ModelMapper modelMapper;

	public Optional<Profissional> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Profissional> getAll() {
		return this.repo.findAll();
	}

	public Profissional save(Profissional entity) {
		try {
			entity = this.repo.save(entity);
			
			Curriculo curriculo = entity.getCurriculo();
			curriculo.setProfissional(entity);
			
			List<Atendimento> atendimentos = entity.getAtendimentos();
			for(Atendimento atendimento : atendimentos) {
				Pessoa pessoa = modelMapper.map(entity, Pessoa.class);
				atendimento.getPessoas().add(pessoa);
			}

			List<Profissao> profissoes = entity.getProfissoes();
			for (Profissao profissao: profissoes) {
				profissao.getProfissionais().add(entity);
			}
			
			this.curriculoService.save(curriculo);
			this.profissaoService.saveAll(profissoes);
			this.atendimentoService.saveAll(atendimentos);
			
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
	
	public Profissional update(Profissional entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissional> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Profissional"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Profissional> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrato("Profissional"));
        }
	}

}
