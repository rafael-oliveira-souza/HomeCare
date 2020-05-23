package br.com.homecare.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MapKeyColumn;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.dtos.PessoaDTO;
import br.com.homecare.models.enums.GeneroEnum;
import br.com.homecare.models.enums.TipoUsuarioEnum;
import br.com.homecare.utils.messages.ExceptionMessages;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends AbstractEntity<PessoaDTO> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@NotEmpty(message = ExceptionMessages.CAMPO_VAZIO)
	@Length(min = 5, max = 80, message = ExceptionMessages.NUM_CARACTER_INVALIDO )
    @Column(name = "nome", nullable = false)
    private String nome;

	@Column(name = "atendimento_id")
	@MapKeyColumn(name = "pessoa_id")
    @ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "pessoa_atendimento")
	private List<Atendimento> atendimentos = new ArrayList<Atendimento>(0);

//	@CPF
	@NotEmpty(message = ExceptionMessages.CAMPO_VAZIO)
	@Length(min = 14, max = 14, message = ExceptionMessages.CPF_INVALIDO )
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "altura", length = 3)
    private Double altura;

    @Column(name = "peso", length = 3)
    private Double peso;

    @Column(name = "idade", length = 3)
    private Integer idade;

    private Integer genero;

//    @Email
	@NotEmpty(message = "Email não preenchido.")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    private String telefone;

    private String endereco;

    @Column(name = "tipo_usuario"	)
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj, this.id);
	}

}
