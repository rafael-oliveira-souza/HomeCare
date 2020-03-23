package com.homecare.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Professional {

    private Long id;

    private Profession profession;
    private Person person;

    public Professional(){ }

    public Professional(Person person, Profession profession){
        this.profession = profession;
        this.person = person;
    }
}
