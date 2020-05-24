package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.models.enums.PerfilEnum;

public class UsuarioDTO extends AbstractDTO<Usuario>{
	private static final long serialVersionUID = 1L;

	private Long id;
    private String email;
	private String senha;
	private List<Integer> perfis = new ArrayList<Integer>();
	
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

	public List<PerfilEnum> getPerfis() {
		return perfis.stream().map(codigo -> PerfilEnum.toEnum(codigo)).collect(Collectors.toList());
	}

	public void setPerfis(List<PerfilEnum> perfis) {
		this.perfis = perfis.stream().map(perfil -> perfil.getCode()).collect(Collectors.toList());
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
}
