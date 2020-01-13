package MisClases;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private char annio;
    private float duracion;
    private String tipo;

    //relación con estudio. Una película puede estar producida por uno o varios estudios: CREAMOS ARRAY
    private ArrayList<Estudio> listaEstudios;

    public Pelicula(String titulo, char annio, float duracion, String tipo) {
        this.titulo = titulo;
        this.annio = annio;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getAnnio() {
        return annio;
    }

    public void setAnnio(char annio) {
        this.annio = annio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    //Métodos
    public void modificaPelicula(){

    }

    public void desplieguaPelicula(){

    }

    public void eliminaPelicula(){

    }


}
