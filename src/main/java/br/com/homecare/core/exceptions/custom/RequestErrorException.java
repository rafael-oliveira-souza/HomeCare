package br.com.homecare.core.exceptions.custom;

import br.com.homecare.utils.messages.ExceptionMessages;

public class RequestErrorException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RequestErrorException() {
        super(ExceptionMessages.ERRO_EXECUCAO);
    }

	public RequestErrorException(RequestErrorException e) {
        super(e.getMessage());
    }

    public RequestErrorException(String description)  {
            super(description);
    }

    public RequestErrorException(Throwable e) {
        String description = recoverCause(e);
        throw new RequestErrorException(description);
    }

    public String recoverCause(Throwable e){
        if(e.getCause() != null){
           return recoverCause(e.getCause());
        }

        return e.getMessage();
    }
}
