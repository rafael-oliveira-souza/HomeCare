package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.Historico;
import com.homecare.model.entity.Paciente;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.List;

public class PacienteRepository implements RepositoryInterface<Paciente> {

    @Inject
    private ManagerFactory<Paciente> em;

    @Override
    public Paciente getById(Long id) {
        return this.em.getById(Paciente.class, id);
    }

    @Override
    public List<Paciente> getAll() {
        return this.em.getAll(Paciente.class);
    }

    @Override
    public void delete(Long id) {
        this.em.delete(Paciente.class, id);
    }

    @Override
    public Paciente update(Paciente entity) {
        return this.em.update(entity);
    }

    @Override
    public Paciente save(Paciente entity) {
        return this.em.save(entity);
    }

    public List<Historico> getHistoricoByPaciente(Long id){
        TypedQuery<Historico> typed = em.getEntityManager()
                .createQuery("SELECT h FROM  Historico h WHERE id =: id ", Historico.class)
                .setParameter("id", id);

        return typed.getResultList();
    }
}
