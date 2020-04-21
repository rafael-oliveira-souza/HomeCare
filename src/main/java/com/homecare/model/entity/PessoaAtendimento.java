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
@Table(name = "pessoa_atendimento")
public class PessoaAtendimento {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "pessoa_id", nullable = false)
    private Long pessoa;

    @Column(name = "atendimento_id", nullable = false)
    private Long atendimento;
}
