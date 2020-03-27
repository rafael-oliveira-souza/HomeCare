package com.homecare.model;

import com.homecare.model.interfaces.RepositoryInterface;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ManagerFactory<T> {
    private EntityManager entityManager;

    @Produces
    @RequestScoped
    public EntityManager getEntityManager(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("homecare");

        return fabrica.createEntityManager();
    }

    public T getById(Class<T> classe, Long id) {
        T entity = null;

        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        entity = entityManager.find(classe, id);
        entityManager.close();

        return entity;
    }

    public List<T> getAll() {
        return null;
    }

    public T save(T entity) {
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();

        return entity;
    }

    public T update(T entity) {
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();

        return  entity;
    }

    public void delete(T entity) {
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.merge(entity);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}