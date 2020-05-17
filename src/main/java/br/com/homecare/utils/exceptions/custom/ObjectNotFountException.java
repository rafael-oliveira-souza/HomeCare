package br.com.homecare.utils.exceptions.custom;

import br.com.homecare.utils.messages.ExceptionMessages;

public class ObjectNotFountException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFountException() {
        super(ExceptionMessages.ERRO_EXECUCAO);
    }


    public ObjectNotFountException(String description)  {
            super(description);
    }


}
