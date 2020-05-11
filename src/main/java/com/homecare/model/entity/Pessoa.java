package com.homecare.model.entity;

import com.homecare.model.enums.GeneroEnum;
import com.homecare.model.enums.TipoUsuarioEnum;
import com.homecare.utils.validators.interfaces.Cpf;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.List;

import static com.homecare.utils.messages.ExceptionMessages.CAMPO_VAZIO;
import static com.homecare.utils.regexs.Regex.REGEX_MAIL;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank(message = CAMPO_VAZIO)
    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="pessoa_id")
    private List<Atendimento> atendimentos;

    @Cpf
    @Size(min = 14, max = 14, message = CAMPO_VAZIO)
    @Column(name = "cpf", unique = true, length = 14, nullable = false)
    private String cpf;

//    @Size(min = 3, max = 3, message = CAMPO_VAZIO)
    @Column(name = "altura", length = 3)
    private Double altura;

//    @Size(min = 3, max = 3, message = CAMPO_VAZIO)
    @Column(name = "peso", length = 3)
    private Double peso;

    @Column(name = "idade", length = 3)
    private Integer idade;

    @Column(name = "genero")
    private GeneroEnum genero;

    @NotEmpty(message = CAMPO_VAZIO)
    @Pattern(regexp = REGEX_MAIL)
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "endereco")
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

}
