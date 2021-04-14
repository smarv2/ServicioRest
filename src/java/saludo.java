
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smarv
 */
@Path("saludo")
public class saludo {
    @GET
    public String oeprar(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido){
    return "Hola " + nombre + " " + apellido + ".";
    }
    
}
