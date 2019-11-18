package CadenaCaracteres;

import javax.swing.*;

public class CadenaCaracteres {

	public static void main(String[] args) {
		int contador = 0;
		
		
		String cadena = JOptionPane.showInputDialog("Inserta la cadena");
		for (int i = 0; i < cadena.length(); i++) {
			char cadena1 = cadena.charAt(i);
			
			if (cadena1=='a' || cadena1=='e' || cadena1 =='i'|| cadena1 =='o' || cadena1 =='u') {
				contador ++;
			}
			
			JOptionPane.showMessageDialog(null, "Hay "+contador+" vocales.");
			
		}
		
	}

}
