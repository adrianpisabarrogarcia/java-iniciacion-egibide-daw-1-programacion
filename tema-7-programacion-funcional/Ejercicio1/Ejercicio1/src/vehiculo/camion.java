
package vehiculo;

import persona.Persona;


public class camion extends vehiculo.Vehiculo{
    private ca marca;

    public camion(ca marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public ca getMarca() {
        return marca;
    }

    public void setMarca(ca marca) {
        this.marca = marca;
    }
    
    
    
    
}
