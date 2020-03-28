package com.homecare.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "historicoo")
public class Historico {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

//    @ManyToOne
//    private Paciente paciente;

    public Historico(){}
}
