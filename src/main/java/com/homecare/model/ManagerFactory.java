package com.homecare.model;

import com.homecare.config.interceptor.TransactionalInterceptor;
import com.homecare.utils.exceptions.custom.ErrorResouceException;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Interceptors(TransactionalInterceptor.class)
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
        this.openTransaction();
        T entity = entityManager.find(classe, id);
        entityManager.close();

        return entity;
    }

    public List<T> getAll(Class<T> classe) {
        this.openTransaction();
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
        this.openTransaction();
        entityManager.persist(entity);
        this.closeTransaction();

        return entity;
    }

    public T update(T entity) {
        this.verifyObject(entity);
        this.openTransaction();
        entityManager.merge(entity);
        this.closeTransaction();

        return  entity;
    }
    
    public void delete(Class<T> classe, Long id)  {
        this.openTransaction();
        T entity = entityManager.find(classe, id);
        this.verifyObject(entity);
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.merge(entity);
        }
        this.closeTransaction();
    }

    private void openTransaction(){
        entityManager  = this.getEntityManager();
        entityManager.getTransaction().begin();
    }

    private void closeTransaction(){
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    private void verifyObject(Object obj){
        if(obj == null){
            throw new ErrorResouceException();
        }
    }
}