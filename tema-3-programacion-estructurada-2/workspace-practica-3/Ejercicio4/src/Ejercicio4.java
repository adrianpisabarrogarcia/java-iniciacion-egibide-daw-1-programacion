import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Date fechaActual = new Date();
		System.out.println(fechaActual); //Igual
		Calendar fechaUno = Calendar.getInstance();
		System.out.println(fechaUno);
		System.out.println(fechaUno.getTime()); //Igual
		Calendar fechaDos = Calendar.getInstance();
		fechaDos.set(2015, 2, 16);
		fechaDos.set();
		System.out.println(fechaDos.getTime());
		

	}

}
