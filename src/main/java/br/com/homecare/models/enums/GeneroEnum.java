package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum GeneroEnum implements EnumInterface<GeneroEnum> {
    MASCULINO(1, "Masculino"),
    OUTROS(2, "Outros"),
    FEMININO(3, "Feminino");

    private String tipo;
    private Integer codigo;

    GeneroEnum(Integer codigo, String tipo) {
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
	public GeneroEnum toEnum(Integer codigo) {
		return (GeneroEnum)ENUM_COMMONS.toEnum(GeneroEnum.class , codigo);
	}
}


