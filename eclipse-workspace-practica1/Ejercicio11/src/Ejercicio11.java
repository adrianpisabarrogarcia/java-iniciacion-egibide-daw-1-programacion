import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta otro número: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta otro número: "));
	
		if (num1>num2) {
			if (num1>num3) {
				JOptionPane.showMessageDialog(null, "El numero mayor es" + num1);
				if (num2>num3) {
					JOptionPane.showMessageDialog(null, "El numero menor es" + num3);

				}else {
					
					JOptionPane.showMessageDialog(null, "El numero menor es" + num2);
				}
			}else {
				JOptionPane.showMessageDialog(null, "El numero mayor es" + num3);
				if (num2>num3) {
					JOptionPane.showMessageDialog(null, "El numero menor es" + num3);

				}else {
					
					JOptionPane.showMessageDialog(null, "El numero menor es" + num2);
				}
				
			}			
		}else {
			if (num2>num3) {
				JOptionPane.showMessageDialog(null, "El numero mayor es" + num2);
				if (num1>num3) {
					JOptionPane.showMessageDialog(null, "El numero menor es" + num3);

				}else {
					
					JOptionPane.showMessageDialog(null, "El numero menor es" + num1);
				}
			}else {
				JOptionPane.showMessageDialog(null, "El numero mayor es" + num3);
				if (num1>num3) {
					JOptionPane.showMessageDialog(null, "El numero menor es" + num3);

				}else {
					
					JOptionPane.showMessageDialog(null, "El numero menor es" + num1);
				}
				
			}	
		}	
		
		
			
	}
}

		
