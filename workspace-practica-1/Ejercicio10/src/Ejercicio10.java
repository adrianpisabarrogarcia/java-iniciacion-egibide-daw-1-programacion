import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número del 1 al 7 para identificarlo con el día de la semana: "));

			switch (numSemana) {
			case 1:
				JOptionPane.showMessageDialog(null, "Lunes");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Martes");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Miércoles");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Jueves");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Viernes");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Sábado");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Domingo");
				break;
			default:
				JOptionPane.showMessageDialog(null, "El valor introducido es incorrecto, escriba un valor del 1 al 7");
				break;   //- no es necesario
			}				
			
	}
}

		
