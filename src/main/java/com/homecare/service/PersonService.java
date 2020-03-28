package com.homecare.service;

import com.homecare.model.entity.persons.Person;
import com.homecare.repository.PersonRepository;

import java.util.LinkedList;
import java.util.List;


public class PersonService extends PersonRepository {

    public Person getById(Long id) {
        Person person = super.getById(id);

        return person;
    }

    public List<Person> getAll() {
        return super.getAll();
    }

    public Person save(Person Person) {
        Person person = super.save(Person);

        return person;
    }

}
