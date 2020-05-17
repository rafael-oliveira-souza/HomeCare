package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.homecare.commons.AbstractEntity;

@Entity
public class Profissao extends AbstractEntity<Profissao> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    private String tipo;

    private String descricao;

    @OneToMany(mappedBy="profissao")
    private List<Especialidade> especialidades;

    @ManyToOne
	@JoinColumn(name = "profissional_id")
    private Profissional profissional;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj, this.id);
	}
    
    

}
