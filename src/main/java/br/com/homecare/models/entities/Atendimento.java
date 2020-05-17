package br.com.homecare.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @ManyToOne
	@JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
}
