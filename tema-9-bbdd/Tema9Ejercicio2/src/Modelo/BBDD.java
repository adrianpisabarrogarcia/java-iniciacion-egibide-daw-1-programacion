
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import javax.swing.JOptionPane;

public class BBDD {
    
    private Connection con;

    //¿Por qué creamos este método?
    public BBDD() {
    }
    
   public void conectar(){
       try{
               // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="t9ej1";
                 String url = "jdbc:mysql://localhost/"+bd;
                 String login="root";
                 String password = "";
                 con = DriverManager.getConnection(url,login,password);
 
                if (con==null){
                       throw new Exception("Problemas con la conexión");
                 }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
           JOptionPane.showMessageDialog(null,"Imposible conectar");
       }
   }
   
   public void desconectar(){
       try
       {
            con.close();
       }
       catch(Exception e)
       {
           System.out.println("Problemas cerrando la conexión");
       }
   }
   
   public Connection getCon()
   {
       return con;
   }
    
}
