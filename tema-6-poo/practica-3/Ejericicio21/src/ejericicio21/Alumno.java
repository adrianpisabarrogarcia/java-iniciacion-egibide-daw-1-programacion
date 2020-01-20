
package ejericicio21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fechaNacimineto;
    private String emailPersonal;
    private String emailEgibide;
    private String web;
    private String curso;
    private String estadoCivil;

    public Alumno(String codigo, String nombre, String domicilio, String telefono, String edad, String sexo, String fechaNacimineto, String emailPersonal, String emailEgibide, String web, String curso, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimineto = fechaNacimineto;
        this.emailPersonal = emailPersonal;
        this.emailEgibide = emailEgibide;
        this.web = web;
        this.curso = curso;
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailEgibide() {
        return emailEgibide;
    }

    public void setEmailEgibide(String emailEgibide) {
        this.emailEgibide = emailEgibide;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
    //Otos metodos

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimineto=" + fechaNacimineto + ", emailPersonal=" + emailPersonal + ", emailEgibide=" + emailEgibide + ", web=" + web + ", curso=" + curso + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
    
}
