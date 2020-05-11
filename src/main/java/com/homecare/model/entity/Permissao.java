package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import static com.homecare.utils.messages.ExceptionMessages.CAMPO_VAZIO;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "permissao")
public class Permissao {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank(message = CAMPO_VAZIO)
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @NotBlank(message = CAMPO_VAZIO)
    @Column(name = "descricao", nullable = false)
    private String descricao;
}