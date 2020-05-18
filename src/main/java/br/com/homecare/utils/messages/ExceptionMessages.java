package br.com.homecare.utils.messages;

import org.springframework.util.StringUtils;

public abstract class ExceptionMessages {
    public static final String ERRO_EXECUCAO = "Erro na execucao do servico.";
    public static final String ERRO_TKN_INV = "Falha na autenticação de usuário.";
    public static final String OBJETO_NAO_ENCONTRATO = "Objeto não encontrado.";
    public static final String CAMPO_VAZIO = "Preencha todo o campo.";
    public static final String CAMPO_NULO = "Campo nulo.";

    public ExceptionMessages(){}

    public static final String campoNulo(String campo){
        return "O campo " + campo + " esta nulo.";
    }

    public static final String objetoNaoEncontrato(String object){
        return StringUtils.capitalize(object) + " não encontrado.";
    }
}
