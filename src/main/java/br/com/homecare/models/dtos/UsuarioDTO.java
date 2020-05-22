package br.com.homecare.models.dtos;

import java.util.HashSet;
import java.util.Set;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.models.enums.PerfilEnum;

public class UsuarioDTO extends AbstractDTO<Usuario>{
	private static final long serialVersionUID = 1L;

	private Long id;
    private String email;
	private String senha;
	private Set<Integer> perfis;
	
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
		Set<PerfilEnum> perfs = new HashSet<PerfilEnum>();
		
		for(Integer codigo: this.perfis) {
			perfs.add(PerfilEnum.toEnum(codigo));
		}
		
		return perfs;
	}
	public void setPerfis(Set<PerfilEnum> perfis) {
		Set<Integer> perfs = new HashSet<Integer>();
		
		for(PerfilEnum perfil: perfis) {
			perfs.add(perfil.getCode());
		}
		
		this.perfis = perfs;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
