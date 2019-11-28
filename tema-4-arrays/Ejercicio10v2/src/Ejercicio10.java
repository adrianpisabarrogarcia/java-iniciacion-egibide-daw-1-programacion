import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static int matriz [][] = new int[4][4] ;
	
	
    public static void main(String[] args) {
        

	    int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número correspondiente para realizar las operaciones " +
                "\n1.- Rellenar toda la matriz de números " +
                "\n2.- suma de una fila" +
                "\n3.- Suma de una columna que se pedirá al usuario" +
                "\n4.- Sumar la diagonal principal" +
                "\n5.- Sumar la diagonal inversa" +
                "\n6.- La media de todos los valores de la matriz" +
                "\n7.- Salir"));
        switch (seleccion){
            case 1:
                programa1();
                break;
            case 2:
            	programa2();
                break;
            case 3:
            	programa3();
                break;
            case 4:
            	programa4();
                break;
            case 5:
            	programa5();
                break;
            case 6:
            	programa6();
                break;
            case 7:
            	//no hacer nada, solo salir.
                break;
            default:
                JOptionPane.showMessageDialog(null, "No has insertado el número adecuado, veulve a ejecutar el programa.");
        }
    }



    //Rellenar toda la matriz de números;
    public static void programa1() {
        for (int i = 0; i < matriz.length; i++) {
        	for (int j = 0; j < matriz.length; j++) {
				
			}
			
		}
        
    }
    //suma de una fila
    public static void programa2() {


    }
    //Suma de una columna que se pedirá al usuario
    public static void programa3() {


    }
    //Sumar la diagonal principal
    public static void programa4() {


    }
    //Sumar la diagonal inversa
    public static void programa5() {


    }
    //La media de todos los valores de la matriz
    public static void programa6() {


    }

}
