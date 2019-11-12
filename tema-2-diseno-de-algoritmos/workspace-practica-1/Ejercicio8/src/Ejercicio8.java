import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {

		double nota= Integer.parseInt(JOptionPane.showInputDialog(null, "Pon una nota (del 0 al 10): "));

		if (nota<0 && nota>10) {
			JOptionPane.showMessageDialog(null, "El número introducido, no es váido. Vuelve a arrancar el programa");
			
		}else {
			if (nota<5) {
				
				JOptionPane.showMessageDialog(null, "Suspenso");

			}else {
				JOptionPane.showMessageDialog(null, "Aprobado");
			}
		}

	}
}
