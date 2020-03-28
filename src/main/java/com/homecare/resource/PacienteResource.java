package com.homecare.resource;

import com.homecare.model.entity.Historico;
import com.homecare.model.entity.Paciente;
import com.homecare.service.PacienteService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import java.util.List;

@Path("/paciente")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @Inject
    private PacienteService pacienteService;

    @GET
    @Path("todos")
    public Response getAll(){
        List<Paciente> pacientes = this.pacienteService.getAll();

        return Response
                .status(Status.OK)
                .entity(pacientes)
                .build();
    }

    @GET
    @Path("{id}/historicoos")
    public Response getHistoricoByPaciente(@PathParam("id") Long id){
        List<Historico> historicos = this.pacienteService.getHistoricoByPaciente(id);

        return Response.ok(historicos).build();
    }

    @GET
    @Path("buscar/{id}")
    public Response getById(@PathParam("id") Long id){
        Paciente paciente = this.pacienteService.getById(id);

        return Response.ok(paciente).build();
    }

    @POST
    @Path("salvar")
    public Response save(Paciente paciente){
        paciente = this.pacienteService.save(paciente);

        return Response
                .status(Status.OK)
                .entity(paciente)
                .build();
    }
}
