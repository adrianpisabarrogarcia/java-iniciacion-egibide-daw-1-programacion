package validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validaciones {
    public static String validacion;
    public static Pattern pat1;
    
    
    
    
    public static void main(String[] args) {
        boolean bucleFin=true;
     while(bucleFin){
         int elegirPrograma = Integer.parseInt(JOptionPane.showInputDialog("Elige el programa:\n"
                + "1. Validar un numero entero. ´\n" +
                "2. Validar un numero entero positivo. ´\n" +
                "3. Validar un numero entero negativo. ´\n" +
                "4. Validar DNI, 8 numeros y una letra al final. ´\n" +
                "5. Validar una IP.\n" +
                "6. Validar una matricula de un coche con formato 0000XXX\n" +
                "7. Validar un numero binario. ´\n" +
                "8. Validar un numero octal. ´\n" +
                "9. Validar un numero hexadecimal. ´\n" +
                "10. Validar numero real.\n" +
                "11. Validar numero real positivo.\n" +
                "12. Validar numero real negativo.\n" +
                "13. Validar numero real con x decimales.\n" +
                "14. Validar numero real positivo con x decimales.\n" +
                "15. Validar numero real negativo con x decimales.\n" +
                "16. Validar una fecha con formato dd/mm/aaaa\n" +
                "17. Validar un nombre, incluyendo nombres compuestos.\n" +
                "18. Validar un email.\n" +
                "19. Valida un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minuculas, numeros, guiones y guiones bajos.\n" +
                "20. Validar ISBN de 13 digitos, siempre empieza en 978 o 979.\n"
                 + "21. Salir del programa"));
        
        switch(elegirPrograma){
            case 1:
                validacion();
                programa1();
                matcher();
                break;
            case 2:
                validacion();
                programa2();
                matcher();
                break;
            case 3:
                validacion();
                programa3();
                matcher();
                break;
            case 4:
                validacion();
                programa4();
                matcher();
                break;
            case 5:
                validacion();
                programa5();
                matcher();
                break;
            case 6:
                validacion();
                programa6();
                matcher();
                break;
            case 7:
                validacion();
                programa7();
                matcher();
                break;
            case 8:
                validacion();
                programa8();
                matcher();
                break;
            case 9:
                validacion();
                programa9();
                matcher();
                break;
            case 10:
                validacion();
                programa10();
                matcher();
                break;
            case 11:
                validacion();
                programa11();
                matcher();
                break;
            case 12:
                validacion();
                programa12();
                matcher();
                break;
            case 13:
                validacion();
                programa13();
                matcher();
                break;
            case 14:
                validacion();
                programa14();
                matcher();
                break;
            case 15:
                validacion();
                programa15();
                matcher();
                break;
            case 16:
                validacion();
                programa16();
                matcher();
                break;
            case 17:
                validacion();
                programa17();
                matcher();
                break;
            case 18:
                validacion();
                programa18();
                matcher();
                break;
            case 19:
                validacion();
                programa19();
                matcher();
                break;
            case 20:
                validacion();
                programa20();
                matcher();
                break;
            case 21:
                bucleFin=false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "No has introducido correctamente el número.");
                break;
                    
        }
         
     }   
        
        

    }
    public static void validacion(){
        validacion = JOptionPane.showInputDialog("Valida:");
    }
    public static void matcher(){
        Matcher mat1 = pat1.matcher(validacion);
            if (mat1.matches ()) {
                JOptionPane.showMessageDialog(null, "SI");
            } else {
                JOptionPane.showMessageDialog(null, "NO");
            }
    }
    public static void programa1(){
      
       pat1 = Pattern.compile("[0-9]+|-[0-9]+");
    }
    
    public  static void programa2(){
       pat1 = Pattern.compile("[0-9]+");
    }
    
    public  static void programa3(){
       pat1 = Pattern.compile("-[0-9]+");
    }
    
    public static void programa4(){
       pat1 = Pattern.compile("^[0-9]{8}[A-Z]$");
    }
    
    public static void programa5(){
       pat1 = Pattern.compile("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]"
               + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]"
               + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]"
               + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
    }
    
    public static void programa6(){
       pat1 = Pattern.compile("[0-9]{4}[A-Z]{3}");
    }
    
    public static void programa7(){
       pat1 = Pattern.compile("[0-1]+");
    }
    
    public static void programa8(){
       pat1 = Pattern.compile("[0-7]+");
    }
    
    public static void programa9(){
       pat1 = Pattern.compile("([A-F]*[0-9]*)+");
    }
    
    public static void programa10(){
       pat1 = Pattern.compile("((-)?[0-9]+)|(([-]?)[0-9]+([.]|[,])[0-9]+)"
               + "");
    }
    
    public static void programa11(){
       pat1 = Pattern.compile("[0-9]+|[0-9]+");
    }
    
    public static void programa12(){
       pat1 = Pattern.compile("((-)[0-9]+)|([-][0-9]+([.]|[,])[0-9]+)");
    }
    
    public static void programa13(){
        int decimales = Integer.parseInt(JOptionPane.showInputDialog("Inserta la cantidad de decimales que quieres que tenga."));
         if (decimales==0) {
                    pat1 = Pattern.compile("((-)?[0-9]+)");

        }else{
                    pat1 = Pattern.compile("(([-]?)[0-9]+([.]|[,])["+decimales+"]+)");

         }
    }
    
    public static void programa14(){
        int decimales = Integer.parseInt(JOptionPane.showInputDialog("Inserta la cantidad de decimales que quieres que tenga."));
         if (decimales==0) {
                    pat1 = Pattern.compile("([0-9]+)");

        }else{
                    pat1 = Pattern.compile("([0-9]+([.]|[,])["+decimales+"]+)");

         }    
    }
    
    public static void programa15(){
        int decimales = Integer.parseInt(JOptionPane.showInputDialog("Inserta la cantidad de decimales que quieres que tenga."));
         if (decimales==0) {
                    pat1 = Pattern.compile("([-][0-9]+)");

        }else{
                    pat1 = Pattern.compile("([-][0-9]+([.]|[,])["+decimales+"]+)");

         }  
    }
    
    public static void programa16(){
       pat1 = Pattern.compile("(([1-2][0-9])|([1-9])|([3][0-1])"
               + "[/][1-12]/[1,]");
    }
    
    public static void programa17(){
       pat1 = Pattern.compile("([A-Z][a-z]+[\\s]*){1,3}");
    }
    
    public static void programa18(){
       pat1 = Pattern.compile("([\\w]{3,30}+[\\W]{1}){3,30}[@]([\\w]{3,20}[.])?[\\w]{3,20}[.][a-z]{1,3}");
       //REPASAR QUE ESTA MAL
    }
    
    public static void programa19(){
       pat1 = Pattern.compile("[0-9]+|-[0-9]+");
    }
    
    public static void programa20(){
       pat1 = Pattern.compile("[0-9]+|-[0-9]+");
    }
    
    
    
    
    
    
}
