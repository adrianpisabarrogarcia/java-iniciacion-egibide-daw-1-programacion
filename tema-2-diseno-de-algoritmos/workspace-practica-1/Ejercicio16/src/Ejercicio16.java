import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String finalBucle;
		double promedio;
		int edad, contador, suma;
		contador = 0;
		suma = 0;
		
		do {
			System.out.println("Inserta la edad del estudiante: ");
			edad = entrada.nextInt();
			contador ++;
			suma = suma + edad;
			promedio = suma / contador;
			System.out.println("¿Quieres volver a introducir el dato? Pulsa <no> para parar de introducir datos y dar la media directamente");
			finalBucle = entrada.next();
				
		} while ( finalBucle.compareTo("no") != 0);
		
		System.out.println("El promedio de edades de " + contador + " este numero de personas es: "+promedio);
		
		
		
		
	}
}


		

