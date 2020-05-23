package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Paciente;
import br.com.homecare.models.enums.TipoUsuarioEnum;
import br.com.homecare.repositories.PacienteRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class PacienteService {
	@Autowired
	private MedicamentoService medService;

	@Autowired
	private DoencaService doencaService;
	
	@Autowired
	private AtendimentoService atendimentoService;

	@Autowired
	private PacienteRepository repo;

	public Optional<Paciente> find(final Long id) {
		return this.repo.findById(id);
	}

	public List<Paciente> getAll() {
		return this.repo.findAll();
	}
	
	public List<Paciente> saveAll(List<Paciente> list) {
		 for(Paciente paciente : list) {
			 this.save(paciente);
		 }
		 
		 return list;
	}
	
	public Paciente save(Paciente entity) {
		try {
			entity.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
			this.atendimentoService.saveAll(entity.getAtendimentos());
			this.medService.saveAll(entity.getMedicamentos());
			this.doencaService.saveAll(entity.getDoencas());
			
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Paciente update(Paciente entity)  {
		if(entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Paciente> objeto = this.find(entity.getId());
        if(objeto.isPresent()){
			this.medService.saveAll(entity.getMedicamentos());
			this.doencaService.saveAll(entity.getDoencas());
             return this.repo.save(entity);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Paciente"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Paciente> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
        	Paciente paciente = objeto.get();
			this.medService.deleteAll(paciente.getMedicamentos());
			this.doencaService.deleteAll(paciente.getDoencas());
    		this.repo.delete(paciente);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Paciente"));
        }
	}
}
