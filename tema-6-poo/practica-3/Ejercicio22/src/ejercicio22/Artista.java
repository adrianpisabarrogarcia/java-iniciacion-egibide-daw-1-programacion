
package ejercicio22;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    ArrayList<Obra> listaArtistas = new ArrayList<>();
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    

    public Artista(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Obra> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Obra> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", listaArtistas=" + listaArtistas + '}';
    }
    
    
    
    
    
}
