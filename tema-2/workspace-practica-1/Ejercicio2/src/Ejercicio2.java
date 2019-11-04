import javax.swing.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int k = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta la cantidad de datos que quieres introducir:"));
		int [] num = new int[k];
		int suma= 0;
		for (int i = 0; i < (k); i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Iserta un número del 0 al 9"));
			suma = suma + num[i];
		}

		JOptionPane.showMessageDialog(null, "La suma de los "+(k)+" arrays es: "+suma);
		
	}

}
