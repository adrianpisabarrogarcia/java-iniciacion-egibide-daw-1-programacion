
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class Expediente {
    
    
    private int numExpediente;
    private LocalDate fechaInicio;
    private LocalDate fechaFIn;
    private String estado;
    private String asunto;
    private String categoria;
    private String DNICliente;

    public Expediente(int numExpediente, LocalDate fechaInicio, LocalDate fechaFIn, String estado, String asunto, String categoria, String DNICliente) {
        this.numExpediente = numExpediente;
        this.fechaInicio = fechaInicio;
        this.fechaFIn = fechaFIn;
        this.estado = estado;
        this.asunto = asunto;
        this.categoria = categoria;
        this.DNICliente = DNICliente;
    }

    public Expediente() {
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFIn() {
        return fechaFIn;
    }

    public void setFechaFIn(LocalDate fechaFIn) {
        this.fechaFIn = fechaFIn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(String DNICliente) {
        this.DNICliente = DNICliente;
    }
    
    ///otros metodos

    @Override
    public String toString() {
        return "Expediente{" + "numExpediente=" + numExpediente + ", fechaInicio=" + fechaInicio + ", fechaFIn=" + fechaFIn + ", estado=" + estado + ", asunto=" + asunto + ", categoria=" + categoria + ", DNi Cliente=" + DNICliente+'}';
    }
    
    public String toString2() {
        return "numExpediente=" + numExpediente + "\nfechaInicio=" + fechaInicio + "\nfechaFIn=" + fechaFIn + "\nestado=" + estado + "\nasunto=" + asunto + "\ncategoria=" + categoria + "\nDNi Cliente=" + DNICliente;
    }
    
    
    
    
    
    
    
    
    
}
