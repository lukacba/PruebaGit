import java.util.Scanner;

public class Parte19EjercicioTemperatura {
    public static void main(String[] args) {

        /*
         * En tres vectores diferentes se guardan los nombres, temperaturas minimax y
         * maximas
         * de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los
         * nombres de las ciudades,
         * en el segundo las temperaturas minimas alcanzadas. Se necesita un programa
         * que permita la carga de las ciudades,
         * sus temperaturas minimas y maximas; ademas, debera poder informar por
         * pantalla cual fue la ciudad
         * con la temperatura mas baja y cual con la temperatura mas alta
         * (dando a conocer al mismo tiempo la cantidad de grados.)
         */

        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado.next();

            System.out.println("Ingrese la minima de la ciudad " + i);
            minimas[i] = teclado2.nextDouble();

            System.out.println("Ingrese la maxima de la ciudad " + i);
            maximas[i] = teclado2.nextDouble();

        }

        // determinamos la minima
        Double minima = 9999999.00;
        int posMin = -1;

        for (int i = 0; i < ciudades.length; i++) {
            if (minimas[i] < minima) {
                minima = minimas[i];
                posMin = i;
            }
        }

        // determinamos la maxima
        Double maxima = -9999999.00;
        int posMax = -1;

        for (int i = 0; i < ciudades.length; i++) {
            if (maximas[i] > maxima) {
                maxima = maximas[i];
                posMax = i;
               
            }
        }

        System.out.println("La temperatura minima es de: " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);

        teclado.close();
        teclado2.close();
    }

}
