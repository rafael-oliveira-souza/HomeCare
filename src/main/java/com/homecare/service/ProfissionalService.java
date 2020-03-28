package com.homecare.service;

import com.homecare.model.entity.Profissional;
import com.homecare.repository.ProfissionalRepository;

import javax.ejb.LocalBean;
import java.util.LinkedList;
import java.util.List;

@LocalBean
public class ProfissionalService extends ProfissionalRepository {

    public Profissional getById(Long id) {
        Profissional profissional = super.getById(id);

        return profissional;
    }

    public List<Profissional> getAll() {
        return new LinkedList<Profissional>();
    }

    public Profissional save(Profissional profissional) {
        return  super.save(profissional);
    }

}
