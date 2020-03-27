package com.homecare.model.entity.persons;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Person {
    @Id
    @GeneratedValue
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

    public Person(){
        this.height = 1.67;
        this.weight = 80.0;
        this.age = 43;
        this.gender = "M";
        this.name = "JOAO TESTE";
        this.mail = "teste";
        this.phone = "teste";
        this.address = "teste";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
