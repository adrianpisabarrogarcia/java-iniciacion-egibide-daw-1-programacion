package MisClases;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    private int numVuelo;
    private String horaSalida;
    private String horaLlegada;
    private String lugarOrigen;
    private String lugarDestino;
    private Date fechaSalida;
    private Date fechaRegreso;
    private String tipoVuelo;

    //relaciones
    private Avion avion;
    private Piloto piloto;
    private Ciudad ciudad;
    private Pasajero pasajero;
    private ArrayList<Asiento> listaAsientos = new ArrayList();




    public Vuelo(int numVuelo, String horaSalida, String horaLlegada, String lugarOrigen, String lugarDestino, Date fechaSalida, Date fechaRegreso, String tipoVuelo) {
        this.numVuelo = numVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.tipoVuelo = tipoVuelo;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public void vuelo(){}

    public void modificar(){}

    public void eliminar(){}

    public Vuelo buscar(){return null;}

}
