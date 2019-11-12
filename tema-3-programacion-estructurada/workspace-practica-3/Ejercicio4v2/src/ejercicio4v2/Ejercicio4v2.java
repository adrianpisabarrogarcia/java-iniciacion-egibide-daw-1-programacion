
package ejercicio4v2;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import java.time.*;


public class Ejercicio4v2 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String fecha1 = JOptionPane.showInputDialog("Inserta fecha 1 en el formato dd/mm/yyyy");
        String fecha2 = JOptionPane.showInputDialog("Inserta fecha 2 en el formato dd/mm/yyyy");
        try {
            
            Date fecha1Conversion = formatter.parse(fecha1);
            Date fecha2Conversion = formatter.parse(fecha2);
            Long milisegundos = fecha1Conversion.getTime() - fecha2Conversion.getTime() ;
            JOptionPane.showMessageDialog(null, milisegundos);
            Long dias = milisegundos / (24*60*60*1000);
            JOptionPane.showMessageDialog(null, "La diferencia entre "+fecha1+" y "+fecha2+" es de "+dias+" dias");


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha mal introducida.");
        }
    }
    
}
