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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.dtos.UsuarioDTO;
import br.com.homecare.models.enums.PerfilEnum;
import br.com.homecare.utils.messages.ExceptionMessages;

@Entity
public class Usuario extends AbstractEntity<UsuarioDTO> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Email não preenchido.")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

	@Column(name = "senha", nullable = false)
	@Size(min = 6, max = 80, message = ExceptionMessages.NUM_CARACTER_INVALIDO )
	private String senha;

	@CollectionTable(name = "usuario_perfil")
    @ElementCollection(fetch = FetchType.EAGER)
	@Column( name = "perfil_id")
	private Set<PerfilEnum> perfis = new HashSet<PerfilEnum>(0);

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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
