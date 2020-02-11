
package ejercicio2;


public class Persona {
    
    private static String nombre;
    private static String apellidos;
    private static String DNI;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String DNI) {
        Persona.nombre = nombre;
        Persona.apellidos = apellidos;
        Persona.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        Persona.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        Persona.DNI = DNI;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + "\n DNI: " + DNI + "\n \n";
    }
    
    
    
    
    
}
