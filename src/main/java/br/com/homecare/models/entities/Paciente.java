package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Paciente extends Pessoa {
	private static final long serialVersionUID = 1L;

	@CollectionTable(name = "paciente_doenca")
    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "doenca_id")
	private List<Doenca> doencas = new ArrayList<Doenca>(0);

	@CollectionTable(name = "paciente_medicamento")
    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "medicamento_id")
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
		Pessoa pessoa = new Pessoa();
		pessoa.setId(this.getId());
		pessoa.setCpf(this.getCpf());
		pessoa.setNome(this.getNome());
		pessoa.setPeso(this.getPeso());
		pessoa.setIdade(this.getIdade());
		pessoa.setEmail(this.getEmail());
		pessoa.setGenero(this.getGenero());
		pessoa.setAltura(this.getAltura());
		pessoa.setTelefone(this.getTelefone());
		pessoa.setEndereco(this.getEndereco());
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
		pessoa.setAtendimentos(this.getAtendimentos());
		
		return pessoa;
	}


	@JsonIgnore	
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
		this.setAtendimentos(pessoa.getAtendimentos());
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj, this.getId());
	}
}
