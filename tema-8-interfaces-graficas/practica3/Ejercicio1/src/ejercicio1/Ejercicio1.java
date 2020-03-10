
package ejercicio1;
import Modelo.*;
import Vista.*;



public class Ejercicio1 {

    public static VistaAlmacen vAlmacen = new VistaAlmacen();
    public static VistaDialogo vDialogo = new VistaDialogo();

    
    public static void main(String[] args) {
        vAlmacen.setVisible(true);
         
    }
    
    public static void cancelarVAlmacen(){
        vAlmacen.dispose();
        vDialogo.setVisible(true);
    }
    
    public static void salirVDialogo(){
        vDialogo.dispose();
        System.exit(0);
    }
    
}
