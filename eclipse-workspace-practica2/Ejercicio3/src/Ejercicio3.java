import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int seleccion, num1, num2, solucion;
		
		System.out.println("Introduce un número del 1 al 5 según la operación que quieras hacer");
		System.out.println("1.- Sumar dos numeros");
		System.out.println("2.- Restar dos numeros");
		System.out.println("3.-Visualizar la tabla de multiplicar de un numero");
		System.out.println("4.- Visualizar el cociente y el resto de una división");
		System.out.println("5.-Salir del programa");
		seleccion = entrada.nextInt();
		switch (seleccion) {
		case 1:
			System.out.println("Introduce dos numeros");
			num1 = entrada.nextInt();
			num2 = entrada.nextInt();
			System.out.println("La suma de los dos números es: "+(num1+num2));
			break;
		case 2:
			System.out.println("Introduce dos numeros");
			num1 = entrada.nextInt();
			num2 = entrada.nextInt();
			System.out.println("La resta de los dos números es: "+(num1-num2));
			break;
		case 3:
			System.out.println("Introduce un numero para crear la tabla de multiplicar de ese numero");
			num1 = entrada.nextInt();
			for (int i = 0; i < 11; i++) {
				System.out.println(num1+" * "+i+" = "+(num1*i));
			}
			break;
		case 4:
			System.out.println("Introduce dividendo:");
			num1 = entrada.nextInt();
			System.out.println("Introduce divisor:");
			num2 = entrada.nextInt();
			int cociente = num1/num2;
			System.out.println("El cociente es: " +cociente);
			int resto = num1 % num2;
			System.out.println("El resto es: " +resto);
			break;
		case 5:
			System.out.println("Adios");

			break;
		default:
			System.out.println("No has introducido un número válido");
			break;
		}
	
	}

}
