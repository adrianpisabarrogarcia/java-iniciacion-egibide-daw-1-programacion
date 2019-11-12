
package ejercicio5;
import java.util.*;
import javax.swing.JOptionPane;
import java.time.*;
        
public class Ejercicio5 {
    public static void main(String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Inserta los días"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Inserta los meses"));
        int annios = Integer.parseInt(JOptionPane.showInputDialog("Inserta los años"));
        
        try {
            LocalDate fecha = LocalDate.of(annios, meses, dias);
            fecha = fecha.plusDays(100);
            JOptionPane.showMessageDialog(null, "Sumándole 100 días a la fecha"+dias+"/"+meses+"/"+annios+" la fecha ahora es\n"+fecha.getDayOfWeek()+", "+fecha.getDayOfMonth()+" "+fecha.getMonth()+" of "+fecha.getYear());
            
            
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mal insertadas las fechas");
        }
        

        
        
    }
    
}
