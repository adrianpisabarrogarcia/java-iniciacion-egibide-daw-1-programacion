
package ejercicio1;
import javax.swing.JOptionPane;
import persona.*;
import vehiculo.*;
import Excepciones.*;




public class Ejercicio1 {

    
    public static void main(String[] args) {
        try {
            relaciones();
            insertarPersona();
            

            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRORES");
        }catch (DatoNoValido e){
            JOptionPane.showMessageDialog(null,"DATOS NO VÁLIDOS");

        }
        
    }
    
    
    public static void relaciones() throws Exception{
        //Creación de objeto de persona
        Persona persona = datosPersona();

        
    }
    
    
    public static void insertarPersona() throws DatoNoValido{
        
        
    }
    
}
