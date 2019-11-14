import javax.swing.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Introducir texto");
		String textoMinusuclas = texto;
		char [] cadena = new char [texto.length()];
		for (int i = 0; i < cadena.length; i++) {
			char letra = textoMinusuclas.charAt(i);
			cadena [i]= textoMinusuclas.charAt(i);
		}
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
	}

}

