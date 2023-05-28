import java.util.Scanner;

public class Parte16EjercicioVectoresIfFor {
    public static void main(String[] args) {

        /*
         * Realizar un programa que permita cargar 15 numeros en un vector. Una vez
         * cargados,
         * se necesita que el programa cuente e informe por pantalla cuantas veces se
         * cargo el numero 3
         */

        int vector[] = new int[15];

        Scanner teclado = new Scanner(System.in);
        for (int x = 0; x < vector.length; x++) {
            System.out.println("Ingrese un numero2 para el vector: " + x);
            vector[x] = teclado.nextInt();
        }

        int cont = 0;
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] == 3) {
                cont = cont + 1;
            }

            teclado.close();
        }

        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
    }
}