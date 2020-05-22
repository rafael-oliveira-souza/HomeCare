package br.com.homecare.models.dtos;

import java.util.Date;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Atendimento;

public class AtendimentoDTO extends AbstractDTO<Atendimento>{
	private static final long serialVersionUID = 1L;
	
    private Long id;
    private Date data;
    private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
