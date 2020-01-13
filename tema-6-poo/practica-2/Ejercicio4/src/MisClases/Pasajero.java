package MisClases;

import java.util.ArrayList;

public class Pasajero {
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;

    //relaciones
    private ArrayList<Vuelo> listaVuelos = new ArrayList();
    private Asiento asiento;

    public Pasajero(String cedula, String nombre, String apellido, String sexo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarNuevo(){}

    public void modificar(){}

    public void asignarVuelo(){}

    public Pasajero[] buscar(){return null;}


}
