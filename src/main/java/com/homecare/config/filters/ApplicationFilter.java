package com.homecare.config.filters;

import com.google.gson.Gson;
import com.homecare.utils.exceptions.custom.ResponseError;
import com.homecare.utils.messages.ExceptionMessages;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;
import java.io.IOException;


@Provider
public class ApplicationFilter implements ContainerResponseFilter, ContainerRequestFilter {
    @Context
    private HttpServletResponse httpResponse;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
//        if(responseContext.getStatus() != httpResponse.SC_OK && responseContext.getEntity() == null) {
//            httpResponse.setContentType(MediaType.APPLICATION_JSON);
//            httpResponse.getWriter().write(
//                    new Gson().toJson(
//                            ResponseError
//                                    .builder()
//                                    .status(responseContext.getStatus())
//                                    .description(ExceptionMessages.ERRO_EXECUCAO)
//                                    .build()
//                    )
//            );
//        }
    }

    public void addHeaders(ContainerRequestContext requestContext, String key, String value){
        requestContext.getHeaders().add(key, value);
    }

    public void addHeaders(ContainerResponseContext responseContext, String key, String value){
        responseContext.getHeaders().add(key, value);
    }
}