import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String visualNet, cobol, java, sql;
		
		visualNet = JOptionPane.showInputDialog(null, "Inerta <apto> ó <no apto> para el lenguaje Visual.Net");
		cobol = JOptionPane.showInputDialog(null, "Inerta <apto> ó <no apto> para el lenguaje Cobol");
		java = JOptionPane.showInputDialog(null, "Inerta <apto> ó <no apto> para el lenguaje Java");
		sql = JOptionPane.showInputDialog(null, "Inerta <apto> ó <no apto> para el lenguaje SQL");
		
		if (sql.equalsIgnoreCase("apto") && cobol.equalsIgnoreCase("apto")) {
			if (visualNet.equalsIgnoreCase("apto") && java.equalsIgnoreCase("apto") ) {
				JOptionPane.showMessageDialog(null,  "Sobresaliente");
			}else if (visualNet.equalsIgnoreCase("apto") || java.equalsIgnoreCase("apto")) {
				JOptionPane.showMessageDialog(null,  "Notable");
			}else {
				JOptionPane.showMessageDialog(null,  "Bien");
			}
		}else if(java.equalsIgnoreCase("apto") || visualNet.equalsIgnoreCase("apto")) {
			if (sql.equalsIgnoreCase("apto")) {
				JOptionPane.showMessageDialog(null,  "Suficiente");

			}else if (cobol.equalsIgnoreCase("apto")) {
				JOptionPane.showMessageDialog(null,  "Suficiente");
			}else {
				JOptionPane.showMessageDialog(null,  "Insuficiente");
			}
		}else {
			JOptionPane.showMessageDialog(null,  "Insuficiente");

		}	
	
	}

}
