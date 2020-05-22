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
import br.com.homecare.models.dtos.SintomaDTO;

@Entity
public class Sintoma extends AbstractEntity<SintomaDTO> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;
	
	@ManyToMany
	@JoinTable(	name="especialidade_sintoma", 
				joinColumns = @JoinColumn(name="especialidade_id"),
				inverseJoinColumns = @JoinColumn(name="sintoma_id")
	)
	private List<Especialidade> especialidades = new ArrayList<Especialidade>(0);

	@ManyToMany
	@JoinTable(	name="doenca_sintoma", 
				joinColumns = @JoinColumn(name="doenca_id"),
				inverseJoinColumns = @JoinColumn(name="sintoma_id")
	)
	private List<Doenca> doencas = new ArrayList<Doenca>(0);

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

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}


}
