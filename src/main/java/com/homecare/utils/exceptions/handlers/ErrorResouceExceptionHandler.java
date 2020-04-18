package com.homecare.utils.exceptions.handlers;

import com.google.gson.Gson;
import com.homecare.utils.exceptions.custom.ErrorResouceException;
import com.homecare.utils.exceptions.custom.ResponseError;
import oracle.jrockit.jfr.jdkevents.ThrowableTracer;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import java.util.Iterator;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

@Provider
public class ErrorResouceExceptionHandler implements ExceptionMapper<ErrorResouceException> {

    @Override
    public Response toResponse(ErrorResouceException e) {
        return Response
            .status(INTERNAL_SERVER_ERROR)
            .type(MediaType.APPLICATION_JSON_TYPE)
            .entity(
                new Gson().toJson(
                    ResponseError
                        .builder()
                        .status(INTERNAL_SERVER_ERROR.getStatusCode())
                        .description(e.getMessage())
                        .build())
            ).build();
    }
}
