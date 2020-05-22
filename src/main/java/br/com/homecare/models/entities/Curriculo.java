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
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.homecare.commons.AbstractEntity;
import br.com.homecare.models.dtos.CurriculoDTO;

@Entity
public class Curriculo extends AbstractEntity<CurriculoDTO> {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @MapsId
    @OneToOne
    @JsonBackReference
    @JoinColumn(name="profissional_id")
    private Profissional profissional;

    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "educacao_id")
	@CollectionTable(name = "curriculo_educacao")
    private List<Educacao> educacoes = new ArrayList<Educacao>(0);

    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "experiencia_id")
	@CollectionTable(name = "curriculo_experiencia")
    private List<Experiencia> experiencias = new ArrayList<Experiencia>(0);

    @ElementCollection(fetch = FetchType.LAZY)
	@Column( name = "idioma_id")
	@CollectionTable(name = "curriculo_idioma")
    private List<Idioma> idiomas = new ArrayList<Idioma>(0);

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

	public List<Educacao> getEducacoes() {
		return educacoes;
	}

	public void setEducacoes(List<Educacao> educacoes) {
		this.educacoes = educacoes;
	}

	public List<Experiencia> getExperiencias() {
		return experiencias;
	}

	public void setExperiencia(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
    
}
