package com.homecare.service;

import com.homecare.model.entity.Professional;
import com.homecare.model.interfaces.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("professionalService")
public class ProfessionalService implements ServiceInterface<Professional> {

    @Override
    public Professional getById(Long id) {
        Professional profissional = new Professional("Rafael", "Teste");

        return profissional;
    }

    @Override
    public List<Professional> getAll() {
        return new LinkedList<Professional>();
    }
}
