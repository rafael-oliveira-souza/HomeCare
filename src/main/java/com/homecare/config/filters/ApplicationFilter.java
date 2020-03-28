package com.homecare.config.filters;

import com.google.gson.Gson;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

@Provider
public class ApplicationFilter implements ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        this.addHeaders(requestContext, "auth-los", "FFKAOSFA0F99");
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        if(responseContext.getEntity() != null){
            responseContext.setEntity(new Gson().toJson(responseContext.getEntity()));
        }
    }

    public void addHeaders(ContainerRequestContext requestContext, String key, String value){
        requestContext.getHeaders().add(key, value);
    }

    public void addHeaders(ContainerResponseContext responseContext, String key, String value){
        responseContext.getHeaders().add(key, value);
    }

}
