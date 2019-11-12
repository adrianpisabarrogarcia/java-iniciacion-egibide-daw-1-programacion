import java.util.Scanner;
import java.util.Random;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random rand = new Random();
		
		
		int numEntrada, numAleatorio;
		numAleatorio = rand.nextInt(101);
		
		System.out.println("Inserta un número: ");
		try {
			numEntrada = entrada.nextInt();
			
			while (numEntrada != numAleatorio) {
				if (numEntrada>-1 && numEntrada<101) {
					if (numEntrada < numAleatorio) {
						System.out.println("El numero es menor, introduce un número mayor");
					}else {
						System.out.println("El numero es mayor, introduce un número menor");
					}
				}else {
					throw new numeroNoValido();
				}				
					
				System.out.println("Inserta un número: ");
				numEntrada = entrada.nextInt();
			}
			System.out.println("Felicidades has encontrado el número");
			
		} catch (numeroNoValido e) {
			System.out.println("No me has dado un valor número comprendido entre 0 y 100");
		} catch (Exception e) {
			System.out.println("No me has dado un valor numérico");
		} finally {
			System.out.println("Proceso terminado.");
		}
		
	}
}


		

