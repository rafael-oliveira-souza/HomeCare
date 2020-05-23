package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Profissional extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	@CollectionTable(name = "profissional_profissao")
    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "profissao_id")
    private List<Profissao> profissoes = new ArrayList<Profissao>(0);

    @JsonManagedReference
    @OneToOne(mappedBy="profissional", cascade = CascadeType.ALL)
    private Curriculo curriculo;

	public List<Profissao> getProfissoes() {
		return profissoes;
	}

	public void setProfissoes(List<Profissao> profissoes) {
		this.profissoes = profissoes;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
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
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		
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
		this.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
	}
  	
}
