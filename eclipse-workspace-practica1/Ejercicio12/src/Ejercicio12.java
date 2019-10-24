import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		double coste, min, descuento;
		min = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta los minutos que has estado hablando"));
		if (min<1) {
			JOptionPane.showInputDialog(null, "Inserta un valor positivo.");
		}else {
			if (min<=300) {
				coste = min * 0.04;
			}else {
				if (min<=500) {
					coste = min * 0.03;
			}
			if (min<500 && min<= 800) {
				coste = 300*0.03;
				min = min-300;
				coste = coste+(min*0.02);
			}else {
				coste = 300*0.03;
				min = min-300;
				coste = coste+(min*0.02);
				descuento = coste*1.25/100;
				coste = coste - descuento ;
				
			}
			JOptionPane.showMessageDialog(null, "El coste es de: "+coste);
			}			
		}
	}
}

		
