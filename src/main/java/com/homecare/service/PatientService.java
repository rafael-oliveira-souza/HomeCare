package com.homecare.service;

import com.homecare.model.entity.persons.Patient;
import com.homecare.repository.PatientRepository;

import java.util.LinkedList;
import java.util.List;


public class PatientService extends PatientRepository {

    public Patient getById(Long id) {
        Patient paciente = super.getById(id);

        return paciente;
    }

    public List<Patient> getAll() {
        return new LinkedList<Patient>();
    }

    public Patient save(Patient Patient) {
        Patient paciente = super.save(Patient);

        return paciente;
    }

}
