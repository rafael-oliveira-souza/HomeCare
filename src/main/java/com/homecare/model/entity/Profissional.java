package com.homecare.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profissional")
public class Profissional {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;
//
//    @Column("quadro")
//    private List<Profissao> professions = new LinkedList<Profissao>();
//
//    @Column("quadro")
//    private List<Especialidade> specialties = new LinkedList<Especialidade>();

    public Profissional(){}

    public  Profissional(Pessoa pessoa){
        this.pessoa = pessoa;
    }

//    public Profissional(Pessoa pessoa, List<Profissao> professions){
//        this.pessoa = pessoa;
//        this.professions = professions;
//    }
//
//    public Profissional(Pessoa pessoa, List<Profissao> professions, List<Especialidade> specialties){
//        this.pessoa = pessoa;
//        this.professions = professions;
//        this.specialties = specialties;
//    }

//    public List<Profissao> getProfissaos() {
//        return professions;
//    }
//
//    public void setProfissaos(List<Profissao> professions) {
//        this.professions = professions;
//    }
//
//    public List<Especialidade> getSpecialties() {
//        return specialties;
//    }
//
//    public void setSpecialties(List<Especialidade> specialties) {
//        this.specialties = specialties;
//    }
}
