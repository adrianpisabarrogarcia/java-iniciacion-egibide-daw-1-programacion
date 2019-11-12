import javax.swing.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		String mesIntroducido;
		mesIntroducido="";
		boolean existe = false;
		
		String [] meses = new String[12];
			meses[0] = "ENERO";
			meses[1] = "FEBRERO";
			meses[2] = "MARZO";
			meses[3] = "ABRIL";
			meses[4] = "MAYO";
			meses[5] = "JUNIO";
			meses[6] = "JULIO";
			meses[7] = "AGOSTO";
			meses[8] = "SEPTIEMBRE";
			meses[9] = "OCTUBRE";
			meses[10] = "NOVIEMBRE";
			meses[11] = "DICIEMBRE";
		
		try {
			
			mesIntroducido = JOptionPane.showInputDialog(null, "Introduce el mes: ");
			String mesIntroducidoMayusculas = mesIntroducido.toUpperCase();
			
			for (int i = 0; i < meses.length; i++) {
				if (mesIntroducidoMayusculas.equals(meses[i])) {
					JOptionPane.showMessageDialog(null, "El mes introducido existe");
					existe = true;
				}
			}
			if (existe == true) {
				JOptionPane.showMessageDialog(null, "FIN PROGRAMA");

			}else {
				JOptionPane.showMessageDialog(null, "No hemos encontrado el mes. FIN PROGRAMA");

			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "PROBLEMAS");
			
		}
		
	}

}

