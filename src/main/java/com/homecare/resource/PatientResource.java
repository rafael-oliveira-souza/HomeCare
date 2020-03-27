package com.homecare.resource;

import com.google.gson.Gson;
import com.homecare.model.entity.persons.Patient;
import com.homecare.service.PatientService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import java.util.List;

import static com.homecare.core.messages.RequestMessageEnum.SAVE_SUCCESS;

@Path("/paciente")
public class PatientResource {

    @Inject
    private PatientService PatientService;

    @GET
    @Path("todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<Patient> patients = this.PatientService.getAll();

        return Response
                .status(Status.OK)
                .entity(patients)
                .build();
    }

    @GET
    @Path("buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Long id){
        Patient patient = this.PatientService.getById(id);

        return Response.ok(patient).build();
    }

    @POST
    @Path("salvar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(Patient Patient){
        Patient patient = this.PatientService.save(Patient);

        return Response
                .status(Status.OK)
                .entity(patient)
                .build();
    }
}