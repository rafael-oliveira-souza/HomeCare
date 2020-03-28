package com.homecare.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profissao")
public class Profissao {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "tipo")
    private String type;

    @Column(name = "descricao")
    private String description;
}
