import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		double peso, estatura;
		int edad, numero_ninas_aptos, numero_ninos_apto;
		String nombre, sexo;

		numero_ninas_aptos = 0;
		numero_ninos_apto = 0;
		
		
		for (int contador_alumnos = 0; contador_alumnos < 30; contador_alumnos++) {
			JOptionPane.showMessageDialog(null, "Vamos a insertar una persona "+ contador_alumnos);
			peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica el peso"));
			edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Indica la edad"));
			nombre = JOptionPane.showInputDialog(null, "Indica el nombre");
			sexo = JOptionPane.showInputDialog(null, "Indica el sexo. <hombre> ó <mujer>");
			estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica estatura"));
			//Comparación de strings se hace de la siguiente manera:
			if (sexo.equals("hombre")  && estatura>1.7 && peso>70) {
				numero_ninos_apto ++;
				//o de la siguiente
			}else if (sexo.compareTo("mujer") == 0 && estatura>1.6 && peso>60) {
				numero_ninas_aptos ++;
			}
		}
		JOptionPane.showMessageDialog(null, "El número de niños aptos para jugar son: "+ numero_ninos_apto);
		JOptionPane.showMessageDialog(null, "El número de niñas aptas para jugar son: "+ numero_ninas_aptos);

	}
}


		
