import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio3 Cálculo del precio total de una compra, 
        //Conociendo el precio unitario de un artículo y la cantidad comprada, 
        //calcular el precio total a pagar. Ingresa el nombre de la persona y 
        //me muestre su nombre y un mensaje indicando el total a pagar.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();

        System.out.print("Ingrese precio: ");
        float precio = sc.nextFloat();

        System.out.print("Ingrese total a llevar: ");
        int cant = sc.nextInt();
        
        float totalPagar = precio * cant;

        System.out.println(nombre+" su total a pagar es: "+totalPagar);
        }
}
