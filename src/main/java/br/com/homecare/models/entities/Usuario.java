package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.homecare.commons.AbstractEntity;

@Entity
public class Usuario extends AbstractEntity<Usuario> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "email")
    private String email;

	@Column(name = "senha")
	private String senha;

    @OneToMany(mappedBy = "usuario")
	private List<Permissao> permissoes = new ArrayList<Permissao>();

	public Usuario() {}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
