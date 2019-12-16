package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    //Variables globales
    public static ArrayList<Double> numeros = new ArrayList();
    public static int seleccion;

    //main
    public static void main(String[] args) {
        boolean terminarBuucle = false;
        do {
            try {
                introducirArray();
                do {
                    panelSeleccion();
                    switch (seleccion){
                        case 1:
                            maxMin();
                            break;
                        case 2:
                            buscarNumero();
                            break;
                        case 3:
                            buscarNumero();
                            break;
                        case 4:
                            convertirArray();
                            break;
                        case 5:
                            mostrarElementosArayList();
                            break;
                        case 6 :
                            insertarElemento();
                            break;
                        case 7 :
                            insertarElementoPosicionConcreta();
                            break;
                        case 8:
                            borrarElemento();
                            break;
                        case 9:
                            sumaPromedio();
                            break;
                        case 10:
                            terminarBuucle = true;
                            JOptionPane.showMessageDialog(null,"FIN DEL PROGRAMA");
                            break;
                    }

                } while (seleccion != 10);


            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas");
            }

            

        }while (terminarBuucle == false);
	    
    }

    //metodos
    public static void introducirArray() throws Exception{
        boolean bucleFin = false;
        double x;
        do {
            try {
                x = Double.parseDouble(JOptionPane.showInputDialog("Inserta un numero:"));
                /*if (x == JOptionPane.NO_OPTION) {
                    salirdelprograma();
                }*/
                numeros.add(x);

                String finalBucleIntroducirArrays = JOptionPane.showInputDialog("Inserta <s>/<n> si deseas continuar o no.");
                switch (finalBucleIntroducirArrays){
                    case "s":
                        break;
                    case "n":
                        bucleFin = true;
                        break;
                    default:
                        throw new malIntroducido();
                }

            } catch (malIntroducido e){
                JOptionPane.showMessageDialog(null, "Dato mal introducido");
            }

        } while(bucleFin == false);






    }

    public static void panelSeleccion(){
        //boolean bucleFin = false;
        double x;
        //do {
            try{
                seleccion = Integer.parseInt(JOptionPane.showInputDialog("Inserta un numero:" +
                        "\n1.  Visualizar el valor máximo y el mínimo." +
                        "\n2.  Solicitar un número y buscarlo. Muestra un mensaje indicando si lohas encontrado o no." +
                        "\n3.  Solicitar un número, buscarlo y borrarlo. Sino se encuentra muestraun mensaje de error." +
                        "\n4.  Convertir el arrayList en un array." +
                        "\n5.  Si no esta vacío, mostrar el número de elementos que contiene." +
                        "\n6.  Insertar un nuevo elemento por el final." +
                        "\n7.  Insertar un nuevo elemento en la posición que te indique el usuario." +
                        "\n8.  Borrar un elemento de una posición concreta." +
                        "\n9.  Calcular la suma y la media aritmética de los valores contenidos." +
                        "\n10.  Finalizar."));

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Introduce los numeros de forma correcta");
            }

        //}while(bucleFin == false);


    }

    public static void maxMin(){
        JOptionPane.showMessageDialog(null, "El numero máximo del array es: "+Collections.max(numeros));
        JOptionPane.showMessageDialog(null, "El numero mínimo del array es: "+Collections.min(numeros));

    }

    public static void buscarNumero(){
        Double numero = Double.parseDouble(JOptionPane.showInputDialog("Inserta el numero que quieres buscar"));
        boolean salir = false;


            for (double x : numeros) {
                while (salir == false) {
                    if (numeros.contains(numero)) {
                        JOptionPane.showMessageDialog(null, "Se ha encontrado el numero: " + numero);

                        if (seleccion == 3) {
                            numeros.remove(numero);
                            JOptionPane.showMessageDialog(null, "Se ha borrado el numero "+numero);
                            mostrarElementosArayList();
                        }
                        salir = true;

                    }
                }
            }
            if (salir == false){
                JOptionPane.showMessageDialog(null,"No se ha encontrado el numero :"+numero);
                salir = true;
            }



    }

    public static void convertirArray(){
        Double[] array = new Double[numeros.size()];
        String imprimirArray = "";
        array = numeros.toArray(array);
        for (int i = 0; i < array.length; i++) {
            imprimirArray = imprimirArray + " " + array[i];
        }
        JOptionPane.showMessageDialog(null, "Convertido a array: "+imprimirArray);

    }

    public static void insertarElemento(){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Inserta un nuevo elemento al final del array list"));
        //int posicionArrayList = numeros.size()+1;
        numeros.add(numero);
    }

    public static void insertarElementoPosicionConcreta(){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Inserta el nuevo elemento que quieres añadir en el array list"));
        int posicionArrayList = Integer.parseInt(JOptionPane.showInputDialog("Inserta la posición del array list que quieres insertar el numero "+numero));
        numeros.add(posicionArrayList-1, numero);
    }

    public static void borrarElemento(){
        int posicionArrayList = Integer.parseInt(JOptionPane.showInputDialog("Inserta la posición del array list que quieres eliminar" ));
        numeros.remove(posicionArrayList-1);
        JOptionPane.showMessageDialog(null, "se acaba de borrar el numero de la posicion " +posicionArrayList+ "del array list.");
        mostrarElementosArayList();
    }

    public static void sumaPromedio(){
        double suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);

        }
        JOptionPane.showMessageDialog(null, "La suma completa del arraylist es: "+suma+"" +
                "El promedio del arraylist es: "+suma/numeros.size());
    }

    public static void mostrarElementosArayList(){
        String imprimir = "";

        for (int i = 0; i < numeros.size(); i++) {
            imprimir = imprimir + numeros.get(i) + " ";

        }
        JOptionPane.showMessageDialog(null, "ArrayList: "+imprimir);

    }

}
