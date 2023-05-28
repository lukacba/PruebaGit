import java.util.Scanner;

public class Parte15Matrices {
    public static void main(String[] args) {

        // Declaracion
        // [x] [y]
        int matriz[][] = new int[3][3];

        // Asignacion (Manual)

        /*
         * matriz [0][0] = 5;
         * matriz [0][1] = 10;
         * matriz [0][2] = 15;
         * matriz [1][0] = 6;
         * matriz [1][1] = 12;
         * matriz [1][2] = 18;
         * matriz [2][0] = 7;
         * matriz [2][1] = 14;
         * matriz [2][2] = 21;
         */

        // Asignacion por teclado
        Scanner teclado = new Scanner(System.in);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("Ingrese el valor de la posicion x: " + x + " y: " + y);
                matriz[x][y] = teclado.nextInt();
            }
        }
        // Recorrido
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("El valor de la posicion x: " + x + " y: " + y);
                System.out.println("es de: " + matriz[x][y]);
            }
        }
        teclado.close(); //Fuera de los for

    }

}
