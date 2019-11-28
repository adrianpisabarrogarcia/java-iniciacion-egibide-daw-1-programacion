import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		boolean salirBucle = true;
		boolean salirBucleNumeroFaltas = true;
		int [] codigoAlumno = new int[5];
		int [] numeroFaltas = new int[5];
		String imprimirLineas ="";
		
			
				//do {
					for (int i = 0; i < codigoAlumno.length && salirBucle==true; i++) {
						codigoAlumno[i]= Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo numérico del alumno:"));
						do {
							int horas= Integer.parseInt(JOptionPane.showInputDialog("Iserta el número de horas que ha faltado:"));
							numeroFaltas[i]= numeroFaltas[i] + horas;
							String finblucle1= JOptionPane.showInputDialog("¿desea seguir introduciendo horas a este alumno? si o no");
							if (finblucle1.equalsIgnoreCase("si")) {
								
							}if (finblucle1.equalsIgnoreCase("no")) {
								salirBucleNumeroFaltas=false;
							}
						} while (salirBucleNumeroFaltas!=false);
						String finblucle2= JOptionPane.showInputDialog("¿desea seguir introduciendo otro alumno? si o no");
						if (finblucle2.equalsIgnoreCase("si")) {
							
						}if (finblucle2.equalsIgnoreCase("no")) {
							salirBucle=false;
						}
					}
				//} while (salirBucle!=false);
			
		for (int j = 0; j < numeroFaltas.length; j++) {
			if (codigoAlumno[j]!=0) {
				imprimirLineas=imprimirLineas+"El alumno "+codigoAlumno[j]+" ha tenido en este mes "+numeroFaltas[j]+" faltas.\n";
			}
		}
		JOptionPane.showMessageDialog(null, imprimirLineas);
	}

}
