package br.com.homecare.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_atendimento")
public class PessoaAtendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long id;
	
	@Column(name = "atendimento_id", unique = false)
    private Long atendimentoId;
    

	@Column(name = "pessoa_id", unique = false)
    private Long pessoaId;
	
	public PessoaAtendimento() {}
	
	public PessoaAtendimento(Long pessoaId, Long atendId) {
		this.atendimentoId = atendId;
		this.pessoaId = pessoaId;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAtendimentoId() {
		return atendimentoId;
	}

	public void setAtendimentoId(Long atendimentoId) {
		this.atendimentoId = atendimentoId;
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}
}
