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

import br.com.homecare.commons.AbstractEntity;

@Entity
public class Sintoma extends AbstractEntity<Sintoma> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@ManyToMany
	@JoinTable(	name="sintoma_especialidade", 
				joinColumns = @JoinColumn(name="especialidade_id"),
				inverseJoinColumns = @JoinColumn(name="sintoma_id")
	)
	private List<Especialidade> especialidades = new ArrayList<Especialidade>();

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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}


}
