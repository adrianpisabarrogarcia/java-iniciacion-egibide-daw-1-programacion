package ejercicio22;

import java.util.ArrayList;


public class Disco  extends Obra{
    private String discografica;
    private int numeroCanciones;

    public Disco(String discografica, int numeroCanciones, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.discografica = discografica;
        this.numeroCanciones = numeroCanciones;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return "Disco{" + "discografica=" + discografica + ", numeroCanciones=" + numeroCanciones + '}';
    }
    
    
    
    
    
    
}
