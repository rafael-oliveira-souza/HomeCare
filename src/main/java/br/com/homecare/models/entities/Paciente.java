package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Paciente extends Pessoa {
	private static final long serialVersionUID = 3271111213059443885L;

	@OneToMany(mappedBy = "paciente")
    private List<Doenca> doencas;

    @OneToMany(mappedBy = "paciente")
    private List<Medicamento> medicamentos;

	public Paciente() {}
	
	public Paciente(builder builder) {
		this.medicamentos = builder.medicamentos;
		this.doencas = builder.doencas;
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
	    private List<Doenca> doencas;
	    private List<Medicamento> medicamentos;

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
