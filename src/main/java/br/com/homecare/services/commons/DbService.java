package br.com.homecare.services.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.models.entities.Paciente;
import br.com.homecare.models.enums.GeneroEnum;
import br.com.homecare.services.PacienteService;

@Service
public class DbService {
	
	@Autowired
	private PacienteService pacienteService;

	public void initializeDatabase() {
		Paciente paciente = new Paciente();
		paciente.setAltura(1.89);
		paciente.setNome("Rafael Souza");
		paciente.setCpf("000.000.000-32");
		paciente.setGenero(GeneroEnum.MASCULINO);
		paciente.setPeso(80.0);
		paciente.setEmail("rafael@gmail.com");
		paciente.setIdade(26);
		paciente.setTelefone("(61)99232-2323");
		
		this.pacienteService.save(paciente);
	}
}
