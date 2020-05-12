package br.com.homecare.models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
	private Long id;

//    @Column(name = "email", nullable = false)
	private String email;

//    @Column(name = "senha", nullable = false)
	private String senha;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="pessoa_id")
//	private List<String> permissoes = new ArrayList<String>();

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
//	public List<String> getPermissoes() {
//		return permissoes;
//	}
//	public void setPermissoes(List<String> permissoes) {
//		this.permissoes = permissoes;
//	}
}
