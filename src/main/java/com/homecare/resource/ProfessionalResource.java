package com.homecare.resource;

import com.google.gson.Gson;
import com.homecare.model.entity.Professional;
import com.homecare.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@Path("/profissional")
public class ProfessionalResource {

    @Autowired
    private ProfessionalService professionalService;

    @GET
    @Path("todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        return Response.ok(new Gson().toJson("Test")).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Long id){
        Professional profissional = this.professionalService.getById(id);

        return Response.ok(profissional).build();
    }

}
