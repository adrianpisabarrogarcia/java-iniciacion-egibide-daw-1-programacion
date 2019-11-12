import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		String estadoCivil, nivelEstudio, combinacionesStrings;
		int sueldo;
		final int horasNormales = 10;
		final int horasExtras = 15;
		final int plus = 100;
		
		
		
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta el número de horas que ha trabajado el trabajador:"));
		if (horas>40) {
			sueldo = 40 * horasNormales;
			horas = horas - 40;
			sueldo = sueldo + (horas * horasExtras);
		}else {
			sueldo = horas * horasNormales;
		}
		estadoCivil = JOptionPane.showInputDialog(null, "Inserta el estado civil de la persona: S de soltero, C de casado, V de viudo, D de divorciado...");
		nivelEstudio = JOptionPane.showInputDialog(null, "Inserta el nivel de studios: P  de  primario,  M  de  medo  y  S  desuperior...");
		combinacionesStrings = estadoCivil + nivelEstudio;
		if (combinacionesStrings.equalsIgnoreCase("SP") || combinacionesStrings.equalsIgnoreCase("VS") || combinacionesStrings.equalsIgnoreCase("SM")  || combinacionesStrings.equalsIgnoreCase("CS") || combinacionesStrings.equalsIgnoreCase("VP") || combinacionesStrings.equalsIgnoreCase("SS") || combinacionesStrings.equalsIgnoreCase("DS")) {
			sueldo = sueldo + plus;
		}
		// combinacionesStrings.compareTo("SP") == 0;
		//equals te devuelve un booleano y el compare to te devuelve un número
		JOptionPane.showMessageDialog(null, "Este mes ingresa el trabajador: "+sueldo+"€");
	}

}
