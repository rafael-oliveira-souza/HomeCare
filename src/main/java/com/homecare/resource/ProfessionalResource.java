package com.homecare.resource;

import com.google.gson.Gson;
import com.homecare.core.messages.RequestMessageEnum;
import com.homecare.model.entity.Professional;
import com.homecare.service.ProfessionalService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static com.homecare.core.messages.RequestMessageEnum.SAVE_SUCCESS;

@Path("/profissional")
public class ProfessionalResource {

    @Inject
    private ProfessionalService professionalService = new ProfessionalService();

    @GET
    @Path("todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        return Response.ok(new Gson().toJson("Test")).build();
    }

    @GET
    @Path("buscar/k {id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Long id){
        Professional profissional = this.professionalService.getById(id);

        return Response.ok(profissional).build();
    }

    @POST
    @Path("salvar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(Professional professional){
        return Response.ok(new Gson().toJson(SAVE_SUCCESS)).build();
    }
}
