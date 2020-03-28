package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.Profissional;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class ProfissionalRepository implements RepositoryInterface<Profissional> {

    @Inject
    private ManagerFactory<Profissional> em;

    @Override
    public Profissional getById(Long id) {
        return this.em.getById(Profissional.class, id);
    }

    @Override
    public List<Profissional> getAll() {
        return this.em.getAll(Profissional.class);
    }

    @Override
    public void delete(Long id) {
        this.em.delete(Profissional.class, id);
    }

    @Override
    public Profissional update(Profissional entity) {
        return this.em.update(entity);
    }

    @Override
    public Profissional save(Profissional entity) {
        return this.em.save(entity);
    }
}
