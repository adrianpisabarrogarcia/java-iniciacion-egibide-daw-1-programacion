
package vehiculo;

import persona.Persona;

public class Vehiculo {
    
    private String matricula;
    private String marca;
    private persona.Persona personas;

    public Vehiculo(String matricula, String marca, Persona personas) {
        this.matricula = matricula;
        this.marca = marca;
        this.personas = personas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", personas=" + personas + '}';
    }

    



    
    
    
    
}
