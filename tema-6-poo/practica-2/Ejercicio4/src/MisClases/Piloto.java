package MisClases;

import java.util.ArrayList;

public class Piloto {
    private String codigoPiloto;
    private String nombre;
    private String apellido;
    private int numLicencia;

    //relaciones
    private ArrayList<Vuelo> listaVuelos = new ArrayList();

    public Piloto(String codigoPiloto, String nombre, String apellido, int numLicencia) {
        this.codigoPiloto = codigoPiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLicencia = numLicencia;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
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

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public void agregarNuevo(){}

    public void asignarVuelo(){}

    public void cancelarVuelo(){}

    public void modifica(){}

    public Piloto[] buscar(){return null;}
}
