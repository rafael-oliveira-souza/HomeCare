package com.homecare.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "paciente")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 3271111213059443885L;

	@Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "fk_pac_pes"))
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id")
    private List<Doenca> doencas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="paciente_id")
    private List<Medicamento> medicamentos;

	public Paciente() {}
	
	public Paciente(builder builder) {
		this.pessoa = builder.pessoa;
		this.id = builder.id;
		this.medicamentos = builder.medicamentos;
		this.doencas = builder.doencas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public static class builder {
	    private Long id;
	    private Pessoa pessoa;
	    private List<Doenca> doencas;
	    private List<Medicamento> medicamentos;

		public builder pessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
			return this;
		}

		public builder id(Long id) {
			this.id = id;
			return this;
		}
		 
		public builder medicamentos(List<Medicamento> medicamentos) {
			this.medicamentos = medicamentos;
			return this;
		}
		
		public builder doencas(List<Doenca> doencas) {
			this.doencas = doencas;
			return this;
		}
		
		public Paciente build() {
			return new Paciente(this);
		}
	}

}
