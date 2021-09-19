/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;
import Modelos.ModeloPrincipal;
import javax.swing.JTable;
/**
 *
 * @author OscarEstid
 */
public interface InterfacePrincipal {
     
     public boolean registrar(ModeloPrincipal modelo);
     public void obtener(JTable contenedor);
     public boolean actualizar(ModeloPrincipal modelo);
     public boolean eliminar(ModeloPrincipal modelo);
    
}
