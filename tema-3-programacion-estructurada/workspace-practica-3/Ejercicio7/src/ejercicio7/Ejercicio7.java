
package ejercicio7;
import java.util.*;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.DateTimeFormatter;



public class Ejercicio7 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int contadorDomingos = 0;
        
        String fecha1 = JOptionPane.showInputDialog("Insertar fecha en formato dd/mm/yyyy");
        String fecha2 = JOptionPane.showInputDialog("Insertar fecha en formato dd/mm/yyyy");

        try {
            LocalDate fecha1Conversion = LocalDate.parse(fecha1, formatter);
            LocalDate fecha2Conversion = LocalDate.parse(fecha2, formatter);
            
            while(fecha1Conversion.isBefore(fecha2Conversion)){
                if (fecha1Conversion.getDayOfWeek()==DayOfWeek.SUNDAY)
                    contadorDomingos++;
                fecha1Conversion = fecha1Conversion.plusDays(1);
              }
            
            JOptionPane.showMessageDialog(null, "Entre la fecha "+fecha1+" y la fecha "+fecha2+", hay: "+contadorDomingos+" domingo(s).");
            
            
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(null, "Has introducido mal ma fecha.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORES");
        }
    }
    
}
