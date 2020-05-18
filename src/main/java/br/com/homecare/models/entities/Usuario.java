package br.com.homecare.models.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.enums.PerfilEnum;

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

	@CollectionTable(name = "perfil")
    @ElementCollection( fetch = FetchType.EAGER)
	private Set<PerfilEnum> perfis = new HashSet<PerfilEnum>();

	public Usuario() {
		this.perfis.add(PerfilEnum.VISITANTE);
	}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
		this.perfis.add(PerfilEnum.VISITANTE);
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

	public Set<PerfilEnum> getPerfis() {
		return perfis;
	}

	public void setPerfis(Set<PerfilEnum> perfis) {
		this.perfis = perfis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
