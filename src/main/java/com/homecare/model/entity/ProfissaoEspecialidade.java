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
@Table(name = "profissao_especialidade")
public class ProfissaoEspecialidade {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "especialidade_id")
    private Long especialidade;

    @Column(name = "profissao_id")
    private Long profissao;
}
