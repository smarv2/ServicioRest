package com.mx.digitalstone.restservice;


import java.net.URI;
import java.net.URISyntaxException;
import javax.ws.rs.GET;
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
@Path("datosGETJSON")
public class datosGETJSON {

    @GET
    @Produces(MediaType.APPLICATION_JSON) //indica el tipo de dato que va a regresar si no se indica regresa un JSON
    public Response oeprar(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido, @QueryParam("edad") int edad, @Context UriInfo uriInfo) throws URISyntaxException {
        RespuestaVO respuestaVO = new RespuestaVO();
        respuestaVO.setNombreCompleto(nombre + " " + apellido);
        respuestaVO.setEdad(edad);
        
        URI uri = uriInfo.getAbsolutePath();
        
        //Por default regresa un JSON
        //return Response.created(uri).entity(respuestaVO).build();
        return Response.accepted(uri).entity(respuestaVO).build();
        /*return Response.status(Response.Status.ACCEPTED).entity(respuestaVO)
                .build();*/
    }

}
