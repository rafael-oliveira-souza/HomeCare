package br.com.homecare.models.enums;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.interfaces.InterfaceEnum;
import br.com.homecare.utils.messages.ExceptionMessages;

public enum GeneroEnum implements InterfaceEnum<GeneroEnum> {
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

	public static GeneroEnum toEnum(Integer codigo) {
		for(GeneroEnum enumObj: GeneroEnum.values()) {
			if(enumObj.getCode() == codigo) {
				return enumObj;
			}
		}
		
		throw new RequestErrorException(ExceptionMessages.enumInvalido(codigo, GeneroEnum.class));
	}
}


