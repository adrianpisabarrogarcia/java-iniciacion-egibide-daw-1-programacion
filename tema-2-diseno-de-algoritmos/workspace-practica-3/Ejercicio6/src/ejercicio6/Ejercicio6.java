package ejercicio6;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
       final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
       final LocalDate VERANO = LocalDate.of(2019,6,21);
       final LocalDate OTONO = LocalDate.of(2019,9,21);
       final LocalDate INVIERNO = LocalDate.of(2019,12,21);
       
       int dias = Integer.parseInt(JOptionPane.showInputDialog("Inserta dia"));
       int meses = Integer.parseInt(JOptionPane.showInputDialog("Inserta mes"));
        try {
            LocalDate fechaParaComprobar = LocalDate.of(2019,meses,dias);
       
        if (fechaParaComprobar.isBefore(PRIMAVERA)) {
            JOptionPane.showMessageDialog(null, "Invierno");
        }else{
            if (fechaParaComprobar.isBefore(VERANO)) {
                JOptionPane.showMessageDialog(null, "Primavera");
            }else{
                if (fechaParaComprobar.isBefore(OTONO)) {
                    JOptionPane.showMessageDialog(null, "Verano");
  
                }else{
                    JOptionPane.showMessageDialog(null, "Otoño");

                }
            }
        }
            
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(null, "Fecha mal introducida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS");
        }
       

       
    }
    
}
