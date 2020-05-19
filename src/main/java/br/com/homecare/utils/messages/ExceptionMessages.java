package br.com.homecare.utils.messages;

import org.springframework.util.StringUtils;

public abstract class ExceptionMessages {
    public static final String ERRO_EXECUCAO = "Erro na execucao do servico.";
    public static final String ERRO_TKN_INV = "Falha na autenticação de usuário.";
    public static final String OBJETO_NAO_ENCONTRATO = "Objeto não encontrado.";
    public static final String CAMPOS_VAZIOS = "Preencha todos os campos.";
    public static final String CAMPO_VAZIO = "Campo Vazio.";
    public static final String CAMPO_NULO = "Campo nulo.";
    public static final String NOME_INVALIDO = "O nome deve possuir entre 5 e 80 caracteres.";
    public static final String CPF_INVALIDO = "CPF invalido.";
    public static final String EMAIL_INVALIDO = "Email invalido.";
    

    public ExceptionMessages(){}

    public static final String campoNulo(String campo){
        return "O campo " + campo + " esta nulo.";
    }

    public static final String campoVazio(String campo){
        return "O campo " + campo + " esta nulo.";
    }

    public static final String objetoNaoEncontrato(String object){
        return StringUtils.capitalize(object) + " não encontrado.";
    }
}
