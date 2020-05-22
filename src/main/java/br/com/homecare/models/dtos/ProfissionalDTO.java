package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import br.com.homecare.models.enums.TipoUsuarioEnum;

public class ProfissionalDTO extends PessoaDTO{
	private static final long serialVersionUID = 1L;
	
	private List<AtendimentoDTO> atendimentos;
    private List<ProfissaoDTO> profissoes = new ArrayList<ProfissaoDTO>();
    private CurriculoDTO curriculo;

	public ProfissionalDTO() {
		setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
	}
	
	public List<AtendimentoDTO> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<AtendimentoDTO> atendimentos) {
		this.atendimentos = atendimentos;
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

	public PessoaDTO getPessoa() {
		PessoaDTO pessoa = new PessoaDTO();
		pessoa.setId(this.getId());
		pessoa.setCpf(this.getCpf());
		pessoa.setNome(this.getNome());
		pessoa.setPeso(this.getPeso());
		pessoa.setIdade(this.getIdade());
		pessoa.setEmail(this.getEmail());
		pessoa.setGenero(this.getGenero());
		pessoa.setAltura(this.getAltura());
		pessoa.setTelefone(this.getTelefone());
		pessoa.setEndereco(this.getEndereco());
		pessoa.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		pessoa.setAtendimentos(this.getAtendimentos());
		
		return pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.setId(pessoa.getId());
		this.setCpf(pessoa.getCpf());
		this.setNome(pessoa.getNome());
		this.setPeso(pessoa.getPeso());
		this.setIdade(pessoa.getIdade());
		this.setEmail(pessoa.getEmail());
		this.setGenero(pessoa.getGenero());
		this.setAltura(pessoa.getAltura());
		this.setTelefone(pessoa.getTelefone());
		this.setEndereco(pessoa.getEndereco());
		this.setTipoUsuario(TipoUsuarioEnum.PROFISSIONAL);
		this.setAtendimentos(pessoa.getAtendimentos());
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj, this.getId());
	}
	
	public <E> E toEntity(Class<E> classe, ProfissionalDTO obj) {
		return new ModelMapper().map(obj, classe);
	}
	
}
