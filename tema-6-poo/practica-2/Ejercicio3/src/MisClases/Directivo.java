package MisClases;

import javax.swing.*;
import java.util.ArrayList;

public class Directivo extends Empleado {
    //Variables
    private String categoria;
    private ArrayList<Empleado> subordinados;
    //Constructor Getters & Setters

    public Directivo(String nombre, String edad, double sueldo_bruto, String categoria, ArrayList<Empleado> subordinados) {
        super(nombre, edad, sueldo_bruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    //Metodos
    public String mostrar() {

        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                "nombre='" + getNombre() + '\'' +
                "edad='" + getEdad() + '\'' +
                "sueldo_bruto='" + getSueldo_bruto() + '\'' +
                "sueldo_bruto='" + getSueldo_bruto() +
                '}';
    }
}
