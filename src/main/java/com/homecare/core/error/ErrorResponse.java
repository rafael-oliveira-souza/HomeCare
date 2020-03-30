package com.homecare.core.error;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ErrorResponse {

    private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ObjectError> errors;


    @AllArgsConstructor
    public class ObjectError {

        private final String message;
        private final String field;
        private final Object parameter;
    }
}