
package Controlador;
import Modelo.*;
import Modelo.BBDDExpediente;
import Vista.*;
import java.time.LocalDate;
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
    /*
    private static AnadirExpediente vanadirexpediente;
    private static ModificarExpediente vmodificarexpediente;
    private static AnadirCliente vanadircliente;
    private static ModificarCliente vmodificarcliente;
    */
    
    
    
    public static void main(String[] args) {
        
        
        //inicialización de bbdd
        bbdd = new BBDD();
        bbdd.conectar();
        bbbddExpediente = new BBDDExpediente(bbdd.getConnection());
        bbddCliente = new BBDDCliente(bbdd.getConnection());
        JOptionPane.showMessageDialog(null, "Conexión con éxito");
        
        //prueba de inserción de expediente
        insertarExpediente();
        JOptionPane.showMessageDialog(null, "Expediente insertado");
        
        
        
        //inicialización de ventanas
        vp = new VentanaPrincipal();
        vp.setVisible(true);
        
    }
    
    
    public static void insertarExpediente(){
        try {
            Expediente e = new Expediente();
        
            e.setNumExpediente(250);
            LocalDate date1 = LocalDate.of(2018, 10, 30);
            e.setFechaInicio(date1);
            LocalDate date2 = LocalDate.of(2019, 10, 30);
            e.setFechaFIn(date2);
            e.setEstado("Archivado");
            e.setAsunto("ERTE no justo");
            e.setCategoria("Laboral");
            e.setDNI_Cliente("123");
            

            bbbddExpediente.registrarExpediente(e);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO Insertado el expediente");
        }

        
    }
    
    //Salidas de Ventanas
    
    
    
    
    
    
    
    
    
    public static void salirVp(){
        //bdcon.desconectar();
        vp.dispose();
        System.exit(0);
    }
    
}
