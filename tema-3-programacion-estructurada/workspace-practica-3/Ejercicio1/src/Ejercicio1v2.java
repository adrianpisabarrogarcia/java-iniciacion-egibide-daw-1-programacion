import javax.swing.*;
public class Ejercicio1v2 {

	public static void main(String[] args) {
			String cadena = JOptionPane.showInputDialog(null, "Inserta una fase para contar cuantas vocales tiene: ");
			int vocales = 0;
			
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u' || cadena.charAt(i)=='A' || cadena.charAt(i)=='E' || cadena.charAt(i)=='I' || cadena.charAt(i)=='O' || cadena.charAt(i)=='U') {
					vocales ++;
				}
			}
			JOptionPane.showMessageDialog(null, "El mensaje: <"+cadena+"> tiene "+vocales+" vocales");
				
		
	}

}