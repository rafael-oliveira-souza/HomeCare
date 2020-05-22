package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import br.com.homecare.models.enums.TipoUsuarioEnum;

public class PacienteDTO extends PessoaDTO{
	private static final long serialVersionUID = 1L;
	
    private List<DoencaDTO> doencas = new ArrayList<DoencaDTO>();
    private List<MedicamentoDTO> medicamentos = new ArrayList<MedicamentoDTO>();

    public List<DoencaDTO> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<DoencaDTO> doencas) {
		this.doencas = doencas;
	}

	public List<MedicamentoDTO> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<MedicamentoDTO> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	public PacienteDTO() {
		setTipoUsuario(TipoUsuarioEnum.PACIENTE);
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
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
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
		this.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
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
