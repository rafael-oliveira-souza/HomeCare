package com.homecare.repository;

import com.homecare.model.ManagerFactory;
import com.homecare.model.entity.persons.Person;
import com.homecare.model.interfaces.RepositoryInterface;

import javax.inject.Inject;
import java.util.List;

public class PersonRepository implements RepositoryInterface<Person> {

    @Inject
    private ManagerFactory<Person> em;

    @Override
    public Person getById(Long id) {
        return this.em.getById(Person.class, id);
    }

    @Override
    public List<Person> getAll() {
        return this.em.getAll(Person.class);
    }

    @Override
    public void delete(Person entity) {
        this.em.delete(entity);
    }

    @Override
    public Person update(Person entity) {
        return this.em.update(entity);
    }

    @Override
    public Person save(Person entity) {
        return this.em.save(entity);
    }
}
