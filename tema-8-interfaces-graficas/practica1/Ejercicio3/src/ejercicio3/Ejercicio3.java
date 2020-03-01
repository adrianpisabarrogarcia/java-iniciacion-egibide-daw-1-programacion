
package ejercicio3;
import Vistas.*;
import java.util.ArrayList;


public class Ejercicio3 {
    public static VCompras vCompras = new VCompras();
    public static VRegistrar vRegistrar = new VRegistrar();
    public static VVentas vVentas = new VVentas();
    public static ArrayList listaPersonas = new ArrayList();
    
    
    public static void main(String[] args) {
        vRegistrar.setVisible(true);
    }
    
    
   // abrir-cerrar ventanas  de VRegistrar
    public static void VentanaCompras() {
        vCompras.setVisible(true);
    }
    public static void CerrarVentanaCompras() {
        vCompras.dispose();
    }
    public static void VentanaVentas() {
        vVentas.setVisible(true);
    }
    public static void CerrarVentanaVentas() {
        vVentas.dispose();
    }
    public static void Salir() {
        vRegistrar.dispose();
        System.exit(0);
    }

    

  
}
