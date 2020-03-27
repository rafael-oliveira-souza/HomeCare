package com.homecare.service;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.persons.Professional;
import com.homecare.repository.ProfessionalRepository;

import javax.ejb.LocalBean;
import java.util.LinkedList;
import java.util.List;

@LocalBean
public class ProfessionalService extends ProfessionalRepository {

    public Professional getById(Long id) {
        Professional profissional = super.getById(id);

        return profissional;
    }

    public List<Professional> getAll() {
        return new LinkedList<Professional>();
    }

    public Professional save(Professional professional) {
        Professional profissional = super.save(professional);

        return profissional;
    }

}
