package com.homecare.model.enums;

public enum TipoUsuarioEnum {
    PACIENTE('C'),
    PROFISSIONAL('P');

    private char tipo;

    TipoUsuarioEnum(char tipo) {
        this.tipo = tipo;
    }
}


