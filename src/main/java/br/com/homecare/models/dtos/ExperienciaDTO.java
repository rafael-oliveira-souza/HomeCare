package br.com.homecare.models.dtos;

import java.util.Date;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Experiencia;

public class ExperienciaDTO extends AbstractDTO<Experiencia>{
	private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String funcao;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;

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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
	
}
