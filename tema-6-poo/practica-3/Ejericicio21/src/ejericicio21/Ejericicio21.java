
package ejericicio21;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Ejericicio21 {
    
    public static void main(String[] args) {
        try {
            introducirAlumnos();
            
            
        } catch (DatoNoValido e) {
            JOptionPane.showMessageDialog(null, "Dato mal introducido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errores");
        }
        
    }
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static void introducirAlumnos() throws Exception{
        
        
        
    }
    
    
    
}
