import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Ejercicio2:
        Ingresa un país, su capital y cantidad de habitantes, que 
        muestre el siguiente mensaje:
        ‘Hola estas en <país>, la capital del mismo es <capital> y 
        actualmente contiene una cantidad de habitantes de <habitantes>’ 
         */
        
        
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Ingrese un pais: ");
        String pais = sc.nextLine();
        System.out.print("Ingrese su capital: ");
        String capital = sc.nextLine();
        System.out.print("Su cantidad de habitantes: ");
        String habitantes = sc.nextLine();
        System.out.print("Hola estas en " +pais+ ", la capital del mismo es " +capital+ 
        " y actualmente \ncontiene una cantidad de habitantes de " + habitantes);
    }





    }
}
