package br.com.homecare.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "dataInicio")
    private Date dataInicio;

    @Column(name = "dataFim")
    private Date dataFim;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
