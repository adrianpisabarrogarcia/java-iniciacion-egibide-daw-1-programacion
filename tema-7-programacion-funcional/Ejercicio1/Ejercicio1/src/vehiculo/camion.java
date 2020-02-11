
package vehiculo;

import persona.Persona;


public class camion extends vehiculo.Vehiculo{
    
   
    
    private ca marca;

    public camion(String matricula, String marca, Persona personas) {
        super(matricula, marca, personas);
    }

    @Override
    public String toString() {
        return "camion{" + "marca=" + marca + '}';
    }
    
    
    
}
