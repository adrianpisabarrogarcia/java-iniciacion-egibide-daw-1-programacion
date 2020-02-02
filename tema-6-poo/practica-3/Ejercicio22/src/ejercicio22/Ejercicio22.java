
package ejercicio22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio22 {
        ArrayList<Libro> listadeLibros = new ArrayList<>();
        ArrayList<Disco> listadeDiscos = new ArrayList<>();
        ArrayList<Pelicula> listadePeliculas = new ArrayList<>();

    public static void main(String[] args) throws DatoNoValido {
        boolean bucleFin = true;
        try {
            while(bucleFin){
                insertarobra();
                int mensajeConfirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres seguir introduciendo datos?");
                if(mensajeConfirmacion==1 || mensajeConfirmacion==2){
                    bucleFin = false;
                }
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errores");
        }
        
    }
    
    public static void insertarobra() throws DatoNoValido{
        try {
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Inserta:\n"
                + "1. Insertar Libro"
                + "2. Insertar Disco"
                + "3. Insertar Película"));
            switch(seleccion){
                case 1:
                    rellenarLibro();
                    break;
                case 2:
                    rellenarDisco();
                    break;
                case 3:
                    rellenarPelicula();
                    break;
                default:
                    throw new DatoNoValido();
            }
            
        } catch (DatoNoValido e) {
            JOptionPane.showMessageDialog(null, "Dato mal introducido");
        }
        
    }
    
    public static void rellenarLibro(){
        
        
    }
    public static void rellenarDisco(){
        
    }
    public static void rellenarPelicula(){
        
    }
    
    
    
    
}
