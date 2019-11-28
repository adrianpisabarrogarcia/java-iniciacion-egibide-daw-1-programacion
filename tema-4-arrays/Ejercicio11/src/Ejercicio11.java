import javax.swing.*;
public class Ejercicio11 {
	
	public static String [][] golosinasNombre = new String [4][4];
	public static double [][] golosinasPrecio = {{1.1, 0.8, 1.5, 0.9},
			{1.8, 1, 1.2, 1},
			{1.8, 1.3, 1.2, 0.8},
			{1.5, 1.1, 1.1, 1.1}};
	public static int [][] golosinasCantidad = new int [4][4];
	public static int [][] golosinasVentas = new int [4][4];
	public static boolean finalPrograma = false;

	public static void main(String[] args) {
		datosArrays();
		do {
			panelImprimir();
		} while (finalPrograma == false);
			

	}
	
	public static void datosArrays(){
		golosinasNombre[0][0] = "KitKat";
		golosinasNombre[0][1] = "Chicles de fresa";
		golosinasNombre[0][2] = "Lacasitos";
		golosinasNombre[0][3] = "Palotes";
		
		golosinasNombre[1][0] = "Kinder Bueno";
		golosinasNombre[1][1] = "Bolsa variada Haribo";
		golosinasNombre[1][2] = "Chetoos";
		golosinasNombre[1][3] = "Twix";
		
		golosinasNombre[2][0] = "Kinder bueno";
		golosinasNombre[2][1] = "M&M";
		golosinasNombre[2][2] = "Papa Delta";
		golosinasNombre[2][3] = "Chicles de menta";
		
		golosinasNombre[3][0] = "Lacasitos";
		golosinasNombre[3][1] = "Crunch";
		golosinasNombre[3][2] = "Milkybat";
		golosinasNombre[3][3] = "Kitkat";
		
		for (int i = 0; i < golosinasCantidad.length; i++) {
			for (int j = 0; j < golosinasCantidad.length; j++) {
				golosinasCantidad [i][j] = 5;
			}
		}
			
		
	}
	
	public static void panelImprimir() {
		try {
			int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número según la operación que quieras desarrollar:"
					+ "\n 1.- Pedir golosinas"
					+ "\n 2.- Mostrar golosinas"
					+ "\n 3.- Rellenar golosinas"
					+ "\n 4.- Apagar máquina"));
			switch (seleccion) {
				case 1:
					pedirGolosinas();
					finalPrograma = false;
					break;
				case 2:
					mostrarGolosinas();
					finalPrograma = false;
					break;
				case 3:
					rellenarGolosinas();
					finalPrograma = false;
					break;
				case 4:
					mostrarVentas();
					JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA");
					finalPrograma = true;
					break;
	
				default:
					throw new NumeroIncorrecto();
			}
			
		}
		catch (NumeroIncorrecto e) {
			JOptionPane.showMessageDialog(null, "No has introducido un numero correcto.");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRORES");
		}
		
	}
	
	//1
	public static void pedirGolosinas() {
		try {
			String golosinas = " ";
			for (int i = 0; i < golosinasNombre.length; i++) {
				for (int j = 0; j < golosinasNombre.length; j++) {
					golosinas=golosinas+"\n"+ (i+1)+(j+1)+".- "+golosinasNombre[i][j];
				}
				golosinas=golosinas+" \n ";
			}
			String numGolosina = JOptionPane.showInputDialog("Inserta la golosina que quieras: \n"+golosinas);
			int numFila = (numGolosina.charAt(0)-'0')-1;
			int numColumna = (numGolosina.charAt(1)-'0')-1;
			
			if ((numFila==0 || numFila==1 || numFila==2 || numFila==3) &&  (numColumna==0 || numColumna==1 || numColumna==2 || numColumna==3)) {
				if (golosinasCantidad[numFila][numColumna]==0) {
					JOptionPane.showMessageDialog(null, "No hay más golosinas del producto "+ golosinasNombre[numFila][numColumna]);
										
				}else{
					golosinasCantidad[numFila][numColumna]= golosinasCantidad[numFila][numColumna]-1;
					JOptionPane.showMessageDialog(null, "El producto "+ golosinasNombre[numFila][numColumna]+" ahora tiene "+golosinasCantidad[numFila][numColumna]+" disponibles");
				}
				
			}else {
				throw new NumeroIncorrecto();
			}
			
		} catch (NumeroIncorrecto e) {
			JOptionPane.showMessageDialog(null, "Has introducido el Número Incorrecto");
		}
		
		
		
		
	}
	//2
	public static void mostrarGolosinas() {
		
	}
	//3
	public static void rellenarGolosinas() {
	
	}
	//4
	public static void mostrarVentas() {
		String imprimirValores= "";
		for (int i = 0; i < golosinasVentas.length; i++) {
			for (int j = 0; j < golosinasVentas.length; j++) {
				imprimirValores = imprimirValores+ "El producto: "+golosinasNombre[i][j] + " se ha vendido " + golosinasVentas[i][j]+" cantidades\n";
			}
			imprimirValores= imprimirValores +"\n";
			
		}
		JOptionPane.showInputDialog(imprimirValores);
		
	}

}
