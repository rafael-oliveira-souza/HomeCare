package com.homecare.utils.exceptions.custom;

import com.homecare.utils.messages.ExceptionMessages;

public class ErrorResouceException extends RuntimeException {
    public ErrorResouceException() {
        super(ExceptionMessages.ERRO_EXECUCAO);
    }


    public ErrorResouceException(String description)  {
            super(description);
    }
}
