package com.homecare.model.enums;

import com.homecare.model.interfaces.EnumInterface;

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


