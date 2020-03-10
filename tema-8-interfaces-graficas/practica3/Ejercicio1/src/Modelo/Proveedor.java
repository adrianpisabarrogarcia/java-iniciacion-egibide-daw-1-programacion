
package Modelo;

import java.util.ArrayList;

public class Proveedor {
    private String nombre;
    private ArrayList listaProductos = new ArrayList();

    public Proveedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombre=" + nombre + ", listaProductos=" + listaProductos + '}';
    }
    
    
    
    
}
