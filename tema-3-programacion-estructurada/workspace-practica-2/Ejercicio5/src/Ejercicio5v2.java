import java.util.*;

public class Ejercicio5v2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		Integer numAleatorio = aleatorio.nextInt(1000);
		while (numAleatorio<100) {
			numAleatorio = aleatorio.nextInt(1000);
		}
		String numAleatorioString = Integer.toString(numAleatorio);
		System.out.println("El número aleatorio es: " + numAleatorioString);
		System.out.println();
		System.out.println("Inserta un número para jugar a HERIDOS Y MUERTOS: ");
		Integer num = entrada.nextInt();
		String numString = Integer.toString(num);

		int heridos = 0;
		int muertos = 0;
		
		//calcula muertos
		for (int i = 0; i < numAleatorioString.length(); i++) {
			if (numAleatorioString.charAt(i) == numString.charAt(i)) {
				muertos ++;
			}
		}
		//calcula heridos
		for (int i = 0; i < numAleatorioString.length(); i++) {
			
			for (int j = 0; j < numString.length(); j++) {
				if ((numAleatorioString.charAt(i) != numString.charAt(i)) && (numAleatorioString.charAt(i) == numString.charAt(j))) {
					//comprobación:
					//System.out.println(numAleatorioString.charAt(i) +"  "+ numString.charAt(j));
					heridos ++;
				}
			}
		}
		System.out.println("Hay " + muertos + " muertos.");
		System.out.println("Hay " + heridos + " heridos.");

		
		
	}

}
