package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum TipoUsuarioEnum implements EnumInterface<TipoUsuarioEnum> {
    PACIENTE(1, "Paciente"),
    PROFISSIONAL(2, "Profissional");

	private String tipo;
	private Integer codigo;

	TipoUsuarioEnum(Integer codigo, String tipo) {
		this.tipo = tipo;
		this.codigo = codigo;
	}

	@Override
	public String getValue() {
		return this.tipo;
	}

	@Override
	public Integer getCode() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public TipoUsuarioEnum toEnum(Integer codigo) {
		for(TipoUsuarioEnum enumObj: TipoUsuarioEnum.values()) {
			if(enumObj.getCode() == codigo) {
				return enumObj;
			}
		}
		
		return null;
	}
}


