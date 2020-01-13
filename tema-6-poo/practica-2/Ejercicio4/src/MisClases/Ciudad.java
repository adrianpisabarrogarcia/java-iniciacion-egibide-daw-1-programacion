package MisClases;

import java.util.ArrayList;

public class Ciudad {
    private String codCiudad;
    private String nombre;

    //relaciones
    private ArrayList<Vuelo> listaVuelos = new ArrayList();


    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarVuelo(){}

    public Ciudad[] obtener(){return null;}
}
