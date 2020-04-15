
package ejercicio3;
import Modelo.Producto;
import Vistas.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;


public class Ejercicio3 {
    public static VCompras vCompras;
    public static VRegistrar vRegistrar;
    public static VVentas vVentas;
    public static ArrayList <Producto> listaProductos = new ArrayList();
    public static VProductos vProductos = new VProductos();
    
    
    public static void main(String[] args) {
        
        inicializarProductos(); 
        vCompras = new VCompras();
        vRegistrar = new VRegistrar();
        vVentas = new VVentas();
 
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
    public static void VerProductos() {
        vProductos.setVisible(true);
    }
    public static void VolverAtrasProductos() {
        vVentas.dispose();
        vCompras.dispose();
        vProductos.dispose();
        vRegistrar.setVisible(true);
    }

    private static void inicializarProductos() {
        Producto p = new Producto();
        p.setNombre("Manzanas");
        p.setPrecioUnitario(2.5);
        p.setUnidades(100);
        listaProductos.add(p);
        
        p.setNombre("Kiwis");
        p.setPrecioUnitario(0.8);
        p.setUnidades(250);
        listaProductos.add(p);
        
        p.setNombre("Oranges");
        p.setPrecioUnitario(4.75);
        p.setUnidades(200);
        
        listaProductos.add(p);
        p.setNombre("Peras");
        p.setPrecioUnitario(3);
        p.setUnidades(150);
        listaProductos.add(p);
    }
    
    public static String mostrarProductos(){
        String mensaje = "";
        
        for (Iterator iterator = listaProductos.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            mensaje=mensaje + next.toString();
        }
        
        return mensaje;
        
    }
    
    public static void llenarComboBox(JComboBox jComBoxProducts){
        /*int i = 0;
        for (Iterator iterator = listaProductos.iterator(); iterator.hasNext();) {
            Producto p = (Producto)iterator.next();
            String nombre= p.getNombre();
            jComBoxProducts.addItem(nombre);
            i++;
        }*/
        
        for (int j = 0; j < listaProductos.size(); j++) {
            String nombre= listaProductos.get(j).getNombre();
            jComBoxProducts.addItem(nombre);
           
        }
                
    }
    
    

  
}
