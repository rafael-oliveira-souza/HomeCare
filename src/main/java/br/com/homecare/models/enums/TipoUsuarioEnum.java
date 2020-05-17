package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum TipoUsuarioEnum implements EnumInterface {
    PACIENTE("PACIENTE"),
    PROFISSIONAL("PROFISSIONAL");

    private String tipo;

    TipoUsuarioEnum(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getValue() {
        return this.tipo;
    }
}


