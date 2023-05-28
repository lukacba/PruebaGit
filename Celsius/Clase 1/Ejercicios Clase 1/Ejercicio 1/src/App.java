import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Ejercicio1:
        Ingresar un nombre, un apellido y mostrar un mensaje que diga:
        ‘Hola <nombre>, bienvenido al curso de Java, en este curso te llamare por tu apellido que es <apellido>’
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.next();

        System.out.println("Ingrese su apellido");
        String apellido = sc.next();

        System.out.println("Hola " +nombre+ 
        " bienvenido al curso de Java," + " en este curso te llamare por tu apellido que es " 
        +apellido);

        sc.close();
    }
}
