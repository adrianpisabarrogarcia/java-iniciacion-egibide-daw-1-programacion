import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int nota, aprobados;
		String finalizarBucleEntrada;
		aprobados = 0;
		
		do {
			nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta una nota: "));
			if (nota<0 && nota>10) {
				JOptionPane.showMessageDialog(null, "Inserta una nota válida");
				
			}else {
				if (nota>=6) {
					aprobados ++;				
				}
			}
			finalizarBucleEntrada = JOptionPane.showInputDialog(null, "Inserta un <no> para no meter más datos sino escribe <si>");
			
			
		} while (finalizarBucleEntrada.compareTo("no") != 0);
		
		JOptionPane.showMessageDialog(null, "Ha aprobado esta cantidad de personas: " + aprobados);
		
		
		
	}
}


		

