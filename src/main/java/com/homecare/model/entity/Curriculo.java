package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "curriculo")
public class Curriculo {
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
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Educacao> educacao;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Experiencia> experiencia;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Idioma> idioma;
}
