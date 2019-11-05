import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double [] num = new double[10];
		double max = 0;
		double min = 100;
		
		for (int i = 0; i < 10; i++) {
			num[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta un número: \n pos: "+(i+1)));
		}
		for (int i = 0; i < 10; i++) {
			if (max<num[i]) {
				max=num[i];
			}
			if (min>num[i]) {
				min=num[i];
			}
		}
		JOptionPane.showMessageDialog(null, "El numero máximo es: "+max);
		JOptionPane.showMessageDialog(null, "El numero mínimo es: "+min);	
		
	}

}
