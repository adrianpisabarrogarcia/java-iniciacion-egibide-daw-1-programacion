/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.ArrayList;


public class Pelicula  extends Obra{

    private String productora;
    private int duracion;

    public Pelicula(String productora, int duracion, String titulo, int anoEdicion) {
        super(titulo, anoEdicion);
        this.productora = productora;
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "productora=" + productora + ", duracion=" + duracion + '}';
    }
    
    
    
    
    
}
