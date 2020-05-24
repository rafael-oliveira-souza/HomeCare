package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.models.enums.TipoUsuarioEnum;

public class ProfissionalDTO extends PessoaDTO{
	private static final long serialVersionUID = 1L;
	
    private List<ProfissaoDTO> profissoes = new ArrayList<ProfissaoDTO>();
    private CurriculoDTO curriculo;

	public ProfissionalDTO() {
		setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
	}
	
	public List<ProfissaoDTO> getProfissoes() {
		return profissoes;
	}
	public void setProfissoes(List<ProfissaoDTO> profissoes) {
		this.profissoes = profissoes;
	}
	public CurriculoDTO getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(CurriculoDTO curriculo) {
		this.curriculo = curriculo;
	}

	@JsonIgnore
	public Pessoa getPessoa() {
		Pessoa pessoa = super.getPessoa();
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		
		return pessoa;
	}

	@JsonIgnore	
	public void setPessoa(Pessoa pessoa) {
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		super.setPessoa(pessoa);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.getId());
	}
	
	public <E> E toEntity(Class<E> classe, ProfissionalDTO obj) {
		return new ModelMapper().map(obj, classe);
	}
	
}
