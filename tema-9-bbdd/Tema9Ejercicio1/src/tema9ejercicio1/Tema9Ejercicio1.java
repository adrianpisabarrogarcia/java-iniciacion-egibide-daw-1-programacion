/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9ejercicio1;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Tema9Ejercicio1 {

    private static BBDD bd;
    private static TablaPersonas tp;
    
    private static VPrincipal vp;
    private static VPersonaSelect vpersel;
    private static VPersona vper;
    private static VPersonasSelect vpertod;
    
    public static Persona p;
    
    public static void main(String[] args) {
        
        try
        {
                // Abrir la conexion con una base de datos
                bd = new BBDD();
                bd.conectar();
                tp=new TablaPersonas(bd.getCon());

                
                
                vper = new VPersona();
                vpersel = new VPersonaSelect();
                vpertod = new VPersonasSelect();
                
                vp = new VPrincipal();
                vp.setVisible(true);
                
        }
        catch(Exception e)
        {
            bd.desconectar();
            System.out.println(e.getMessage());
        }
    }
    //salidas de vistas
    public static void salirVPrincipal(){
        vp.dispose();
        System.exit(0);
    }
    public static void salirVPersona(){
        vper.dispose();
    }
    public static void salirVPersonaSelect(){
        vpersel.dispose();
    }
    public static void salirVPersonasSelect(){
        vpertod.dispose();
    }
    //muestreo de vistas
    public static void mostrarVPersonaSelect(){
        vpersel.setVisible(true);
    }
    public static void mostrarVPersona(){
        vper.setVisible(true);
        //falta por incluir una insertación de bbdd fijarse en la clase controlador del otro proyecto
    }
    public static void mostrarVPersonasSelect(){
        vpertod.setVisible(true);
    }
    
    //otros métodos controladores
    public static void insertarPersona(String nombre,int edad, String profesion, String telefono) throws Exception
    {
           // Insertar una persona
                p = new Persona(nombre, edad, profesion, telefono);
                tp.insertar(p);
    }
    public static void mostrarPersona(String nombre) throws Exception
    {
           // Insertar una persona
                //int edad = 0; String profesion=""; String telefono =""; 
                //p = new Persona(nombre, edad, profesion, telefono);
            
                p = new Persona();
                p.setEdad(tp.seleccionarUna(nombre).getEdad());
                p.setProfesion(tp.seleccionarUna(nombre).getProfesion());
                p.setTelefono(tp.seleccionarUna(nombre).getTelefono());
                
    }
    public static String mostrarTodasPersonas() throws Exception
    {
        /*
        comprobaciones mías:
        tp.seleccionarTodo();
        System.out.println(tp.seleccionarTodo());
        */
        
        
        String datos="";
        ArrayList<Persona> lista2 = tp.seleccionarTodo();
        for(int x = 0; x < lista2.size(); x++)
            datos= datos + lista2.get(x).toString();
        return datos;

                
    }
    
    
    
    
    
    
}
    