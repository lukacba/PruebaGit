import java.util.Scanner;

public class Parte12EjercicioCentinela {
    public static void main (String [] args) throws Exception{

        /* Realizar un programa que muestre en pantalla palabras
         * que sean ingresadas por teclado hasta que se ingrese la palabra "salir".
         */

         System.out.println("Ingrese una palabra:");
         Scanner teclado = new Scanner (System.in);
         String palabra = teclado.next();
         teclado.close();

         /*  ! = not
          *  equals = compara palabras respetando minusculas y mayusculas
          *  equalsIgnoreCase = ignorara mayusculas y minusculas
          */ 
         while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es :" + palabra);
            System.out.println("Ingrese una palabra:");
         palabra = teclado.next();  
         }
    }
    
}
