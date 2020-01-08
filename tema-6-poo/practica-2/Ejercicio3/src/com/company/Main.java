package com.company;
import MisClases.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> subordinados;


        System.out.printf("Personas: ***********************************\n");
        Persona p1 = new Persona("Urko", "1");
        Persona p2 = new Persona("Adrián", "3");
        Persona p3 = new Persona("Sendy", "4");
        Persona p4 = new Persona("Tania", "5");
        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());


        System.out.printf("Empleados: ***********************************\n");
        Empleado e1 = new Empleado(p1.getNombre(), p1.getEdad(), 1000);
        Empleado e2 = new Empleado(p2.getNombre(), p2.getEdad(), 2500);
        System.out.println(e1.mostrar());
        System.out.println(e2.mostrar());


        System.out.printf("Clientes: ***********************************\n");
        Cliente c1 = new Cliente(p3.getNombre(), p3.getEdad(), "688691013");
        Cliente c2 = new Cliente(p4.getNombre(), p4.getEdad(), "688691014");
        System.out.println(c1.mostrar());
        System.out.println(c2.mostrar());

        System.out.printf("Directivos: ***********************************\n");
        subordinados = new ArrayList<Empleado>();
        subordinados.add(e2);
        Directivo d1 = new Directivo(e1.getNombre(),e1.getEdad(), e1.getSueldo_bruto(),"Egibide Arriaga",subordinados);
        System.out.println(d1.mostrar());




    }

}
