package br.com.homecare.utils.exceptions.custom;

import br.com.homecare.utils.messages.ExceptionMessages;

public class ErrorResouceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ErrorResouceException() {
        super(ExceptionMessages.ERRO_EXECUCAO);
    }

	public ErrorResouceException(ErrorResouceException e) {
        super(e.getMessage());
    }

    public ErrorResouceException(String description)  {
            super(description);
    }

    public ErrorResouceException(Throwable e) {
        String description = recoverCause(e);
        throw new ErrorResouceException(description);
    }

    public String recoverCause(Throwable e){
        if(e.getCause() != null){
           return recoverCause(e.getCause());
        }

        return e.getMessage();
    }
}
