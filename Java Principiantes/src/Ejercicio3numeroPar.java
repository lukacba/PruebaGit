import java.util.Scanner;

public class Ejercicio3numeroPar {
    public static void main(String[] args) throws Exception {
        
        //Armar un programa que permita ingresar
        //un numero y mostrar si es par o impar

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();

        Boolean esPar = (numero % 2) == 0;

        if (esPar) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");

            
        }


    }
}
