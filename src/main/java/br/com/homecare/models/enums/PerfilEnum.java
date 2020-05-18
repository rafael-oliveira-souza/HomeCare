package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum PerfilEnum implements EnumInterface {
    ADMIN("ROLE_ADMIN"),
    PACIENTE("ROLE_PACIENTE"),
    VISITANTE("ROLE_VISITANTE"),
    PROFISSIONAL("ROLE_PROFISSIONAL");

    private String tipo;

    PerfilEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getValue() {
        return this.tipo;
    }
}


