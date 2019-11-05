import javax.swing.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		String cadena;
		String cadenaInvertida ="";		
		
		
		try {
			
			cadena = JOptionPane.showInputDialog(null, "Inserta una frase:");
			if (cadena.isEmpty()) {
				throw new esBlanco();
			}else {
				
				for (int i = cadena.length()-1; i>=0; i--) {
					cadenaInvertida = cadenaInvertida + cadena.charAt(i);
					
				}
				
				
			}
			JOptionPane.showMessageDialog(null, "La cadena invertida es: "+cadenaInvertida);
			
			
			
		} catch (esBlanco e) {
			JOptionPane.showMessageDialog(null, "Has dejado la cadena en blanco");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "PROBLEMAS");
		}
		
	}


}
