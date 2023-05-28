import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) throws Exception { // codigo principal a ejecutar

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese el tercero numero: ");
        int numero3 = sc.nextInt();
        sc.close();

        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }
    /**
     * Esta funcion sirve para mostrar el calculo de un numero mayor
     * @param numero1 es el primer numero
     * @param numero2 es el segundo numero
     * @param numero3 es el tercer numero
     */
    // funcion numero mayor
    private static void calcularNumeroMayor(int numero1, int numero2, int numero3) {

        Integer numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }

        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);

        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }

        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }

        System.out.println("El numero menor es: " + numeroMenor);

    }

    // funcion numero menor
    private static void calcularNumeroMenor(int numero1, int numero2, int numero3) {

        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }

        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }

        System.out.println("El numero menor es: " + numeroMenor);

    }

}
