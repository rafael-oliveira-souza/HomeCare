package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Paciente extends Pessoa {
	private static final long serialVersionUID = 1L;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "paciente_doenca", joinColumns = @JoinColumn(name = "paciente_id"), inverseJoinColumns = @JoinColumn(name = "doenca_id"))
	private List<Doenca> doencas = new ArrayList<Doenca>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "paciente_medicamento", joinColumns = @JoinColumn(name = "paciente_id"), inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
	 private List<Medicamento> medicamentos = new ArrayList<Medicamento>(0);

	public Paciente() {
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

	@JsonIgnore
	public Pessoa getPessoa() {
		Pessoa pessoa = super.getPessoa();
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
		
		return pessoa;
	}


	@JsonIgnore	
	public void setPessoa(Pessoa pessoa) {
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
		super.setPessoa(pessoa);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.getId());
	}
}
