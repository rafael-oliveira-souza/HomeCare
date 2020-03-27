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
