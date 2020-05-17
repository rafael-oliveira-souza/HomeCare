package br.com.homecare.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Educacao {
    @Id
    @GeneratedValue
    private Long id;
}
