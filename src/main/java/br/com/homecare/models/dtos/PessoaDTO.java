package br.com.homecare.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.models.enums.GeneroEnum;
import br.com.homecare.models.enums.TipoUsuarioEnum;

public class PessoaDTO extends AbstractDTO<Pessoa> {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String cpf;
	private Double peso;
	private String nome;
	private String email;
	private Integer idade;
	private Double altura;
	private String telefone;
	private String endereco;
	private Integer genero;
	private Integer tipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public GeneroEnum getGenero() {
		return GeneroEnum.toEnum(this.genero);
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero.getCode();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public TipoUsuarioEnum getTipoUsuario() {
		return TipoUsuarioEnum.toEnum(this.tipoUsuario);
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario.getCode();
	}
	
	@JsonIgnore
	public Pessoa getPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(this.getId());
		pessoa.setCpf(this.getCpf());
		pessoa.setNome(this.getNome());
		pessoa.setPeso(this.getPeso());
		pessoa.setIdade(this.getIdade());
		pessoa.setEmail(this.getEmail());
		pessoa.setGenero(this.getGenero());
		pessoa.setAltura(this.getAltura());
		pessoa.setTelefone(this.getTelefone());
		pessoa.setEndereco(this.getEndereco());
		pessoa.setTipoUsuario(this.getTipoUsuario());
		
		return pessoa;
	}


	@JsonIgnore	
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
		this.setTipoUsuario(this.getTipoUsuario());
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}

}
