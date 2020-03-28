package com.homecare.resource;

import com.homecare.model.entity.Pessoa;
import com.homecare.service.PessoaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/pessoa")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PessoaResource{

    @Inject
    private PessoaService pessoaService;

    @GET
    @Path("todos")
    public Response getAll(){
        List<Pessoa> pessoas = this.pessoaService.getAll();
        return Response
                .status(Status.OK)
                .entity(pessoas)
                .build();
    }

    @GET
    @Path("buscar/{id}")
    public Response getById(@PathParam("id") Long id){
        Pessoa pessoa = this.pessoaService.getById(id);

        return Response
                .status(Status.OK)
                .entity(pessoa)
                .build();
    }

    @POST
    @Path("salvar")
    public Response save(Pessoa pessoa){
        pessoa = this.pessoaService.save(pessoa);
        return Response
                .status(Status.OK)
                .entity(pessoa)
                .build();
    }

    @POST
    @Path("atualizar")
    public Response update(Pessoa pessoa){
        pessoa = this.pessoaService.update(pessoa);

        return Response
                .status(Status.OK)
                .entity(pessoa)
                .build();
    }

    @DELETE
    @Path("excluir/{id}")
    public Response delete(@PathParam("id") Long id){
        this.pessoaService.delete(id);

        return Response
                .status(Status.OK)
                .entity(null)
                .build();
    }
}
