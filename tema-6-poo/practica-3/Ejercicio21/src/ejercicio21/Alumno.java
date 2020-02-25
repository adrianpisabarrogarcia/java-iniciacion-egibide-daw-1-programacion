
package ejercicio21;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fechaNacimiento;
    private String correoPersonal;
    private String correoEgibide;
    private String web;
    private String curso;
    private String estadoCivil;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono, String edad, String sexo, String fechaNacimiento, String correoPersonal, String correoEgibide, String web, String curso, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correoPersonal = correoPersonal;
        this.correoEgibide = correoEgibide;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoEgibide() {
        return correoEgibide;
    }

    public void setCorreoEgibide(String correoEgibide) {
        this.correoEgibide = correoEgibide;
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

    @Override
    public String toString() {
        return "Alumno:\n" + ".codigo=" + codigo + "\n .nombre=" + nombre + 
                "\n .domicilio=" + domicilio + "\n .telefono=" + telefono + "\n .edad=" + edad 
                + "\n .sexo=" + sexo + "\n .fechaNacimiento=" + fechaNacimiento + "\n .correoPersonal=" 
                + correoPersonal + "\n .correoEgibide=" + correoEgibide + "\n .web=" + web + "\n .curso=" 
                + curso + "\n .estadoCivil=" + estadoCivil ;
    }
    
    
    
    
    
}
