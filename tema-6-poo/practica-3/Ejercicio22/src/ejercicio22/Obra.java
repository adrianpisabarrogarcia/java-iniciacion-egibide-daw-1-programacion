
package ejercicio22;

import java.util.ArrayList;

public class Obra {
    private String titulo;
    private int anoEdicion;
    ArrayList<Artista> listaArtistas = new ArrayList<>();

    public Obra(String titulo, int anoEdicion) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", anoEdicion=" + anoEdicion + ", listaArtistas=" + listaArtistas + '}';
    }
    
}
