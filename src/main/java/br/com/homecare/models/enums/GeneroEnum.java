package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum GeneroEnum implements EnumInterface {
    MASCULINO("M"),
    OUTROS("O"),
    FEMININO("F");

    private String tipo;

    GeneroEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getValue() {
        return this.tipo;
    }
}


