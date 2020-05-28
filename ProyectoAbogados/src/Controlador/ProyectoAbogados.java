
package Controlador;
import Modelo.*;
import Excepciones.*;
import Modelo.BBDDExpediente;
import Vista.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * 
 * @author adrianpisabarrogarcia
 * @version 1.0
 * <h1>Desciption</h1>
 * <p>Project for the last term of Programming Subject.
 * <h1>License</h1>
 * <p>Creative Commons. BY 4.0. © 2020 <b>Departamento de Informática, Egibide.</b> Algunos derechos reservados.</p>
 * <p>Creative Commons. BY 4.0. © 2020 <b>Adrián Pisabarro García.</b></p>
 *  
 */


public class ProyectoAbogados {

    //INICIALIZACIÓN MODELO: BBDD
    private static BBDD bbdd;
    private static BBDDExpediente bbbddExpediente;
    private static BBDDCliente bbddCliente;
    
   
    //INICIALIZACIÓN: VISTAS    
    private static VentanaPrincipal vp;
    private static VentanaAnadirExpediente vae;
    private static VentanaAnadirCliente vac;
    
    
  
    
    public static void main(String[] args) {
        
        try {
            pruebaBBDD();
            inicializacionVentanas();
            
        } catch (Exception e) {
            System.out.println("Error grave. Main");
        }
         
        
    }
    
    //inicializacionVentanas
    public static void inicializacionVentanas(){
        try {
            //inicialización de ventanas
            vp = new VentanaPrincipal();
            vae = new VentanaAnadirExpediente();
            vac = new VentanaAnadirCliente();
            vp.setVisible(true);

            
        } catch (Exception e) {
            System.out.println("Error inicializando las ventanas disponibles. Metodo inicializacionVentanas");
        }
    }
    
    //prueba bbdd
    public static void pruebaBBDD(){
         try {
            //inicialización de bbdd
            bbdd = new BBDD();
            bbdd.conectar();
            bbbddExpediente = new BBDDExpediente(bbdd.getConnection());
            bbddCliente = new BBDDCliente(bbdd.getConnection());
            System.out.println("Conexión con éxito. Main.");
            //bbdd.desconectar();
            
        } catch (Exception e) {
            System.out.println("Error haciendo pueba de conexion de bbdd");
        }
    }
    
    
    //inserciones
    public static void insertarCliente(String DNI, String nombre, String direccion, String telefono1, String telefono2){
        try {
            Cliente c = new Cliente();
            
            
            
            c.setDNI(DNI); 
            c.setNombre(nombre);
            c.setDireccion(direccion);
            c.setTelefono1(telefono1);
            if (telefono2.isEmpty() || telefono2.equalsIgnoreCase("no obligatorio")) {
                telefono2=" ";
            }
            c.setTelefono2(telefono2);
            //JOptionPane.showMessageDialog(null, c.toString());
            bbddCliente.registrarCliente(c);
            
        } catch (Exception e) {
            System.out.println("Error insertando un cliente. Error en metodo insertarCliente."+e.getMessage());
        }
        
    }
    public static Cliente mostrarCliente(String DNI){
        Cliente c = new Cliente();

        try {
            c=bbddCliente.consultaCliente(DNI);  
            
        } catch (Exception e) {
            System.out.println("Imposible mostrar un cliente. Error metodo mostrarCliente: "+e.getMessage());
        }
        
        return c; 
    }
    public static void eliminarCliente(String DNI){
       
        try {
            bbddCliente.eliminarCliente(DNI);
            
        } catch (Exception e) {
            System.out.println("Imposible eliminar un cliente. Error metodo eliminarCliente: "+e.getMessage());
        }

    }
    public static void modificarCliente(String DNI, String nombre, String direccion, String telefono1, String telefono2){
        try {
            Cliente c = new Cliente();
            
            
            
            c.setDNI(DNI); 
            c.setNombre(nombre);
            c.setDireccion(direccion);
            c.setTelefono1(telefono1);
            if (telefono2.isEmpty() || telefono2.equalsIgnoreCase("no obligatorio")) {
                telefono2=" ";
            }
            c.setTelefono2(telefono2);
            //JOptionPane.showMessageDialog(null, c.toString());
            bbddCliente.modificarCliente(c);
            
        } catch (Exception e) {
            System.out.println("Error insertando un cliente. Error en metodo insertarCliente."+e.getMessage());
        }
        
    }

    public static void insertarExpediente(int NumExpediente, LocalDate FechaInicio, LocalDate FechaFin, String estadoExpediente, String asunto, String categoria, String DNIPersona){
        try {
            Expediente e = new Expediente();
            
            e.setNumExpediente(NumExpediente);
            e.setFechaInicio(FechaInicio);
            e.setFechaFIn(FechaFin);
            e.setEstado(estadoExpediente);
            e.setAsunto(asunto);
            e.setCategoria(categoria);
            e.setDNICliente(DNIPersona);

            bbbddExpediente.registrarExpediente2(e);
            
        } catch (Exception e) {
            System.out.println("Error insertando un expediente. Error en metodo insertarExpediente."+e.getMessage());
        }
        
    }
    public static Expediente mostrarExpediente(String numExpediente){
        Expediente ex = new Expediente();

        try {
            ex=bbbddExpediente.consultaExpediente(numExpediente);
            
        } catch (Exception e) {
            System.out.println("Imposible mostrar un expediente. Error metodo mostrarExpediente: "+e.getMessage());
        }
        
        return ex; 
    }
    
    public static int obtenerNumeroFilasExpediente(){
        int num =0;
        try {
            num = bbbddExpediente.numExpedientes();
        } catch (Exception e) {
            System.out.println("Error en metodo obtenerNumeroFilasExpediente: "+e.getMessage());
        }
        
        return num;
    }
    public static String mostrarDatosPersonaAsociada(String DNI){
        String datos="Los datos de la persona asociada son: \n";
        Cliente c = new Cliente();
        try {
            c=bbddCliente.consultaCliente(DNI);
            if (DNI.isEmpty()) {
                datos = "Cliente no encontrado";
            }else{
                datos=datos+c.toString2();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            System.out.println("Problemas encontrado clientes. Método: mostrarDatosPersonaAsociada ::"+e.getMessage());
        }
        
        return datos;
    }
    public static String mostrarDatosExpedienteAsociado(String DNI){
        String datos="";
        try {
                    ArrayList<Expediente> lista2 = bbbddExpediente.listaDeExpedientes(DNI);
                    for(int x = 0; x < lista2.size(); x++){
                        datos= datos + lista2.get(x).toString2();
                        
                        datos=datos+"\n";
                        datos=datos+"****************";
                        datos=datos+"\n";
                        
                    }
                        
        } catch (Exception e) {
            System.out.println("Problemas encontrado expedientes. metodo: mostrarDatosExpedienteAsociado: "+e.getMessage());
        }
        return datos;
    }

    //comprobaciones
    public static boolean comprobacionDNI(String cadena) {
        boolean error = true;
        
        Pattern pat;
        pat = Pattern.compile("[0-9]{8}[A-HJ-NP-TV-Z]");
        try {
            
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches()) {
                  //error = false;
                  throw new DatoNoValido();
            }
            
            
        } catch (DatoNoValido e) {
            //JOptionPane.showMessageDialog(null, "DNI No Valido");
            error = false;
        } 
        return error;
    }
    public static boolean comprobacionNombre(String cadena) {
        boolean error = true;
        
        Pattern pat;
        pat = Pattern.compile("[A-z]+[ ][A-z]+[ ][A-z]+");
        try {
            
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches()) {
                  //error = false;
                  throw new DatoNoValido();
            }
            
            
        } catch (DatoNoValido e) {
            //JOptionPane.showMessageDialog(null, "No has insertado bien el Nombre y los Apellidos. \nEj: Pepe Rodriguez Gutierrez");
             error = false;
        } 
        return error;
    }  
    public static boolean comprobacionTelefono(String cadena) {
        boolean error = true;
        
        Pattern pat;
        pat = Pattern.compile("[0-9]{9}");
        try {
            
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches()) {
                  //error = false;
                  throw new DatoNoValido();
            }
            
            
        } catch (DatoNoValido e) {
            //JOptionPane.showMessageDialog(null, "Teléfono No Valido");
            error = false;
        } 
        return error;
    }
    public static boolean comprobacionTelefono2(String cadena) {
        boolean error = true;
        
        Pattern pat;
        pat = Pattern.compile("[0-9]{9}");
        try {
            
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches() ) {
                if (cadena.isEmpty() || cadena.equalsIgnoreCase("no obligatorio")) {
                    error=true;
                }else{
                    throw new DatoNoValido();
                }         
            }
            
            
        } catch (DatoNoValido e) {
            //JOptionPane.showMessageDialog(null, "Teléfono No Valido");
            error = false;

        } 
        return error;
    }
    public static boolean comprobacionDireccion(String cadena) {
        boolean error = true;
        
        Pattern pat;
        pat = Pattern.compile("[A-z]+[[A-z]*[, ]*[0-9]*[-]?[º]?[/]?]+");
        try {
            
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches()) {
                  throw new DatoNoValido();
            }
            
            
        } catch (DatoNoValido e) {
            error = false;
        } 
        return error;
    }

    
  
    
    //Ver Ventanas
    public static void verVae(){
        try {
           // bbdd.conectar();

        } catch (Exception e) {
            System.out.println("Error coenctando bbdd. Metodo verVae");
        }
        vae.setVisible(true);
    }

    public static void verVac(){
        try {
           // bbdd.conectar();

        } catch (Exception e) {
            System.out.println("Error coenctando bbdd. Metodo verVac");
        }
        vac.setVisible(true);
    }

    
    //Salidas de Ventanas

    public static void salirVae(){
        try {
           // bbdd.desconectar();

        } catch (Exception e) {
            System.out.println("Error desconectando bbdd. Metodo salirVae");
        }
        vae.dispose();
    }
    public static void salirVac(){
        try {
            //bbdd.desconectar();

        } catch (Exception e) {
            System.out.println("Error desconectando bbdd. Metodo salirVac");
        }
        vac.dispose();
    }
    public static void salirVp(){
        try {
            bbdd.desconectar();

        } catch (Exception e) {
            System.out.println("Error desconectando bbdd. Metodo salirVp");
        }

        vp.dispose();
        System.exit(0);
    }
    
}
