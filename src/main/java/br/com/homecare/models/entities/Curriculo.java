package br.com.homecare.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @MapsId
    @OneToOne
    @JsonBackReference
    @JoinColumn(name="profissional_id")
    private Profissional profissional;

    @JsonManagedReference
    @OneToMany(mappedBy = "curriculo")
    private List<Educacao> educacao;

    @JsonManagedReference
    @OneToMany(mappedBy = "curriculo")
    private List<Experiencia> experiencia;

    @JsonManagedReference
    @OneToMany(mappedBy = "curriculo")
    private List<Idioma> idioma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public List<Educacao> getEducacao() {
		return educacao;
	}

	public void setEducacao(List<Educacao> educacao) {
		this.educacao = educacao;
	}

	public List<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public List<Idioma> getIdioma() {
		return idioma;
	}

	public void setIdioma(List<Idioma> idioma) {
		this.idioma = idioma;
	}
    
}
