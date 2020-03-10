
package Modelo;

import java.util.ArrayList;


public class Producto {
    
    private String nombre;
    private int unidades;
    private double precioUnitario;
    ArrayList listaProveedores = new ArrayList();

    public Producto() {
    }

    public Producto(String nombre, int unidades, double precioUnitario) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", unidades=" + unidades + ", precioUnitario=" + precioUnitario + ", listaProveedores=" + listaProveedores + '}';
    }

    
    
    
    
}
