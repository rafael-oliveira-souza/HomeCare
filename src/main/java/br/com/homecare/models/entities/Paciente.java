package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
public class Paciente extends Pessoa {
	private static final long serialVersionUID = 3271111213059443885L;

	@ManyToMany(mappedBy = "pacientes")
    private List<Doenca> doencas = new ArrayList<Doenca>();
	
	@ManyToMany(mappedBy = "pacientes")
    private List<Medicamento> medicamentos = new ArrayList<Medicamento>();

	public Paciente() {
		this.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
	}
	
	public Paciente(builder builder) {
		this.medicamentos = builder.medicamentos;
		this.doencas = builder.doencas;
		this.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.setId(pessoa.getId());
		this.setCpf(pessoa.getCpf());
		this.setNome(pessoa.getNome());
		this.setPeso(pessoa.getPeso());
		this.setIdade(pessoa.getIdade());
		this.setEmail(pessoa.getEmail());
		this.setGenero(pessoa.getGenero());
		this.setAltura(pessoa.getAltura());
		this.setTelefone(pessoa.getTelefone());
		this.setEndereco(pessoa.getEndereco());
		this.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
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
