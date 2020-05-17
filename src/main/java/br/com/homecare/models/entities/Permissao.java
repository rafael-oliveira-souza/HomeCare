package br.com.homecare.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.homecare.commons.AbstractEntity;

@Entity
public class Permissao extends AbstractEntity<Permissao> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String descricao;

    @ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
    
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
