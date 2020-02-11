
package vehiculo;

import persona.Persona;


public class moto extends vehiculo.Vehiculo{
    private mo marca;

    public moto(mo marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public mo getMarca() {
        return marca;
    }

    public void setMarca(mo marca) {
        this.marca = marca;
    }

    
    
    
    
    
}
