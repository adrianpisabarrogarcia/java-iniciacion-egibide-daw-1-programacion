
package vehiculo;

import persona.Persona;

public class coche extends vehiculo.Vehiculo{
    
 
    
    private co marca;

    public coche(String matricula, String marca, Persona personas) {
        super(matricula, marca, personas);
    }

    @Override
    public String toString() {
        return "coche{" + "marca=" + marca + '}';
    }
    
    
    
    
    
}
