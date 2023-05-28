import java.util.Scanner;

public class Parte11EjercicioContador {
    public static void main(String[] args) throws Exception {

        /* Realizar un programa que dado por teclado un limite numerico
         * por teclado (por ejemplo 100) muestre en pantalla todos los numeros
         * hasta ese limite (empezando por 1).
        */

        System.out.println("Ingrese el limite del contador:");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        teclado.close();
        int cont = 1;

        while (cont <= limite) {

        System.out.println("Numero: " + cont);
            cont = cont+1; // es igual a cont++;

        }
        
    }
}
