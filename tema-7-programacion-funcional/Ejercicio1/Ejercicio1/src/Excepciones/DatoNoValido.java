
package Excepciones;

public class DatoNoValido extends Exception{
    public String campo;

    public DatoNoValido(String campo) {
        this.campo = campo;
    }

    public String getCampo() {
        return campo + " no valido.";
    }
    
    
    
    
}
