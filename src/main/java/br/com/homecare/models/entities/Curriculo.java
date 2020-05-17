package br.com.homecare.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    private String tipo;

    private String descricao;
    
    @MapsId
    @OneToOne
    @JoinColumn(name="profissional-id")
    private Profissional profissional;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Educacao> educacao;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Experiencia> experiencia;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Idioma> idioma;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
}
