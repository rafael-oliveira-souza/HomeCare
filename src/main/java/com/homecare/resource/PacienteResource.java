package com.homecare.resource;

import com.homecare.model.entity.Paciente;
import com.homecare.service.PacienteService;
import com.homecare.utils.exceptions.custom.ErrorResouceException;
import com.homecare.utils.messages.ExceptionMessages;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
                .accepted(pacientes)
                .build();
    }

    @GET
    @Path("buscar/{id}")
    public Response getById(@PathParam("id") Long id){
        Paciente paciente = this.pacienteService.getById(id);

        return Response
                .ok(paciente)
                .build();
    }

    @GET
    @Path("excluir/{id}")
    public Response delete(@PathParam("id") Long id){
        this.pacienteService.delete(id);

        return Response
                .ok(null)
                .build();
    }

    @POST
    @Path("salvar")
    public Response save(Paciente paciente) {
        if(paciente.getPessoa() == null){
            throw new ErrorResouceException(ExceptionMessages.campoNulo("Pessoa"));
        }
        paciente = this.pacienteService.save(paciente);
        return Response
                .ok(paciente)
                .build();
    }

    @PUT
    @Path("atualizar")
    public Response update(Paciente paciente)throws ErrorResouceException{
        if(paciente.getPessoa() == null){
            throw new ErrorResouceException(ExceptionMessages.campoNulo("Pessoa"));
        }
        paciente = this.pacienteService.update(paciente);

        return Response
                .ok(paciente)
                .build();

    }
}
