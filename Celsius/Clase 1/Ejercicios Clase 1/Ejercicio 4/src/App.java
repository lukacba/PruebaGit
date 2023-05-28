import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    //Ejercicio4 
    //Cálculo del sueldo mensual de un operario, Calcular el sueldo mensual 
    //de un operario, conociendo la cantidad de horas trabajadas y el pago por hora. 
    //Ingresa el nombre y número de legajo, mostrando por pantalla un mensaje 
    //Indicando el legajo, nombre y el sueldo a cobrar

        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese nombre del operario: ");
        String nombre = sc.next();

        System.out.print("Ingrese pago por hora: ");
        float pagoHora = sc.nextFloat();

        System.out.print("Ingrese cantidad de horas: ");
        int cantHoras = sc.nextInt();

        System.out.print("Ingrese el legajo del operador: ");
        int legajo = sc.nextInt();

        float sueldoPagar = pagoHora * cantHoras;

        System.out.println("Empleado: " +nombre);
        System.out.println("Legajo: " +legajo);
        System.out.println("Sueldo a cobrar: "+sueldoPagar);
        
    }
}
