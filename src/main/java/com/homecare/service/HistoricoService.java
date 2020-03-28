package com.homecare.service;

import com.homecare.model.entity.Historico;
import com.homecare.repository.HistoricoRepository;

import java.util.List;


public class HistoricoService extends HistoricoRepository {

    public Historico getById(Long id) {
        Historico historico = super.getById(id);

        return historico;
    }

    public List<Historico> getAll() {
        return super.getAll();
    }

    public Historico save(Historico Historico) {
        Historico historico = super.save(Historico);

        return historico;
    }

}
