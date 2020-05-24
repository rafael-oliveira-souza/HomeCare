package br.com.homecare.models.dtos;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Sintoma;

public class SintomaDTO extends AbstractDTO<Sintoma>{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String descricao;
	
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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
