
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;
//import Excepciones.*;


public class BBDD {

    //datos de conexion
    /*
    private String bd = "proyectoabogados";
    private String login = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/"+bd;
    */
    private String bd = "empren40_proyectoabogados";
    private String login = "empren40_abogado";
    private String password = "y-HE3Amc~.$Z";
    private String url = "jdbc:mysql://gnld15.siteground.eu/"+bd;
    
    
    //objeto conexión 
    private Connection connection;
    
    
    public BBDD(){}
  
    public void conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,password);
 
         if (connection==null){
            throw new Exception();
         }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas con la conexión");
        }
        
  
   }
    
    public Connection getConnection(){
      return connection;
   }
 
    public void desconectar() throws Exception{
      connection.close();
   }
    
}
