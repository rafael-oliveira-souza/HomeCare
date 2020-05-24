package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Especialidade;

public class EspecialidadeDTO extends AbstractDTO<Especialidade>{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String descricao;
	private List<SintomaDTO> sintomas = new ArrayList<SintomaDTO>();
	
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

	public List<SintomaDTO> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<SintomaDTO> sintomas) {
		this.sintomas = sintomas;
	}

}
