/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.ArrayList;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class Libro extends Obra{
    private String editorial;
    private int numeroPaginas;

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return "Libro{" + "editorial=" + editorial + ", numeroPaginas=" + numeroPaginas + '}';
    }

    
    
    
    
}
