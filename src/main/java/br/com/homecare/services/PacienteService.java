package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Doenca;
import br.com.homecare.models.entities.Medicamento;
import br.com.homecare.models.entities.Paciente;
import br.com.homecare.repositories.DoencaRepository;
import br.com.homecare.repositories.MedicamentoRepository;
import br.com.homecare.repositories.PacienteRepository;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class PacienteService {
	@Autowired
	private MedicamentoRepository medRepo;

	@Autowired
	private DoencaRepository doencaRepo;

	@Autowired
	private PacienteRepository repo;

	public Optional<Paciente> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Paciente> getAll() {
		return this.repo.findAll();
	}

	public Paciente salvar(Paciente entity) {
		try {
//			entity = this.repo.save(entity);
//
//			List<Doenca> doencas = entity.getDoencas();
//			List<Medicamento> medicamentos = entity.getMedicamentos();
//			for(Medicamento medicamento : medicamentos) {
//				medicamento.getPacientes().add(entity);
//			}
////
//			for (Doenca doenca: doencas) {
//				doenca.getPacientes().add(entity);
//			}
//			this.medRepo.saveAll(medicamentos);
//			this.doencaRepo.saveAll(doencas);
			
			entity = this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return entity;
	}
}
