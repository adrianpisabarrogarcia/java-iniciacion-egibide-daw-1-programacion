package MisClases;

import javax.swing.*;

public class Empleado extends Persona {

    //Constructor heredado
    public Empleado(String nombre, String edad) {
        super(nombre, edad);
    }

    //Variables
    private double sueldo_bruto;

    //Constructores, Get
    public Empleado(String nombre, String edad, double sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    //Metodos

    @Override
    public String mostrar() {
        return "Empleado{" +
                "sueldo_bruto=" + sueldo_bruto + " " +
                "nombre=" + getNombre() +" " +
                "edad=" + getEdad() +
                '}';
    }

    public Double calcular_salario_neto(){
        return null;

    }
}
