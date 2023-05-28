import java.util.Scanner;

public class EjercicioInputScannerIF {
    public static void main (String [] args) throws Exception{
        
        /* EJERCICIO
        Armar un programa que permita cargar 3 numeros y
        mostrar cual es el mayor y cual es el menor */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese el tercero numero: ");
        int numero3 = sc.nextInt();
        sc.close(); 

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
}
