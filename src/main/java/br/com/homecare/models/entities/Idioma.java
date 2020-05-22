package br.com.homecare.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.dtos.IdiomaDTO;
import br.com.homecare.models.enums.SituacaoIdiomaEnum;

@Entity
public class Idioma extends AbstractEntity<IdiomaDTO>{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "situacao", nullable = false)
    private Integer situacao;

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}

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
		return SituacaoIdiomaEnum.toEnum(this.situacao);
	}

	public void setSituacao(SituacaoIdiomaEnum situacao) {
		this.situacao = situacao.getCode();
	}
	
	
}
