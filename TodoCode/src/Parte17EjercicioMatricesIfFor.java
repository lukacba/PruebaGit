import java.util.Scanner;

public class Parte17EjercicioMatricesIfFor {
    public static void main(String[] args) {

        /*
         * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos
         * de secundaria. Cada fila corresponde a las notas y al promedio de cada
         * alumno. Se necesita
         * un programa que permita a un profesor cargar, en las 3 posiciones (columnas)
         * de cada fila,
         * las notas del alumno y que en la ultima columna se calculen los promedios.
         * Una vez realizados
         * los calculos, se desea mostrar las 3 notas de cada alumno y el promedio
         * correspondiente
         * recorriendo la materia.
         */

        Double matriz[][] = new Double[4][4];
        Scanner teclado = new Scanner(System.in);
        Double suma = 0.0;
        // for para cargar

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la calificacion del alumno n° " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        System.out.println(" "); // Separa los ingreso de notas del cartel de notificacion de notas y promedios

        // for para recorrer
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno n° " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota n°: " + c + " " + matriz [f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
        teclado.close();
    }
}
