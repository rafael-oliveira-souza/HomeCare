package br.com.homecare.models.interfaces;

import br.com.homecare.models.enums.EnumCommon;

public interface EnumInterface<T>  {
	final static EnumCommon ENUM_COMMONS= new EnumCommon();
	
	Object getValue();
    
    Integer getCode();
    
    T toEnum(Integer codigo);
}
