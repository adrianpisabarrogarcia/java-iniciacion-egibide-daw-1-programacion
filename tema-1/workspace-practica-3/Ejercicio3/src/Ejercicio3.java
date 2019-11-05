import javax.swing.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		String cadena;
		String letraRepetidora;
		int contadorLetraRepetidora = 0;	
		
		JOptionPane.showMessageDialog(null, "Vamos a verificar cuantas veces se repite una letra en una cadena DE CARACTERES (sólo de carácteres).");
		try {
			cadena = JOptionPane.showInputDialog(null, "Inserta una frase:");
			letraRepetidora = JOptionPane.showInputDialog(null, "Inserta la letra que quieres contabilizar:");
			
			//EXCEPCIONES BUSCAR
			for (int i = 0; i < cadena.length(); i++) {
		        char charAt2 = cadena.charAt(i);
		        if (!Character.isLetter(charAt2)) {
		            throw new campoErroneo();
		        }
		    }
			for (int i = 0; i < letraRepetidora.length(); i++) {
		        char charAt2 = letraRepetidora.charAt(i);
		        if (!Character.isLetter(charAt2)) {
		            throw new campoErroneo();
		        }
			} if (cadena.isEmpty() || letraRepetidora.isEmpty()) {
				throw new esBlanco();
			} if (letraRepetidora.length()>1) {
				throw new limiteLetra();
			} else {
			
				//COMIENZA EL PROGRAMA
				cadena = cadena.toLowerCase();
				letraRepetidora = letraRepetidora.toLowerCase();
				//Convierto la letra repetidora a un solo char
				char letraRepetidoraChar = letraRepetidora.charAt(0);
				
				
				for (int i = 0; i < cadena.length(); i++) {
					//voy a convertir un string a un caracter para despues hacer la comparación con el mismo sistema: char
					char cadenaI = cadena.charAt(i);
					if (cadenaI == letraRepetidoraChar) {
						contadorLetraRepetidora ++;
					}
				}				
			}
			JOptionPane.showMessageDialog(null, "La letra "+letraRepetidora+ " se repite: "+contadorLetraRepetidora+" veces en la fase: "+cadena);
			
			
			
		} catch (campoErroneo e) {
			JOptionPane.showMessageDialog(null, "Datos mal introducidos, contienen otros caracteres que no son letras la entrada de datos.");
		} catch (limiteLetra e) {
			JOptionPane.showMessageDialog(null, "El límite letras es 1");
		} catch (esBlanco e) {
			JOptionPane.showMessageDialog(null, "Has dejado la cadena en blanco");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "PROBLEMAS");
		}
		
	}


}
