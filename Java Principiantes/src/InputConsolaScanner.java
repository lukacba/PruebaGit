import java.util.Scanner;

public class InputConsolaScanner {

    public static void main (String [] args) throws Exception{

        Scanner sc = new Scanner(System.in);
          
          System.out.print("Ingrese su nombre: ");
          String nombre = sc.nextLine();
          System.out.print("Ingrese su apellido: ");
          String apellido = sc.nextLine();
          System.out.print("Ingrese su edad: ");
          int edad = sc.nextInt();
          sc.close(); 
          System.out.println(nombre + apellido + edad ++);
    }
    
}
