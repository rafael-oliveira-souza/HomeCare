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
@Table(name = "profissional_profissao")
public class ProfissionalProfissao {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "profissional_id", nullable = false)
    private Long profissional;

    @Column(name = "profissao_id",nullable = false)
    private Long profissao;
}
