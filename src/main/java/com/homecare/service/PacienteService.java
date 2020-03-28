package com.homecare.service;

import com.homecare.model.entity.Historico;
import com.homecare.model.entity.Paciente;
import com.homecare.repository.PacienteRepository;

import java.util.List;


public class PacienteService extends PacienteRepository {

    public Paciente getById(Long id) {
        Paciente paciente = super.getById(id);

        return paciente;
    }

    public List<Paciente> getAll() {
        return super.getAll();
    }

    public Paciente save(Paciente paciente) {
        return  super.save(paciente);
    }

    public List<Historico> getHistoricoByPaciente(Long id){
        return super.getHistoricoByPaciente(id);
    }

}
