
package ejercicio21;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static ArrayList <Alumno> listaAlumnos = new ArrayList<>();
    public static boolean bucleFin = true;
    
    public static void main(String[] args) {
        try {
            
            obtenerDatosAlumnos();
            buscarAlumno();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errores");
        }
        

    }
    
    public static void obtenerDatosAlumnos() throws Exception{
        while (!bucleFin) {
            
            //array de iniciación
            Alumno a = new Alumno();
            
            String codigo = obtenerDatos("Inserta el codigo de estudiante: ");
            Pattern pat = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat);
            String nombre = obtenerDatos("Inserta el nombre de estudiante: ");
            Pattern pat2 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat2);
            String domicilio = obtenerDatos("Inserta el domicilio de estudiante: ");
            Pattern pat3 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat3);
            String sexo = obtenerDatos("Inserta el sexo de estudiante: (H, M, O)");
            Pattern pat4 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat4);
            String fechaNacimineto = obtenerDatos("Inserta la fecha de nacimiento de estudiante: ");
            Pattern pat5 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat5);
            String emailPersonal = obtenerDatos("Inserta la direccion de correo electrónico del estudiante: ");
            Pattern pat6 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat6);
            String emailEgibide = obtenerDatos("Inserta la direccion de correo electrónico del estudiante: ");
            Pattern pat7 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat7);
            String web = obtenerDatos("Inserta la direccion de correo electrónico del estudiante: ");
            Pattern pat8 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat8);
            String curso = obtenerDatos("Inserta la direccion de correo electrónico del estudiante: ");
            Pattern pat9 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat9);
            String estadoCivil = obtenerDatos("Inserta la direccion de correo electrónico del estudiante: ");
            Pattern pat10 = Pattern.compile("ˆ[aA]bc.*");
            comprobacion(codigo,pat10);
            
            a.setCodigo(codigo);
            a.setNombre(nombre);
            a.setDomicilio(domicilio);
            a.setSexo(sexo);
            a.setFechaNacimiento(fechaNacimineto);
            a.setEmailPersonal(emailPersonal);
            a.setEmailEgibide(emailEgibide);
            a.setWeb(web);
            a.setCurso(curso);
            a.setEstadoCivil(estadoCivil); 
            
            listaAlumnos.add(a);
            bucleFin();
            
                       
        }
        
        
    }
    
    public static void bucleFin(){
        int bucle = JOptionPane.showConfirmDialog(null, "¿Quieres volver a insertar otro alumno?");
        // 0=yes, 1=no, 2=cancel
        if (bucle == 1 || bucle ==2) {bucleFin = false;} 
    }
    
    
    public static String obtenerDatos(String campo) throws Exception{
        String dato = JOptionPane.showInputDialog(campo);
        return dato;
    }
    
    
    public static void comprobacion(String cadena, Pattern pat) throws DatoNoValido{
        Matcher mat = pat.matcher(cadena);
        if(!mat.matches()) {
           throw new DatoNoValido(cadena);
        }
    }
    
    public static void buscarAlumno() throws Exception{
       while(!bucleFin){
           
             boolean encontrado = false;
             //insertar dato de alumno
             String codigo = obtenerDatos("Inserta el codigo de estudiante: ");
             //comprobación de dato
             Pattern pat = Pattern.compile("ˆ[aA]bc.*");
             Matcher mat = pat.matcher(codigo);
             if(!mat.matches()) {
                throw new DatoNoValido(codigo);
             }

             //imprimir todos los datos de ese alumno
             for (int i = 0; i < listaAlumnos.size(); i++) {
                 if (listaAlumnos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                     JOptionPane.showMessageDialog(null, listaAlumnos.get(i).toString());
                 }
                 if(i ==(listaAlumnos.size()-1) && !(listaAlumnos.get(i).getCodigo().equalsIgnoreCase(codigo))){
                        JOptionPane.showInputDialog("No se ha encontrado al alumno.");
                 }   
             }
             bucleFin();   
       } 
        
    }
}
