package br.com.homecare.utils.messages;

public abstract class ExceptionMessages {
    public static final String ERRO_EXECUCAO = "Erro na execucao do servico.";
    public static final String ERRO_TKN_INV = "Falha na autenticação de usuário.";
    public static final String CAMPO_VAZIO = "Preencha todo o campo.";

    public ExceptionMessages(){}

    public static final String campoNulo(String campo){
        return "O campo " + campo + " esta nulo.";
    }
}
