
package ejercicio9;
import java.util.*;
public class Ejercicio9 {
    public static String nombreCliente;
    public static String lineasDeDetalle;
    public static double totalSinIva;
    public static String totalConIva;
    public static double iva21Cantidad;
    public static double iva10Cantidad;
    public static double iva4Cantidad;

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       lineasDeDetalle = "";
       System.out.println("Inserta el nombre del cliente");
       nombreCliente = entrada.nextLine();
       boolean finalBucle = true;
       while(finalBucle==true){
           try {
                System.out.println("Cantidad: ");
                int cantidad = entrada.nextInt();
                lineasDeDetalle = lineasDeDetalle+cantidad+" x ";
                System.out.println("Precio Unitario: ");
                double precioUnitario = entrada.nextDouble();
                lineasDeDetalle = lineasDeDetalle+precioUnitario+" = ";
                
                //Operación cantidad Total de un producto:
                double cantidadTotal = precioUnitario * cantidad;
                lineasDeDetalle = lineasDeDetalle+cantidadTotal+" \n";
                totalSinIva = totalSinIva + cantidadTotal;

                //NOS METEMOS CON EL IVA
                System.out.println("Pon cuel porcentaje de iva que quieres aplicar: \nNormal 21% --> Pulsa: 21 \nReducido 10% --> Pulsa: 10 \nSuperreducido 4% --> Pulsa: 4");
                int ivaSeleccion = entrada.nextInt();
                if (ivaSeleccion == 21 || ivaSeleccion == 10 || ivaSeleccion == 4) {
                    switch(ivaSeleccion){
                    case 21:
                        iva21Cantidad= (iva21Cantidad + cantidadTotal);
                        break;
                    case 10:
                        iva10Cantidad= (iva10Cantidad + cantidadTotal);
                        break;
                    case 4:
                        iva4Cantidad= (iva4Cantidad + cantidadTotal);
                        break;                  
                     }
                }else{
                    throw new ivaMalIntroducido();

                }
                System.out.println("¿Desea continuar? Introduce <si> o <no>");
                String finalPrograma = entrada.nextLine();
                finalPrograma = entrada.nextLine();
                String finalProgramaMayusculas = finalPrograma.toUpperCase();
                if(finalProgramaMayusculas.contentEquals("NO")){
                    salidaDatos();
                    finalBucle=false;
                    
                }if(finalProgramaMayusculas.contentEquals("SI")){
                    //finalBucle=true;
                }else{
                    throw new finalMalIntroducido();
                }
               
           } catch (finalMalIntroducido e) {
               System.out.println("Campo mal introducido, introduce un <si> o un <no>.");
                   
           } catch (ivaMalIntroducido e) {
               System.out.println("Has introducido mal el iva.");
                   
           } catch (Exception e) {
           }
          
          
       }
    }

    
    
    public static void salidaDatos() {
        System.out.println("\n");
        System.out.println("Nombre del cliente: "+nombreCliente);
        System.out.println("***********************************************************");
        System.out.println("LINEAS DE DETALLE: \n");
        System.out.println(lineasDeDetalle);
        System.out.println("***********************************************************");
        System.out.println("TOTAL SIN IVA: "+totalSinIva+"€  \n");
        System.out.println("21% de "+iva21Cantidad+" = "+iva21Cantidad*21/100);
        System.out.println("10% de "+iva10Cantidad+" = "+iva10Cantidad*10/100);
        System.out.println("4% de "+iva4Cantidad+" = "+iva4Cantidad*4/100);
        System.out.println("***********************************************************");
        System.out.println("TOTAL CON IVA: ");
        System.out.print((iva21Cantidad+iva21Cantidad*21/100)+(iva10Cantidad+iva10Cantidad*10/100)+(iva4Cantidad+iva4Cantidad*4/100)+"€");
        
    }
  
}
