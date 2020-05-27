
package Modelo;


import Modelo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class BBDDCliente {
    
    
    private Connection con;
    
    public BBDDCliente(Connection con)
    {
        this.con = con;
    }
 
   
    public void registrarCliente(Cliente c) throws Exception
    {
        String plantilla = "INSERT INTO cliente VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setString(1, c.getDNI());
        ps.setString(2, c.getNombre());
        ps.setString(3, c.getDireccion());
        ps.setString(4, c.getTelefono1());
        ps.setString(5, c.getTelefono2());
     
        //JOptionPane.showMessageDialog(null,c.toString());
        int n = ps.executeUpdate();
  
        if (n != 1){
            throw new Exception("El número de filas actualizadas no es uno");

        }
    }


   public Cliente consultaCliente(String dni) throws Exception
   {
       Cliente cliente=null;
 
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM cliente WHERE DNI = ? ");
       consulta.setString(1, dni);
       ResultSet res = consulta.executeQuery();

       // ¡Atención! Solo 1 cliente con ese numero
       if(res.next())
       {
          cliente=crearObjeto(res);
       }
       else
            throw new Exception ("Cliente no encontrado");
 
       return cliente;
    }
   
   public void eliminarCliente(String dni) throws Exception
   {
       Cliente cliente=new Cliente();
 
       PreparedStatement delete = con.prepareStatement("DELETE FROM cliente WHERE DNI = ?");
       delete.setString(1, dni);
       int res = delete.executeUpdate();

       // ¡Atención! Solo 1 cliente con ese numero
       if(res != 1)
            throw new Exception ("Cliente no encontrado");
      
 
    }
   
   
   
   

    public Cliente crearObjeto(ResultSet res) throws Exception
    {
           Cliente cliente= new Cliente();
           
           cliente.setDNI(res.getString("DNI"));
           cliente.setNombre(res.getString("nombre"));
           cliente.setDireccion(res.getString("direccion"));
           cliente.setTelefono1(res.getString("telefono1"));
           cliente.setTelefono2(res.getString("telefono2"));
           
           
           return cliente;
    }
    

    public ArrayList<Cliente> listaClientes() throws Exception
    {
        ArrayList<Cliente> listaClientes = new ArrayList();

        // Es más seguro con preparedStatement
        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("SELECT * FROM cliente");
        
        while(res.next())
        {
                 listaClientes.add(crearObjeto(res));
        }
        return listaClientes;
    } 
    /*
    public ArrayList<Cliente> listaClientes() throws Exception
    {
        ArrayList<Cliente> listaClientes = new ArrayList();

        // Es más seguro con preparedStatement
        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("SELECT * FROM cliente WHERE DNI = ? ");
        
        while(res.next())
        {
                 listaClientes.add(crearObjeto(res));
        }
        return listaClientes;
    }  
    */

    
    
}
