package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.Pessoa;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class PessoaRepository implements RepositoryInterface<Pessoa> {

    @Inject
    private ManagerFactory<Pessoa> em;

    @Override
    public Pessoa getById(Long id) {
        return this.em.getById(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> getAll() {
        return this.em.getAll(Pessoa.class);
    }

    @Override
    public void delete(Long id) {
        this.em.delete(Pessoa.class, id);
    }

    @Override
    public Pessoa update(Pessoa entity) {
        return this.em.update(entity);
    }

    @Override
    public Pessoa save(Pessoa entity) {
        return this.em.save(entity);
    }
}
