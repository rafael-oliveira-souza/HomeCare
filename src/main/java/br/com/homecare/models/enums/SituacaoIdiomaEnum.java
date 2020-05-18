package br.com.homecare.models.enums;

import br.com.homecare.models.interfaces.EnumInterface;

public enum SituacaoIdiomaEnum implements EnumInterface {
    AVANCADO("AVANCADO"),
    INTERMEDIARIO("INTERMEDIARIO"),
    BASICO("BASICO");

    private String tipo;

    SituacaoIdiomaEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getValue() {
        return this.tipo;
    }
}


