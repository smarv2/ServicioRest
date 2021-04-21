package com.mx.digitalstone.restservice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author smarv
 */
@Path("datosGETXML")
public class datosGETXML {

    @GET
    @Produces(MediaType.APPLICATION_XML) //indica el tipo de dato que va a regresar si no se indica regresa un JSON
    public RespuestaVO oeprar(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido, @QueryParam("edad") int edad) {
        RespuestaVO respuestaVO = new RespuestaVO();
        respuestaVO.setNombreCompleto(nombre + " " + apellido);
        respuestaVO.setEdad(edad);
        //Por default regresa un JSON
        return respuestaVO;
    }

}
