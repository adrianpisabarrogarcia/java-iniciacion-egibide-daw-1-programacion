
package ejercicio21;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fechaNacimiento;
    private String emailPersonal;
    private String emailEgibide;
    private String web;
    private String curso;
    private String estadoCivil;

    public Alumno() {
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

    @Override
    public String toString() {
        if (!this.web.isEmpty()) {
            return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", emailPersonal=" + emailPersonal + ", emailEgibide=" + emailEgibide + ", web=" + web + ", curso=" + curso + ", estadoCivil=" + estadoCivil + '}'; 
        }else{
            return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", emailPersonal=" + emailPersonal + ", emailEgibide=" + emailEgibide + ", curso=" + curso + ", estadoCivil=" + estadoCivil + '}';
        }
    }
    
    
    
    
    
    
}
