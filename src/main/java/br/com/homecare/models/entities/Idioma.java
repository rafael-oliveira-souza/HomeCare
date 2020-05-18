package br.com.homecare.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.homecare.models.enums.SituacaoIdiomaEnum;

@Entity
public class Idioma {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "situacao", nullable = false)
    private SituacaoIdiomaEnum situacao;

    @ManyToOne
    @JsonBackReference
	@JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public SituacaoIdiomaEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoIdiomaEnum situacao) {
		this.situacao = situacao;
	}
}
