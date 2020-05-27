
package Modelo;


import Modelo.Expediente;
import Modelo.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;



public class BBDDExpediente {
    
    
    private Connection con;
    
    public BBDDExpediente(Connection con)
    {
        this.con = con;
    }
    
    
    public void registrarExpediente2(Expediente e) throws Exception
    {
        String plantilla = "INSERT INTO expediente VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(1, e.getNumExpediente());
            //Conversión de LocalDate a Date
            //Date dateInicio = Date.valueOf(f.getFechaInicio());

            ps.setDate(2, java.sql.Date.valueOf(e.getFechaInicio()));
            //Conversión de LocalDate a Date
            //Date dateFin = Date.valueOf(f.getFechaFIn());
            ps.setDate(3, java.sql.Date.valueOf(e.getFechaFIn()));
            ps.setString(4, e.getEstado());
            ps.setString(5, e.getAsunto());
            ps.setString(6, e.getCategoria());
            ps.setString(7, e.getDNICliente());  
     
        //JOptionPane.showMessageDialog(null,c.toString());
        int n = ps.executeUpdate();
  
        if (n != 1){
            throw new Exception("El número de filas actualizadas no es uno");

        }
    }
    


   public Expediente consultarPersona(int numExpediente) throws Exception
   {
       Expediente expediente=null;
 
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM expediente WHERE numExpediente = ? ");
       consulta.setInt(1, numExpediente);
       ResultSet res = consulta.executeQuery();

       // ¡Atención! Solo 1 expediente con ese numero
       if(res.next())
       {
          expediente=crearObjeto(res);
       }
       else
            throw new Exception ("Persona no encontrada");
 
       return expediente;
    }

    public Expediente crearObjeto(ResultSet res) throws Exception
    {
           Expediente expediente= new Expediente();
           expediente.setNumExpediente(res.getInt("numExpediente"));
            //Conversión de Date a LocalDate!
            Date date = res.getDate("fechaInicio");
            LocalDate locald = date.toLocalDate();
           expediente.setFechaInicio(locald);
            Date date2 = res.getDate("fechaFin");
            LocalDate locald2 = date2.toLocalDate();
           expediente.setFechaFIn(locald2);
           expediente.setEstado(res.getString("estado"));
           expediente.setAsunto(res.getString("asunto"));
           expediente.setCategoria(res.getString("categoria"));
           expediente.setDNICliente(res.getString("DNI_Cliente"));
           
           return expediente;
    }
    
    public ArrayList<Expediente> listaDeExpedientes(String DNI) throws Exception
    {
        ArrayList<Expediente> listaExpedientes = new ArrayList();
        try {
            
             PreparedStatement consulta = con.prepareStatement("SELECT * FROM expediente WHERE DNI_Cliente = ? ");
             consulta.setString(1, DNI);
             ResultSet res = consulta.executeQuery();
            
            while(res.next())
            {
                     listaExpedientes.add(crearObjeto(res));
            }
            
        } catch (Exception e) {
            System.out.println("Query error bbddexpediente listaDeExpedientes: "+e.getMessage());
        }
        
        return listaExpedientes;
    }  
    
       public int numExpedientes() throws Exception
   {
       Expediente expediente=null;
 
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM expediente ");
       ResultSet res = consulta.executeQuery();
        int numeroFilas = 0;
        try {
            res.last();
            numeroFilas = res.getRow();
            //resultSet.beforeFirst();
        }
        catch(Exception e) {
            System.out.println("error encontrando el numero de filas");
        }
        return numeroFilas;
    }

    
}
