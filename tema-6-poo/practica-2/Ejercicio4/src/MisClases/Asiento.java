package MisClases;

public class Asiento {
    private int numAsiento;
    private boolean estado;
    private String compartimento;

    //relaciones
    private Asiento asiento;
    private Pasajero pasajero;

    public Asiento(int numAsiento, boolean estado, String compartimento) {
        this.numAsiento = numAsiento;
        this.estado = estado;
        this.compartimento = compartimento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public void reservar(){}

    public void comprar(){}

    public boolean mostrarDisponibilidad(){return false;}

    public void desbolquear(){}


}
