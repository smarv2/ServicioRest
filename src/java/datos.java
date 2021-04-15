
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
@Path("datos")
public class datos {

    @GET
    public RespuestaVO oeprar(@QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido, @QueryParam("edad") int edad) {
        RespuestaVO respuestaVO = new RespuestaVO();
        respuestaVO.setNombreCompleto(nombre + " " + apellido);
        respuestaVO.setEdad(edad);
        //Por default regresa un JSOON
        return respuestaVO;
    }

}
