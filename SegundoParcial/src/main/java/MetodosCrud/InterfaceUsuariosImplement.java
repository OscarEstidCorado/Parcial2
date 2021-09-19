/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Conexion.ClsConexion;
import PantallasGraficas.PantallaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author OscarEstid
 */
public class InterfaceUsuariosImplement implements InterfaceUsuarios{

     public boolean Verificar(String usuario, String contraseña) {
          Connection conn = null;
          PreparedStatement stmt= null;
          ResultSet rs = null;
          boolean correcto = false;
          String sql = "select *from usuariosreg where nombre = '"+usuario+"'and contraseña = '"+contraseña+"' ";
          
           try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();
               
               if(rs.next()){
                    correcto = true;
                   if(correcto = true){
                        PantallaPrincipal form = new PantallaPrincipal();
                        form.setVisible(true);
                   }
               }else{
                        JOptionPane.showMessageDialog(null,"Error, el usuario no existe o escribiste mal");
                      
                   }
               
          } catch (SQLException ex) {
               ex.printStackTrace(System.out);
          }finally{
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(rs);
               ClsConexion.CloseConection(conn);
          }
          return correcto;
          
          
     }
     
}
