package com.homecare.resource;

import com.homecare.model.entity.Usuario;
import com.homecare.service.LoginService;
import com.homecare.utils.exceptions.custom.ErrorResouceException;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    @Inject
    private LoginService loginService;

    @GET
    @Path("excluir/{id}")
    public Response delete(@PathParam("id") Long id){
        this.loginService.delete(id);

        return Response
                .ok(null)
                .build();
    }

    @POST
    @Path("salvar")
    public Response save(Usuario usuario) {
        usuario = this.loginService.save(usuario);
        return Response
                .ok(usuario)
                .build();
    }

    @PUT
    @Path("atualizar")
    public Response update(Usuario usuario){
        usuario = this.loginService.update(usuario);

        return Response
                .ok(usuario)
                .build();

    }
}
