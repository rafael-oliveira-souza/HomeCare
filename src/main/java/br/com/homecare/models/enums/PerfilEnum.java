package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum PerfilEnum implements EnumInterface<PerfilEnum> {
	ADMIN(1, "ROLE_ADMIN"), 
	PACIENTE(2, "ROLE_PACIENTE"), 
	VISITANTE(3, "ROLE_VISITANTE"),
	PROFISSIONAL(4, "ROLE_PROFISSIONAL");

	private String tipo;
	private Integer codigo;

	PerfilEnum(Integer codigo, String tipo) {
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
	public PerfilEnum toEnum(Integer codigo) {
		return (PerfilEnum) ENUM_COMMONS.toEnum(PerfilEnum.class, codigo);
	}
}
