package MisClases;

import javax.swing.*;

public class Cliente extends Persona {

    //Atributos
    private String telefono_de_contacto;
    //Constructor Getters & Setters

    public Cliente(String nombre, String edad, String telefono_de_contacto) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    //Metodos


    public String mostrar() {
        return "Cliente{" +
                "telefono_de_contacto='" + telefono_de_contacto + '\'' +
                "nombre='" + getNombre() + '\'' +
                "edad='" + getEdad() +
                '}';
    }

}
