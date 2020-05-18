package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
public class Profissional extends Pessoa {
	private static final long serialVersionUID = 1L;
	
    @OneToMany(mappedBy = "profissional")
    private List<Profissao> profissoes;

    @OneToOne(cascade = CascadeType.ALL, mappedBy="profissional")
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

}
