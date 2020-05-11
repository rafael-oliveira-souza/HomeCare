package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.Usuario;

import javax.inject.Inject;

public class LoginRepository {

    @Inject
    private ManagerFactory<Usuario> em;

    public void delete(Long id) {
        this.em.delete(Usuario.class, id);
    }

    public Usuario update(Usuario entity) {
        return this.em.update(entity);
    }

    public Usuario save(Usuario entity) {
        return this.em.save(entity);
    }
}
