package com.homecare.model.entity.persons;

import com.homecare.model.abstracts.AbstractPerson;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "profissional")
public class Professional extends AbstractPerson {
    @Id
    @GeneratedValue
    private Long id;
//
//    @Column("quadro")
//    private List<Profession> professions = new LinkedList<Profession>();
//
//    @Column("quadro")
//    private List<Specialty> specialties = new LinkedList<Specialty>();

    public Professional(){}

    public  Professional(Person person){
        this.person = person;
    }

//    public Professional(Person person, List<Profession> professions){
//        this.person = person;
//        this.professions = professions;
//    }
//
//    public Professional(Person person, List<Profession> professions, List<Specialty> specialties){
//        this.person = person;
//        this.professions = professions;
//        this.specialties = specialties;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Profession> getProfessions() {
//        return professions;
//    }
//
//    public void setProfessions(List<Profession> professions) {
//        this.professions = professions;
//    }
//
//    public List<Specialty> getSpecialties() {
//        return specialties;
//    }
//
//    public void setSpecialties(List<Specialty> specialties) {
//        this.specialties = specialties;
//    }
}
