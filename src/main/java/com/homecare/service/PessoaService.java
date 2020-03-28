package com.homecare.service;

import com.homecare.model.entity.Pessoa;
import com.homecare.repository.PessoaRepository;

import java.util.List;


public class PessoaService extends PessoaRepository {

    @Override
    public Pessoa getById(Long id) {
        Pessoa pessoa = super.getById(id);

        return pessoa;
    }

    @Override
    public List<Pessoa> getAll() {
        return super.getAll();
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return super.save(pessoa);
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        return super.update(pessoa);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }
}
