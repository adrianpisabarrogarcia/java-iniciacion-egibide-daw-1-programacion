
package Modelo;


import Modelo.Expediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;



public class BBDDCliente {
    
    
    private Connection con;
    
    public BBDDCliente(Connection con)
    {
        this.con = con;
    }
 
   
    public void registrarExpediente(Expediente e) throws Exception
    {
        String plantilla = "INSERT INTO expendiente VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ps.setInt(1, e.getNumExpediente());
        //Conversión de LocalDate a Date
        Date dateInicio = Date.valueOf(e.getFechaInicio());
        ps.setDate(2, dateInicio);
        //Conversión de LocalDate a Date
        Date dateFin = Date.valueOf(e.getFechaFIn());
        ps.setDate(3, dateFin);
        ps.setString(4, e.getEstado());
        ps.setString(5, e.getAsunto());
        ps.setString(6, e.getCategoria());
        ps.setString(7, e.getDNI_Cliente());  
        
     
        
        int n = ps.executeUpdate();
  
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
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
           expediente.setDNI_Cliente(res.getString("DNI_Cliente"));
           return expediente;
    }
    
    public ArrayList<Expediente> listaDePersonas() throws Exception
    {
        ArrayList<Expediente> listaExpedientes = new ArrayList();

        // Es más seguro con preparedStatement
        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("SELECT * FROM expediente");
        
        while(res.next())
        {
                 listaExpedientes.add(crearObjeto(res));
        }
        return listaExpedientes;
    }  
    
    
}
