
package Modelo;

import tema9ejercicio1.Tema9Ejercicio1;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TablaPersonas {
    
    private Connection con;

    public TablaPersonas(Connection con) {
        this.con = con;
    }
    
    
     public void insertar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO tPersonas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "UPDATE tpersonas SET edad =?, profesion =?, telefono =?  WHERE nombre =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setInt(1, p.getEdad());
        ps.setString(2, p.getProfesion());
        ps.setString(3, p.getTelefono());
        ps.setString(4, p.getNombre());
        
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
      public void borrar(Persona p) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "Delete from tpersonas where nombre =?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        //hubiera sido mejor poner de clave principal un id, pero como estoy haciendo simplemente una prueba
        //he puesto un nombre, en el próximo proyecto utilziaré un id. Y que poner un nombre de clave primaria
        //no esta bien
        ps.setString(1, p.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
    public ArrayList<Persona>  seleccionarTodo() throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
       
        // Con Statement también se puede porque no hay parametros.
        
        String plantilla = "select * from tPersonas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
// executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es un conjunto de filas y columnas
      // .next nos va a mover a la siguiente fila y va a devolver: true. Si estoy ya en la última fila devuelve: false.
       while(resultado.next())
       {
                // Crear objeto
                Persona p = new Persona();
                // resultado.get para coger el contenido de la columna dni que es un string
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(resultado.getInt("edad"));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("telefono"));
                
                lista.add(p);
       }
       return lista;
    }

    public ArrayList<Persona>  seleccionarTodoV2() throws Exception
    {
        // Esta nueva versión busca los vehiculos de una persona
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "select * from tPersonas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Persona p = new Persona();
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(resultado.getInt("edad"));
                p.setProfesion(resultado.getString("profesion"));
                p.setTelefono(resultado.getString("telefono"));
                
                lista.add(p);
       }
       return lista;
    }
    
    public Persona  seleccionarUna(String nombre) throws Exception
    {
        
        String plantilla = "select * from tPersonas where nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombre);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p.setNombre(resultado.getString("nombre"));
           p.setEdad(resultado.getInt("edad"));
           p.setProfesion(resultado.getString("profesion"));
           p.setTelefono(resultado.getString("telefono"));

           return p;
       }
       else
           JOptionPane.showMessageDialog(null, "No existe nadie con ese nombre");
           return null;
    }
    
    
}
