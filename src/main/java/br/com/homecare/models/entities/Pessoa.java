package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.enums.GeneroEnum;
import br.com.homecare.models.enums.TipoUsuarioEnum;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends AbstractEntity<Pessoa> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToMany(mappedBy = "pessoa")
    private List<Atendimento> atendimentos;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Size(min = 3, max = 3)
    @Column(name = "altura", length = 3)
    private Double altura;

    @Size(min = 3, max = 3)
    @Column(name = "peso", length = 3)
    private Double peso;

    @Column(name = "idade", length = 3)
    private Integer idade;

    private GeneroEnum genero;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    private String telefone;

    private String endereco;

    @Column(name = "tipo_usuario", nullable = false)
    private TipoUsuarioEnum tipoUsuario;

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

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
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
		// TODO Auto-generated method stub
		return super.equals(obj, this.id);
	}

}