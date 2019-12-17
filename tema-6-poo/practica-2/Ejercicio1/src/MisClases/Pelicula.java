package MisClases;

public class Pelicula {
    private String titulo;
    private char annio;
    private float duracion;
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Métodos

}
