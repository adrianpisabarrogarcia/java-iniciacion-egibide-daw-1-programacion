import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		int [] codigo  = {10,20,30,47,55,65,135,256,526,663};
		int [] unidadesVendidas = new int [10];
		boolean codigoEncontrado = false;
		int min=500;
		int codigoBucle=0;
		int max=0;
		boolean salirBucle = true;
		String imprimirLineas ="";
		try {
			do {
				int codigoIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo del producto:")) ;
				for (int i = 0; i < codigo.length; i++) {
					if (codigoIntroducido==codigo[i]) {
						codigoEncontrado = true;
						int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero de unidades del producto "+codigo[i]+":"));
						unidadesVendidas[i]= cantidad + unidadesVendidas[i];
						i=10;
					}
				}
				if (codigoEncontrado==true) {
					String continuar = JOptionPane.showInputDialog("¿quieres insertar otro código? si o no:");
					if (continuar.equalsIgnoreCase("si")) {
						
					}else {
						
						salirBucle=false;
					}
				}else {
					throw new condigoNoEncontrado();
				}
				
			} while (salirBucle!=false);
			for (int j = 0; j < unidadesVendidas.length && max<unidadesVendidas[j]; j++) {
					for (int i = 0; i < unidadesVendidas.length; i++) {
						if (unidadesVendidas[i]<min) {
							min=unidadesVendidas[i];
							codigoBucle = codigo[i];
							max = min;
						}
					}
					JOptionPane.showMessageDialog(null, "Se han vendido "+min+ " unidades del codigo de producto: "+codigoBucle+"\n");	
			}
			
			
		} catch (condigoNoEncontrado e) {
			JOptionPane.showMessageDialog(null, "ERRORES. No ha encontrado el código");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRORES");
		}
		
		
		
		
	}

}
