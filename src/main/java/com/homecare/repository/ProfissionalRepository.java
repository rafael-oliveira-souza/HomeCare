package com.homecare.repository;

import com.homecare.model.abstracts.AbstractEntity;
import com.homecare.model.entity.Professional;
import com.homecare.model.interfaces.AbstractInterface;

import javax.inject.Inject;
import java.util.List;

public class ProfissionalRepository implements AbstractInterface<Professional> {

    @Inject
    private ManagerFactory<Professional> em;

    @Override
    public Professional getById(Long id) {
        return this.em.getById(id);
    }

    @Override
    public List<Professional> getAll() {
        return null;
    }

    @Override
    public void delete(Professional entity) {
        this.em.delete(entity);
    }

    @Override
    public Professional update(Professional entity) {
        return this.em.update(entity);
    }

    @Override
    public Professional save(Professional entity) {
        return this.em.save(entity);
    }
}
