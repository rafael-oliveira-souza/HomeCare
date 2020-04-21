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
    @JoinColumn(name="id")
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

}
