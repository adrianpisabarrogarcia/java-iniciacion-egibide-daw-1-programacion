
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class Cliente {
    
    
    
    private String DNI;
    private String nombre;
    private String direccion;
    private String telefono1;
    private String telefono2;
   // private ArrayList<Expediente> listaExpedientes = new ArrayList<Expediente>();

    public Cliente() {
    }

    public Cliente(String DNI, String nombre, String direccion, String telefono1, String telefono2) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    /*
    public ArrayList<Expediente> getListaExpedientes() {
        return listaExpedientes;
    }

    public void setListaExpedientes(ArrayList<Expediente> listaExpedientes) {
        this.listaExpedientes = listaExpedientes;
    }
    */
    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + '}';
    }
    
    public String toString2() {
        return "\nDNI=" + DNI + "\nnombre=" + nombre + "\ndireccion=" + direccion + "\ntelefono1=" + telefono1 + "\ntelefono2=" + telefono2;
    }
    
    
    
    
    
    
    
}
