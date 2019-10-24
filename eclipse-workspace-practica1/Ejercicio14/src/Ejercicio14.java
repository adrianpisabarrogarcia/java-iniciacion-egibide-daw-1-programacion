import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int suma, resultado, contador;
		suma=0;
		resultado=0;
		contador=0;
		

		do {
			suma = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número"));
			resultado = resultado + suma;
			contador ++;
						
		} while (contador<10);
		JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es: "+ resultado);

	}
}


		
