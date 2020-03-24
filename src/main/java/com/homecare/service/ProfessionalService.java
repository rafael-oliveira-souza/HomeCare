package com.homecare.service;

import com.homecare.model.entity.Patient;
import com.homecare.model.entity.Person;
import com.homecare.model.entity.Professional;
import com.homecare.model.interfaces.AbstractInterface;

import javax.ejb.LocalBean;
import java.util.LinkedList;
import java.util.List;

@LocalBean
public class ProfessionalService {

    @Override
    public Professional getById(Long id) {
        Person patient = new Patient();
        patient.ge

        Professional profissional = new Professional(new Person());
//        profissional.cadastrar();

        return profissional;
    }

    @Override
    public List<Professional> getAll() {
        return new LinkedList<Professional>();
    }
}
