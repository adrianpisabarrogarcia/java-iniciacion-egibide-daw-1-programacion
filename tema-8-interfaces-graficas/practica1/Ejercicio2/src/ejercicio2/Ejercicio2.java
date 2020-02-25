
package ejercicio2;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class Ejercicio2 {

    public static V1 v1 = new V1();
    public static V2 v2 = new V2();
    public static ArrayList listaPersonas = new ArrayList();
    
    
    public static void main(String[] args) {
        v1.setVisible(true);
    }
    
    public static void salirV1(){
        v1.dispose();
        v2.setVisible(true);
    }
    public static void salirV2(){
        v2.dispose();
        System.exit(0);
    }
    
    public static void guardar(String nombre, String apellidos, String DNI){
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setDNI(DNI);
        listaPersonas.add(p);
        
        
        
    }
    
    public static String mostrar() {
        String mensaje ="";
       for (int i = 0; i < listaPersonas.size(); i++) {
           mensaje= mensaje + listaPersonas.get(i) +"\n" ;
       }
       return mensaje;
    }
}
