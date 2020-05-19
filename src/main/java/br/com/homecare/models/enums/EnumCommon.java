package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public class EnumCommon{

	public Object toEnum(Class<?> classe, Integer codigo) {
		if(classe.isEnum()) {
			Object[] enums = classe.getEnumConstants();
			for(Object enumObj: enums) {
				EnumInterface<?> enun = (EnumInterface<?>)enumObj;
				if(enun.getCode() == codigo) {
					return enumObj;
				}
				
			}
		}
		return null;
	}

}
