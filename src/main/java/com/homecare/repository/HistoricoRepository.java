package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.Historico;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class HistoricoRepository implements RepositoryInterface<Historico> {

    @Inject
    private ManagerFactory<Historico> em;

    @Override
    public Historico getById(Long id) {
        return this.em.getById(Historico.class, id);
    }

    @Override
    public List<Historico> getAll() {
        return this.em.getAll(Historico.class);
    }

    @Override
    public void delete(Long id) {
        this.em.delete(Historico.class, id);
    }

    @Override
    public Historico update(Historico entity) {
        return this.em.update(entity);
    }

    @Override
    public Historico save(Historico entity) {
        return this.em.save(entity);
    }

}
