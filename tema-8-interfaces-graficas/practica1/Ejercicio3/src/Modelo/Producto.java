
package Modelo;


public class Producto {
    
    private String nombre;
    private double precioUnitario;
    private int unidades;

    public Producto() {
    }

    public Producto(String nombre, double precioUnitario, int unidades) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\nprecioUnitario=" + precioUnitario + "\nunidades=" + unidades + "\n\n";
    }

    
    
}
