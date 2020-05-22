package br.com.homecare.models.enums;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.interfaces.InterfaceEnum;
import br.com.homecare.utils.messages.ExceptionMessages;

public enum SituacaoIdiomaEnum implements InterfaceEnum<SituacaoIdiomaEnum> {
    AVANCADO(1, "Avancado"),
    INTERMEDIARIO(2, "Intermediario"),
    BASICO(3, "Basico");

	private String tipo;
	private Integer codigo;

	SituacaoIdiomaEnum(Integer codigo, String tipo) {
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

	public static SituacaoIdiomaEnum toEnum(Integer codigo) {
		for(SituacaoIdiomaEnum enumObj: SituacaoIdiomaEnum.values()) {
			if(enumObj.getCode() == codigo) {
				return enumObj;
			}
		}

		throw new RequestErrorException(ExceptionMessages.enumInvalido(codigo, SituacaoIdiomaEnum.class));
	}
}


