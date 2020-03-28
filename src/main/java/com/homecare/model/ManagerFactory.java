package com.homecare.model;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
        this.verifyObject(id);
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        T entity = entityManager.find(classe, id);
        entityManager.close();

        return entity;
    }

    public List<T> getAll(Class<T> classe) {
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(classe);
        Root<T> rootEntry = cq.from(classe);
        CriteriaQuery<T> all = cq.select(rootEntry);
        List<T> listAll = entityManager.createQuery(all).getResultList();
        entityManager.close();

        return listAll;
    }

    public T save(T entity) {
        this.verifyObject(entity);
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();

        return entity;
    }

    public T update(T entity) {
        this.verifyObject(entity);
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();

        return  entity;
    }

    public void delete(Class<T> classe, Long id)  {
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
        T entity = entityManager.find(classe, id);
        this.verifyObject(entity);
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.merge(entity);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    private void verifyObject(Object obj){
        if(obj == null){
            throw new NullPointerException();
        }
    }
}