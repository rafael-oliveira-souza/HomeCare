package br.com.homecare.models.dtos;

import java.util.Date;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Atendimento;

public class AtendimentoDTO extends AbstractDTO<Atendimento>{
	private static final long serialVersionUID = 1L;
	
    private Long id;
    private Date data;
    private String descricao;
    private Long pacienteId;
    private Long profissionalId;


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

	public Long getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		this.pacienteId = pacienteId;
	}

	public Long getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(Long profissionalId) {
		this.profissionalId = profissionalId;
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
	
}
