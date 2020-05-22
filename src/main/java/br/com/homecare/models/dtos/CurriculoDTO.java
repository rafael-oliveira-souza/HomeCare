package br.com.homecare.models.dtos;

import java.util.List;

import br.com.homecare.commons.AbstractDTO;
import br.com.homecare.models.entities.Curriculo;

public class CurriculoDTO extends AbstractDTO<Curriculo>{
	private static final long serialVersionUID = 1L;
    private Long id;
    private ProfissionalDTO profissional;
    private List<EducacaoDTO> educacao;
    private List<ExperienciaDTO> experiencia;
    private List<IdiomaDTO> idioma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProfissionalDTO getProfissional() {
		return profissional;
	}

	public void setProfissional(ProfissionalDTO profissional) {
		this.profissional = profissional;
	}

	public List<EducacaoDTO> getEducacao() {
		return educacao;
	}

	public void setEducacao(List<EducacaoDTO> educacao) {
		this.educacao = educacao;
	}

	public List<ExperienciaDTO> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<ExperienciaDTO> experiencia) {
		this.experiencia = experiencia;
	}

	public List<IdiomaDTO> getIdioma() {
		return idioma;
	}

	public void setIdioma(List<IdiomaDTO> idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.id);
	}
	
}
