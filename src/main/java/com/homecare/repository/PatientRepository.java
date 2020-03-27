package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.persons.Patient;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class PatientRepository implements RepositoryInterface<Patient> {

    @Inject
    private ManagerFactory<Patient> em;

    @Override
    public Patient getById(Long id) {
        return this.em.getById(Patient.class, id);
    }

    @Override
    public List<Patient> getAll() {
        return null;
    }

    @Override
    public void delete(Patient entity) {
        this.em.delete(entity);
    }

    @Override
    public Patient update(Patient entity) {
        return this.em.update(entity);
    }

    @Override
    public Patient save(Patient entity) {
        return this.em.save(entity);
    }
}
