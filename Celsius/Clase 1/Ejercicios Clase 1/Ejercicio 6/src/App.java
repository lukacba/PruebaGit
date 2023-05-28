import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Ejercicio6 
        //Pedir por consola un nombre de persona y el nombre de una ciudad y mostrar por pantalla,
        // el siguiente mensaje «Hola » <nombre> » bienvenido a » <ciudad>

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String nombre = sc.next();

        System.out.print("Ingrese una ciudad: ");
        String ciudad = sc.next();

        System.out.println("Hola " + nombre + " bienvenido a " + ciudad);

        
    }
}
