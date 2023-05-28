import java.util.Scanner;

public class Ejercicio2CalcularPromedio {
    public static void main (String[] args) throws Exception {
        
      /*   Armar un programa que permita cargar 3 numeros y 
        mostrar cual es el numero promedio
        Ejemplo: si cargo 2, 6 y 9, el promedio es 5.66 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Cargue 3 numeros para obtener el promedio");
        
        System.out.println("Primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Tercer numero: ");
        int numero3 = sc.nextInt();
        sc.close();
        

        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;

        System.out.println("El promedio es: " + numeroPromedio);          

    }

}
