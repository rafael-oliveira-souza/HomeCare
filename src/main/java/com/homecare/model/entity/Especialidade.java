package com.homecare.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "especialidade")
public class Especialidade {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

}
