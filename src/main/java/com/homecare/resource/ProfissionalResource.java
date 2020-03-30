package com.homecare.resource;

import com.google.gson.Gson;
import com.homecare.model.entity.Profissional;
import com.homecare.service.ProfissionalService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profissional")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfissionalResource {

    @Inject
    private ProfissionalService profissionalService;

    @GET
    @Path("todos")
    public Response getAll(){
        return Response.ok(new Gson().toJson("Test")).build();
    }

    @GET
    @Path("buscar/{id}")
    public Response getById(@PathParam("id") Long id){
        Profissional profissional = this.profissionalService.getById(id);

        return Response.ok(profissional).build();
    }

    @POST
    @Path("salvar")
    public Response save(Profissional profissional){
        profissional = this.profissionalService.save(profissional);
//        return Response.ok(profissional).build();
        return Response.ok(new Gson().toJson("teste")).build();
    }
}
