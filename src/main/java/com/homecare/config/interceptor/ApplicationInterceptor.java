package com.homecare.config.interceptor;

import com.google.gson.Gson;
import com.homecare.utils.exceptions.custom.ResponseError;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.*;
import java.io.*;
import java.util.stream.Collectors;

@Provider
public class ApplicationInterceptor implements WriterInterceptor, ReaderInterceptor {

    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
        context.proceed();
    }

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
        return context.proceed();
    }
}
