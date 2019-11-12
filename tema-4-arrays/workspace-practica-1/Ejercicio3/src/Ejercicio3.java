import javax.swing.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numIntroducido;
		char[] s;	
		boolean bucle;
		String cadena;
		cadena= "";
		
		bucle = true;
		
		s=new char[26];
		for ( int i=0; i<26; i++) {
			s[i] = (char) ('A' + i);
		}
		
			do {
				try {
						numIntroducido = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número para que te salga la letra correspondiente a ese número"));
						if (numIntroducido == -1) {
							bucle = false;
						}if (numIntroducido<-1 || numIntroducido>25) {
							throw new teHasSalido();
						}if (numIntroducido>-1 && numIntroducido <26) {
							JOptionPane.showMessageDialog(null, "La letra correspondiente es: "+s[numIntroducido]);
							cadena = cadena + s[numIntroducido];
						}
						
					} catch (teHasSalido e) {
						JOptionPane.showMessageDialog(null, "No has introducido un valor correcto entre -1 y 25");
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "PROBLEMAS");
					}
				
				} while (bucle != false);
				JOptionPane.showMessageDialog(null, "Cadena unida: "+cadena);
			
			
		
		
	}

}

