package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.dtos.EspecialidadeDTO;

@Entity
public class Especialidade extends AbstractEntity<EspecialidadeDTO> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@ManyToMany(mappedBy = "especialidades")
	private List<Sintoma> sintomas = new ArrayList<Sintoma>(0);
	
    @JsonIgnore
	@ManyToMany
	@JoinTable(	name="profissao_especialidade", 
				joinColumns = @JoinColumn(name="profissao_id"),
				inverseJoinColumns = @JoinColumn(name="especialidade_id")
	)
	private List<Profissao> profissoes = new ArrayList<Profissao>();


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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public List<Sintoma> getSintomas() {
		return sintomas;
	}


	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}


	public List<Profissao> getProfissoes() {
		return profissoes;
	}


	public void setProfissoes(List<Profissao> profissoes) {
		this.profissoes = profissoes;
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}

}
