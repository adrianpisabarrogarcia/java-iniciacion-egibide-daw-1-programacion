import javax.swing.JOptionPane;

public class Ejercicio9v2 {

	public static void main(String[] args) {
		int [] codigo  = {10,20,30,47,55,65,135,256,526,663};
		int [] unidadesVendidas = new int [10];
		boolean codigoEncontrado = false;
		int min=500;
		int pos = 0;
		int minCodigo;
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
			
					
			for(int i=0;i<(unidadesVendidas.length-1);i++){
	            for(int j=i+1;j<unidadesVendidas.length;j++){
	                if(unidadesVendidas[i]>unidadesVendidas[j]){
	                    int auxiliar=unidadesVendidas[i];
	                    unidadesVendidas[i]=unidadesVendidas[j];
	                    unidadesVendidas[j]=auxiliar;
	                    int auxiliarCodigo=codigo[i];
	                    codigo[i]=codigo[j];
	                    codigo[j]=auxiliarCodigo;
	 
	                }
	            }
	        }
			
			
			
			
			
			for (int i = 0; i < unidadesVendidas.length; i++) {
				if (unidadesVendidas[i]>0) {
					JOptionPane.showMessageDialog(null, "Las unidades vendidas "+unidadesVendidas[i]+" con el codigo: "+codigo[i]);

				}
			}
					
					
				
			
			
		} catch (condigoNoEncontrado e) {
			JOptionPane.showMessageDialog(null, "ERRORES. No ha encontrado el código");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRORES");
		}
		
		
		
		
	}

}
