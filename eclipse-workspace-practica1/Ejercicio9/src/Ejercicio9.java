import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {

		double nota= Double.parseDouble(JOptionPane.showInputDialog(null, "Pon una nota (del 0 al 10): "));
		
		
		if (nota<0 || nota>10) {
			JOptionPane.showMessageDialog(null, "introduce una nota entre 0 y 10");
			
		}else {
			if (nota<=2) {
				JOptionPane.showMessageDialog(null, "muy definciente");
			}
			else if (nota<5) {
				JOptionPane.showMessageDialog(null, "insuficiente");

			}else if (nota<6) {
				JOptionPane.showMessageDialog(null, "suficiente");
				
			}else if(nota<7){
				JOptionPane.showMessageDialog(null, "bien");

			}else if(nota<9) {
				JOptionPane.showMessageDialog(null, "notable");

			}else {
				JOptionPane.showMessageDialog(null, "sobresaliente");

			}
		}
			
	}
}

		
