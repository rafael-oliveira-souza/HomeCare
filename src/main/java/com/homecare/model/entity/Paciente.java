package com.homecare.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
//
//    @OneToMany
//    @JoinTable(name = "historicoo", joinColumns = @JoinColumn(name = "id"))
//    private Collection<Historico> historicos;

    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

    public Paciente(){}

}
