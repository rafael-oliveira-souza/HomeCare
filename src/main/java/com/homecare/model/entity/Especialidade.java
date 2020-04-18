package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "especialidade")
public class Especialidade {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descricao")
    private String descricao;

}