package com.homecare.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "altura")
    private Double height;

    @Column(name = "peso")
    private Double weight;

    @Column(name = "idade")
    private Integer age;

    @Column(name = "genero")
    private String gender;

    @Column(name = "email")
    private String mail;

    @Column(name = "telefone")
    private String phone;

    @Column(name = "endereco")
    private String address;

}
