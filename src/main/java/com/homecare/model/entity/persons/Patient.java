package com.homecare.model.entity.persons;

import com.homecare.model.abstracts.AbstractPerson;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class Patient extends AbstractPerson {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "quadro")
    private String quadro;

    @Column(name = "diagnostico")
    private String diagnostico;

    public Patient(){}

    public Patient(Person person){
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
