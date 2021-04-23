package com.mx.digitalstone.restservice;


import java.net.URI;
import java.net.URISyntaxException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author smarv
 */
@Path("/datosPOSTJSON")
public class datosPOSTJSON {

    @POST
    @Consumes(MediaType.APPLICATION_JSON) //indica el tipo de dato que va a recibir
    @Produces(MediaType.APPLICATION_JSON) //indica el tipo de dato que va a regresar si no se indica regresa un JSON
    public Response oeprar(RequestVO requestVO,  @Context UriInfo uriInfo) throws URISyntaxException { //como parametros del metodo es el objeto que se va a recibir en json
        RespuestaVO respuestaVO = new RespuestaVO();
        respuestaVO.setNombreCompleto(requestVO.getNombre() + " " + requestVO.getApellido());
        respuestaVO.setEdad(requestVO.getEdad());
        
        URI uri = uriInfo.getAbsolutePath();
        
        //Por default regresa un JSON
        return Response.ok(uri).entity(respuestaVO).build();
        /*return Response.status(Response.Status.ACCEPTED).entity(respuestaVO)
                .build();*/
    }

}
