package com.homecare.core.messages;

public enum RequestMessageEnum {
    SAVE_SUCCESS("Salvo com sucesso."),
    SAVE_ERROR("Falha ao salvar");

    private String descricao;

    RequestMessageEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
