package com.homecare.model.entity.persons;

import javax.persistence.*;

@Entity
@Table(name = "especialidade")
public class Specialty {
    @Id
    @GeneratedValue
    private Long id;

}
