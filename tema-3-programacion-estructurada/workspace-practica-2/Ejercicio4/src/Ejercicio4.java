import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int nota1, nota2, nota3, nota4, nota5, nota6;
		double notaMediaAlumno, notaMediaGrupo = 0;
		int i = 0;
		//finalBucle = " "; 
		
		System.out.println("Inserta el nombre del alumno o escribe fin para dejar de introducir nombres: ");
		nombre = entrada.nextLine();
		do {
			System.out.println("Inserta la nota de la asignatura 1:");
			nota1 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 2:");
			nota2 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 3:");
			nota3 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 4:");
			nota4 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 5:");
			nota5 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 6:");
			nota6 = entrada.nextInt();
			System.out.println("Inserta la nota de la asignatura 6:");
			notaMediaAlumno = (nota1+nota2+nota3+nota4+nota5+nota6)/6;
			notaMediaGrupo = notaMediaGrupo + notaMediaAlumno;
			System.out.println("Nombre: "+nombre+"   Asignatura1: "+nota1+"   Asignatura2: "+nota2+"   Asignatura3: "+nota3+"   Asignatura4: "+nota4+"   Asignatura5: "+nota5+"   Asignatura6: "+nota6+"   NOTA MEDIA: "+notaMediaAlumno);
			nombre = entrada.nextLine();
			System.out.println("Inserta el nombre del alumno o escribe fin para dejar de introducir nombres: ");
			nombre = entrada.nextLine();
			
			i++;
		} while (!nombre.equalsIgnoreCase("fin"));
		notaMediaGrupo = notaMediaGrupo / i;
		System.out.println("La nota media del grupo de "+i+" personas es: "+notaMediaGrupo);	
	
	}

}
