package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
@Table(name = "profissional")
public class Profissional extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "profissional_profissao", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "profissao_id"))
	private List<Profissao> profissoes = new ArrayList<Profissao>(0);

	@JsonManagedReference
	@OneToOne(mappedBy = "profissional", cascade = CascadeType.ALL)
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
		Pessoa pessoa = super.getPessoa();
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		
		return pessoa;
	}

	@JsonIgnore	
	public void setPessoa(Pessoa pessoa) {
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		super.setPessoa(pessoa);
	}

}
