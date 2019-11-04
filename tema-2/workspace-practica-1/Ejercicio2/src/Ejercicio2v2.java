import javax.swing.*;
import java.util.*;

public class Ejercicio2v2 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random(System.currentTimeMillis());
		int k = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta la cantidad de datos que quieres introducir:"));
		int [] num = new int[k];
		int suma= 0;
		for (int i = 0; i < (k); i++) {
			num[i] = aleatorio.nextInt(10);
			JOptionPane.showMessageDialog(null, "El número Aleatorio es: "+num[i]);
			suma = suma + num[i];
	        
		}
		JOptionPane.showMessageDialog(null, "La suma de los "+(k)+" arrays es: "+suma);
		
	}

}
