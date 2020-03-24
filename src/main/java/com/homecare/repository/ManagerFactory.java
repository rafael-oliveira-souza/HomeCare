package com.homecare.repository;

import com.homecare.model.abstracts.AbstractEntity;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Singleton
public abstract class ManagerFactory <T> {
    private EntityManager entityManager;
    private T entity;

    public EntityManager getEntityManager(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("cedes160");

        return fabrica.createEntityManager();
    }

    public T getById(Long id) {
        this.entityManager  = this.getEntityManager();
        return (T)entityManager.find(this.entity.getClass(), id);
    }

    public T save(T entity) {
        this.entityManager  = this.getEntityManager();
        entityManager.persist(entity);

        return entity;
    }


    public T update(T entity) {
        this.entityManager  = this.getEntityManager();
        return entityManager.merge(entity);
    }

    public void delete(T entity) {
        this.entityManager  = this.getEntityManager();
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.merge(entity);
        }
    }
}