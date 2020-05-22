package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

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
	private GeneroEnum genero;
	private TipoUsuarioEnum tipoUsuario;
	private List<AtendimentoDTO> atendimentos = new ArrayList<AtendimentoDTO>();

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

	public List<AtendimentoDTO> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<AtendimentoDTO> atendimentos) {
		this.atendimentos = atendimentos;
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
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
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
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}

}
