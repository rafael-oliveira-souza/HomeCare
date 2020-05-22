package br.com.homecare.models.dtos;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Idioma;
import br.com.homecare.models.enums.SituacaoIdiomaEnum;

public class IdiomaDTO extends AbstractDTO<Idioma>{
	private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private SituacaoIdiomaEnum situacao;

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

	public SituacaoIdiomaEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoIdiomaEnum situacao) {
		this.situacao = situacao;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
	
}
