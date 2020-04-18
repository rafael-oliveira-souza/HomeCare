package com.homecare.utils.exceptions.custom;

import com.homecare.utils.messages.ExceptionMessages;

public class ErrorResouceException extends RuntimeException {
    public ErrorResouceException() {
        super(ExceptionMessages.ERRO_EXECUCAO);
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
