package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.persons.Professional;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class ProfessionalRepository implements RepositoryInterface<Professional> {

    @Inject
    private ManagerFactory<Professional> em;

    @Override
    public Professional getById(Long id) {
        return this.em.getById(Professional.class, id);
    }

    @Override
    public List<Professional> getAll() {
        return this.em.getAll(Professional.class);
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
