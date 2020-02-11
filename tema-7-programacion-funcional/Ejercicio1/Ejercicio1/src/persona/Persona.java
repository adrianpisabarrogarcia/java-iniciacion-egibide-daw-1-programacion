
package persona;

import java.util.ArrayList;
import vehiculo.Vehiculo;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    ArrayList<vehiculo.Vehiculo> listaCoches = new ArrayList<>();

    public Persona(String dni, String nombre, String apellidos, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Vehiculo> listaCoches) {
        this.listaCoches = listaCoches;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono + ", listaCoches=" + listaCoches + '}';
    }
    

    

    
    
        
    
    
    
}
