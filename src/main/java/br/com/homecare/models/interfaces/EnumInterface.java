package br.com.homecare.models.interfaces;

public interface EnumInterface<T>  {
	
	Object getValue();
    
    Integer getCode();
    
    T toEnum(Integer codigo);
}
