package com.homecare.resource;

import com.homecare.model.entity.Historico;
import com.homecare.service.HistoricoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/historicoo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HistoricoResource {

    @Inject
    private HistoricoService historicoService;

    @GET
    @Path("todos")
    public Response getAll(){
        List<Historico> historicos = this.historicoService.getAll();

        return Response
                .status(Status.OK)
                .entity(historicos)
                .build();
    }

    @GET
    @Path("buscar/{id}")
    public Response getById(@PathParam("id") Long id){
        Historico historico = this.historicoService.getById(id);

        return Response.ok(historico).build();
    }

    @POST
    @Path("salvar")
    public Response save(Historico historico){
        historico = this.historicoService.save(historico);

        return Response
                .status(Status.OK)
                .entity(historico)
                .build();
    }
}
