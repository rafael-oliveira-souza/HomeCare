package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum PerfilEnum implements EnumInterface<PerfilEnum> {
	ADMIN(1, "ROLE_ADMIN"), 
	CLIENTE(2, "ROLE_CLIENTE"),
	PACIENTE(3, "ROLE_PACIENTE"), 
	VISITANTE(4, "ROLE_VISITANTE"),
	PROFISSIONAL(5, "ROLE_PROFISSIONAL");

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
		for(PerfilEnum enumObj: PerfilEnum.values()) {
			if(enumObj.getCode() == codigo) {
				return enumObj;
			}
		}
		
		return null;
	}
}
