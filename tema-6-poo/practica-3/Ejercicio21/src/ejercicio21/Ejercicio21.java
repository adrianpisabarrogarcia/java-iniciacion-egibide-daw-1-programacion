
package ejercicio21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ejercicio21 {

    
    public static String cadena;
    public static ArrayList listaAlumnos = new ArrayList();
    public static Pattern pat;
    public static boolean error = false;
    
    public static void main(String[] args){
        try {
            insertarDatos();
            buscarAlumno();
            
            
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errores");
        }
    }
    
    public static void insertarDatos() throws Exception, DatoNoValido, DatoBlanco{
        
        
        boolean bucleFin =true;
        while (bucleFin) {
            //Inicializar objeto
            Alumno a = new Alumno();
            
            //Datos de entrada
            JOptionPane.showMessageDialog(null, "VAMOS A INSERTAR UN NUEVO ALUMNO");
            do {
                cadena = JOptionPane.showInputDialog("Inserta codigo de alumno");
                pat = Pattern.compile("[0-9]{5}");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setCodigo(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta NOMBRE de alumno");
                pat = Pattern.compile("([A-z]+[ ]?)*");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setNombre(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta DOMICILIO de alumno");
                pat = Pattern.compile("([A-z]+[ ]?)*");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setDomicilio(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta TELEFONO de alumno");
                pat = Pattern.compile("[67][0-9]{8}");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setTelefono(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta EDAD de alumno");
                pat = Pattern.compile("[0-9]{1,3}");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setEdad(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta SEXO de alumno");
                pat = Pattern.compile("[hHMmOo]");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setSexo(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta FECHA NACIMIENTO de alumno en formato DD-MM-YYYY");
                comprobacionFecha(cadena);
                
            }while(error==false);
            error=false;
            a.setFechaNacimiento(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta CORREO PERSONAL de alumno");
                pat = Pattern.compile("[a-z]+([.][a-z]+)*@([a-z]+[.])?([a-z]+[.][a-z]{2,4})");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setCorreoPersonal(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta CORREO EGIBIDE de alumno");
                pat = Pattern.compile("([a-z]+[.][a-z]+)@ikasle.egibide.org");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setCorreoEgibide(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            int x = JOptionPane.showConfirmDialog(null, "¿Quieres insertar WEB del alumno?");
            if (x != 0) {
                error=true;
            }
            while(error==false) {
                cadena = JOptionPane.showInputDialog("Inserta WEB de alumno");
                pat = Pattern.compile("[w]{3}.([A-z]+).[a-z]{2,4}");
                comprobacion(cadena,pat);
                a.setWeb(cadena);
                JOptionPane.showMessageDialog(null, "Dato insertado");

            }
            error=false;
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta CURSO de alumno . 141GA");
                pat = Pattern.compile("[0-9]{3}[A-G]{2}");
                comprobacion(cadena,pat);
                
            }while(error==false);
            error=false;
            a.setCurso(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");
            
            
            do {
                cadena = JOptionPane.showInputDialog("Inserta ESTADO CIVIL de alumno. Casado/Soltero");
                if (cadena.equalsIgnoreCase("casado") || cadena.equalsIgnoreCase("soltero")) {
                    error=true;
                }
                else{
                    throw new DatoNoValido();
                }
                
            }while(error==false);
            error=false;
            a.setEstadoCivil(cadena);
            JOptionPane.showMessageDialog(null, "Dato insertado");

            
            //insertar objeto en el array
            listaAlumnos.add(a);
            
            //preguntar si quiere introducir otro alumno
            int y = JOptionPane.showConfirmDialog(null, "¿Quieres insertar otro alumno?");
            if (y != 0) {
                bucleFin = false;
            }
        }
        
        
    }
   
    public static void comprobacion(String cadena, Pattern pat) {
        try {
            if (cadena.isEmpty()) {
                throw new DatoBlanco();
            }
            Matcher mat = pat.matcher(cadena);
            if(!mat.matches()) {
                  throw new DatoNoValido();
            }else{
                error=true;
            }
            
        } catch (DatoBlanco e) {
            JOptionPane.showMessageDialog(null, "Dato en Blanco");
            
        } catch (DatoNoValido e) {
            JOptionPane.showMessageDialog(null, "Dato No Valido");
        }
   
            
    }
    
    public static void comprobacionFecha(String cadena) {
        try {
            if (cadena.isEmpty()) {
                throw new DatoBlanco();
            }
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(cadena, dateFormat);
            error=true;
            
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha mal escrita");
            
        } catch (DatoBlanco e) {
            JOptionPane.showMessageDialog(null, "Dato en Blanco");
            
        } 
        
  
            
            
    }
    
    public static void buscarAlumno() throws Exception{
        try {
            boolean bucleFin = true;
            while (bucleFin) {
                //Preguntar el codigo del alumno
                JOptionPane.showMessageDialog(null, "VAMOS A BUSCAR A UN ALUMNO");
                do {
                    cadena = JOptionPane.showInputDialog("Inserta codigo de alumno");
                    pat = Pattern.compile("[0-9]{5}");
                    comprobacion(cadena,pat);
                }while(error==false);
                error=false;
                //comprobar que esta en el array list
                boolean encontrado = false;
                
                //imprimir array
                for (int x = 0; x < listaAlumnos.size(); x++) {
                    Alumno a = (Alumno) listaAlumnos.get(x);
                    if (a.getCodigo().equals(cadena)) {
                            encontrado = true;
                            JOptionPane.showMessageDialog(null, listaAlumnos.get(x).toString() );
                            break; // Terminar ciclo, pues ya lo encontramos
                    }
                }
                if (encontrado==false) {
                    throw new AlumnoNoEncontrado();
                }
                
                
                //Insertar datos otra vez?
                int j = JOptionPane.showConfirmDialog(null, "¿Quieres volver a BUSCAR ALUMNOS?");
                if (j!=0) {
                    bucleFin=false;
                }
            }
   
            
        } catch (AlumnoNoEncontrado e) {
            JOptionPane.showMessageDialog(null, "Alumno no encotrado");
        }
        
       
    }
    
}
