import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ejercicio8 {

	public static Scanner entrada = new Scanner(System.in);
	public static boolean correcto = true;
	
	public static void main(String[] args) {
		
		String entradaPrincipal;
		
		do {
			try {
				System.out.println("INSERTA UNA LETRA PARA HACER DIFERENTES PROGRAMAS:");
				System.out.println("***************************************************");
				System.out.println("a) Calcular la edad de una persona.");
				System.out.println("b) Sumar dos números.");
				System.out.println("c) Contar cuantas vocales hay en una cadena.");
				System.out.println("d) Salir");
				entradaPrincipal = entrada.next();
				
				if (entradaPrincipal.length()>1) {
					throw new longitud();
				}
				if (entradaPrincipal.isEmpty()) {
					throw new enBlanco();
				}
				
				switch (entradaPrincipal) {
				case "a":	case "A":
					a();
					correcto = false;
					break;
				case "b":	case "B":
					b();
					correcto = false;
					break;
				case "c":	case "C":
					c();
					correcto = false;
					break;
				case "d":	case "D":
					correcto = true;
					System.out.println("Saliendo del programa");
					break;

				default:
					throw new Exception();
				}
				
				
				
			} catch (enBlanco e) {
				System.out.println("NO HAS INTRODUCIDO NADA. ERROR.");
				System.out.println(" ");
				correcto = false;
			} catch (longitud e) {
				System.out.println("LONGITUD DE ENTRADA INCORRECTA, HAS METIDO M�S DE UN CAR�CTER. ERROR.");
				System.out.println(" ");
				correcto = false;
			} catch (Exception e) {
				System.out.println("ERROR introduciendo los datos.");
				System.out.println(" ");
				correcto = false;
			}
		} while (correcto != true);
	}
	
	public static void a() {
		try {
			//formato que tienen que tener las fechas. Cuando insertamos una fecha necesitamos darle un formato, para ello utilizamos este codigo:
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        //para introducir una fecha sugerimos de que forma escribirla y además la insertamos en un string para después hacer la conversión a una fecha y que la entienda java
	        System.out.println("Teclea una fecha dd/MM/yy");
	        String fechaString = entrada.next();
	        //tenemos que convertir ese string en un LocalDate, si eso no va bien saltará una excepción DateTimeParseException que le tendrás que poner un catch
	        LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);
	        //creamos una fecha con la fecha local del ordenador
	        LocalDate fechaActual = LocalDate.now();
	        //existe un método llamado period.between() que saca la diferencia de las dos fechas.
			Period edad = Period.between(fechaNacimiento, fechaActual);
			//imprimimos solo lo que necesitamos:
			System.out.println("La diferencia de edad es: "+edad.getYears());
	        
			//System.out.print(edad.getDays()+"/"+edad.getMonths()+"/"+edad.getYears());
	        
		} catch (DateTimeParseException e) {
			System.out.println("Fecha mal introducida.");
		} catch (Exception e) {
			System.out.println("Errores.");
		}
		
        
        
        
        
	}
	public static void b() {
		
		do {
			try {
				System.out.println("Teclea un número");
				int num1 = entrada.nextInt();
				System.out.println("Teclea otro número");
				int num2 = entrada.nextInt();
				System.out.println("la suma de "+num1+" + "+num2+" = "+(num1+num2));
				
				
				
				
				correcto = true;
			} catch (Exception e) {
				System.out.println("ERROR. Valor introducido es incorrecto.");
				correcto = false;
			}
			
		} while (correcto != true);
		
	}
	public static void c() {
		do {
			try {
				System.out.println("inserta una frase para contar cuantas vocales hay en la frase");
				String cadena = entrada.nextLine();
				cadena = entrada.nextLine();
				if (cadena.isEmpty()) {
					throw new enBlanco();
				}
				int vocales = 0;
				
				for (int i = 0; i < cadena.length(); i++) {
					switch (cadena.charAt(i)) {
					case 'a':	case 'A':
					case 'e':	case 'E':
					case 'i':	case 'I':
					case 'o':	case 'O':
					case 'u':	case 'U':
						vocales ++;
						break;
					}
				}
				System.out.println("El mensaje: <"+cadena+"> tiene "+vocales+" vocales");
				correcto = true;
			} catch (enBlanco e) {
				System.out.println( "El mensaje esta en blanco. ERROR.");
				correcto = false;
			}catch (Exception e) {
				System.out.println("ERRORES.");
				correcto = false;
			}
			
		} while (correcto != true);
	}
	

}