package com.homecare.model.entity;

import com.homecare.model.abstracts.AbstractPerson;

public class Patient extends Person {
    private String exams;

    public Patient(){}

    public Patient(Person person){
//        this.person = person;
    }

    public String getExams() {
        return exams;
    }

    public void setExams(String exams) {
        this.exams = exams;
    }
}
