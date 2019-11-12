
package ejercicio4v3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.*;

public class ejercicio4v3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String fecha1 = JOptionPane.showInputDialog("Inserta fecha1 en formato dd/mm/yyyy: ");
        String fecha2 = JOptionPane.showInputDialog("Inserta fecha2 en formato dd/mm/yyyy: ");
        try {
            LocalDate fecha1Conversion = LocalDate.parse(fecha1, formatter);
            LocalDate fecha2Conversion = LocalDate.parse(fecha2, formatter);
            Period period = Period.between(fecha1Conversion, fecha2Conversion);
            JOptionPane.showMessageDialog(null, "La diferencia de días es de "+period.getDays()+" y la de meses es "+period.getMonths()+" y la de años es "+period.getYears()+"\n Las dos fechas eran:\nFecha1: "+fecha1+"\nFecha2: "+fecha2);
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fecha mal introducida");
        }
             
        

    }
}
