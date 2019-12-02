package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Double> numeros = new ArrayList();

    public static void main(String[] args) {
        boolean terminarBuucle = false;
        do {
            introducirArray();
            

        }while (terminarBuucle != false);
	    
    }
    
    public static void introducirArray(){
        for (double x : numeros) {
            lista.add(x) = Double.parseDouble(JOptionPane.showInputDialog("Inserta un valor para insertar en el ArrayList:"));

        }
    }
}
