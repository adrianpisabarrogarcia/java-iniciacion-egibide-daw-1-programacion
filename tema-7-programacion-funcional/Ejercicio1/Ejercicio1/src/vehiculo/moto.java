
package vehiculo;

import persona.Persona;

public class moto extends vehiculo.Vehiculo{
    
    private mo marca;

    public moto(String matricula, String marca, Persona personas) {
        super(matricula, marca, personas);
    }
   
    @Override
    public String toString() {
        return "moto{" + "marca=" + marca + '}';
    }
    
    
    
    
}
