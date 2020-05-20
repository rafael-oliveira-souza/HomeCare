package br.com.homecare.config.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.homecare.models.entities.Usuario;
import br.com.homecare.services.UsuarioService;

public class UserSecurity implements UserDetails{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String email;
	private String senha;
	private Collection<? extends GrantedAuthority> autorizacoes;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.autorizacoes;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public UserSecurity() {
		
	}
	
	public UserSecurity(Long id, String email, String senha, Collection<? extends GrantedAuthority> autorizacoes,
			UsuarioService usuarioService) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.autorizacoes = autorizacoes;
	}

	public UserSecurity(Usuario usuario) {
		this.id = usuario.getId();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.autorizacoes = usuario.getPerfis().stream()
				.map(perf -> new SimpleGrantedAuthority(perf.getValue()))
				.collect(Collectors.toList());
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

	public Collection<? extends GrantedAuthority> getAutorizacoes() {
		return autorizacoes;
	}

	public void setAutorizacoes(Collection<? extends GrantedAuthority> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}
}
