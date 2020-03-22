package com.homecare.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Professional {

    private Long id;
    private String name;
    private String profession;

    public Professional(){ }

    public Professional(String name, String profession){
        this.name = name;
        this.profession = profession;
    }
}
