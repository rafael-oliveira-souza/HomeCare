package com.homecare.model.entity;

import com.homecare.model.enums.TipoUsuarioEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", unique = true, length = 14, nullable = false)
    private String cpf;

    @Column(name = "altura", length = 3)
    private Double altura;

    @Column(name = "peso", length = 3)
    private Double peso;

    @Column(name = "idade", length = 3)
    private Integer idade;

    @Column(name = "genero", length = 1)
    private char genero;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "tipo_usuario", length = 1, nullable = false)
    private TipoUsuarioEnum tipoUsuario;

}
