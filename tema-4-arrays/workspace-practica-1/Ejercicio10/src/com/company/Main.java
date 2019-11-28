package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int matriz [][] = new int[4][4] ;

        String comand
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
                1();
                break;
            case 2:
                2();
                break;
            case 3:
                3();
                break;
            case 4:
                4();
                break;
            case 5:
                5();
                break;
            case 6:
                6();
                break;
            case 7:
                7();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No has insertado el número adecuado, veulve a ejecutar el programa.");
        }
    }



    //Rellenar toda la matriz de números;
    public static void 1(String[] args) {


    }
    //Rellenar toda la matriz de números;
    public static void 2(String[] args) {


    }
    //Rellenar toda la matriz de números;
    public static void 3(String[] args) {


    }
    //Rellenar toda la matriz de números;
    public static void 4(String[] args) {


    }
    //Rellenar toda la matriz de números;
    public static void 5(String[] args) {


    }
    //Rellenar toda la matriz de números;
    public static void 6(String[] args) {


    }


}
