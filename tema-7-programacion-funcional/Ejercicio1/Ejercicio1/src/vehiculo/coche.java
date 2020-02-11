
package vehiculo;

import persona.Persona;

public class coche extends vehiculo.Vehiculo{
    private co marca;

    public coche(co marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.marca = marca;
    }

    public co getMarca() {
        return marca;
    }

    public void setMarca(co marca) {
        this.marca = marca;
    }
    
    
    
    
}
