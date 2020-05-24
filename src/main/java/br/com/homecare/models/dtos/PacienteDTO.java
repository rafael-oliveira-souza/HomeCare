package br.com.homecare.models.dtos;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.homecare.models.entities.Pessoa;
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

	@JsonIgnore
	public Pessoa getPessoa() {
		Pessoa pessoa = super.getPessoa();
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
		
		return pessoa;
	}


	@JsonIgnore	
	public void setPessoa(Pessoa pessoa) {
		pessoa.setTipoUsuario(TipoUsuarioEnum.PACIENTE);
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
