import javax.swing.*;
public class Ejercicio1v3withExceptions {

	public static void main(String[] args) {
		boolean correcto = true;
		do {
			try {
				String cadena = JOptionPane.showInputDialog(null, "Inserta una fase para contar cuantas vocales tiene: ");
				if (cadena.isEmpty()) {
					throw new enBlanco();
				}
				int vocales = 0;
				
				for (int i = 0; i < cadena.length(); i++) {
					switch (cadena.charAt(i)) {
					case 'a':	case 'A':
					case 'e':	case 'E':
					case 'i':	case 'I':
					case 'o':	case 'O':
					case 'u':	case 'U':
						vocales ++;
						break;
					}
				}
				JOptionPane.showMessageDialog(null, "El mensaje: <"+cadena+"> tiene "+vocales+" vocales");
				correcto = true;
			} catch (enBlanco e) {
				JOptionPane.showMessageDialog(null, "El mensaje esta en blanco. ERROR.");
				correcto = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRORES.");
				correcto = false;
			}
			
		} while (correcto != true);
	}

}