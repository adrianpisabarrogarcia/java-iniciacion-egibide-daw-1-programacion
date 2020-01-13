package MisClases;

import java.util.ArrayList;

public class Avion {
    private String aerolinea;
    private String codigoAvion;
    private int numAsientos;
    private String compartimentos;

    //relaciones
    private ArrayList<Vuelo> listaVuelos = new ArrayList();


    public Avion(String aerolinea, String codigoAvion, int numAsientos, String compartimentos) {
        this.aerolinea = aerolinea;
        this.codigoAvion = codigoAvion;
        this.numAsientos = numAsientos;
        this.compartimentos = compartimentos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public void asignarVuelo(){}

    public Avion[] obtener(){return null;}

    public void cancelarVuelo(){}


}
