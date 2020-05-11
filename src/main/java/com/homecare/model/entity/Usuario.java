package com.homecare.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.List;

import static com.homecare.utils.messages.ExceptionMessages.CAMPO_VAZIO;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank(message = CAMPO_VAZIO)
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = CAMPO_VAZIO)
    @Column(name = "senha", nullable = false)
    private String senha;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="usuario_id")
    private List<Permissao> permissoes;
}
