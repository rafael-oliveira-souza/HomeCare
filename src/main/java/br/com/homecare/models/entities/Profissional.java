package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
public class Profissional extends Pessoa {
	private static final long serialVersionUID = 1L;

    @ManyToMany(mappedBy = "profissionais")
    private List<Profissao> profissoes = new ArrayList<Profissao>();

    @JsonManagedReference
    @OneToOne(mappedBy="profissional")
    private Curriculo curriculo;
    
    public Profissional(){
		this.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
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
		this.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
