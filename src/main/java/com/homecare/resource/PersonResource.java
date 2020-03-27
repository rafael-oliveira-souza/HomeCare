package com.homecare.resource;

import com.google.gson.Gson;
import com.homecare.model.entity.persons.Person;
import com.homecare.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/pessoa")
public class PersonResource {

    @Inject
    private PersonService personService;

    @GET
    @Path("todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<Person> persons = this.personService.getAll();

        return Response
                .status(Status.OK)
                .entity(persons)
                .build();
    }

    @GET
    @Path("buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Long id){
        Person person = this.personService.getById(id);

        return Response
                .status(Status.OK)
                .entity(person)
                .build();
    }

    @POST
    @Path("salvar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(Person Person){
        Person pessoa = this.personService.save(Person);

        return Response
                .status(Status.OK)
                .entity(pessoa)
                .build();
    }
}
