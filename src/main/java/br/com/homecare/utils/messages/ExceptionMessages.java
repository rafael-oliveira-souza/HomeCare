package br.com.homecare.utils.messages;

import org.springframework.util.StringUtils;

public abstract class ExceptionMessages {
    public static final String ERRO_EXECUCAO = "Erro na execucao do servico.";
    public static final String ERRO_DESCONHECIDO = "Erro desconhecido.";
    public static final String FALHA_AUTENTICACAO = "Falha na autenticação de usuário.";
    public static final String OBJETO_NAO_ENCONTRATO = "Objeto não encontrado.";
    public static final String CAMPOS_VAZIOS = "Algum dos campos obrigatórios está vazio.";
    public static final String CAMPO_VAZIO = "Campo Vazio.";
    public static final String CAMPO_NULO = "Campo nulo.";
    public static final String NUM_CARACTER_INVALIDO = "O nome deve possuir entre 6 e 80 caracteres.";
    public static final String CPF_INVALIDO = "CPF invalido.";
    public static final String EMAIL_INVALIDO = "Email invalido.";
    public static final String SENHA_INVALIDA = "Senha invalida.";
    public static final String SENHA_INCORRETA = "Senha incorreta.";
    public static final String EMAIL_NAO_ENCONTRATO = "Email não encontrado.";
    public static final String EMAIL_CADASTRADO = "Email já foi cadastrado.";
    public static final String FALHA_REC_CLAIMS = "Falha ao recuperar claims.";
    

    public ExceptionMessages(){}

    public static final String campoNulo(String campo){
        return "O campo " + campo + " esta nulo.";
    }

    public static final String campoVazio(String campo){
        return "O campo " + campo + " esta nulo.";
    }

    public static final String enumInvalido(Object campo, Class<?> classe){
        return "O enum de valor " + campo.toString() + " não existe. Classe: " + classe;
    }

    public static final String objetoNaoEncontrado(String object){
        return StringUtils.capitalize(object) + " não encontrado.";
    }
}
