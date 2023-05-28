import java.util.Scanner;

public class Parte7Ejercicio {
    public static void main(String[] args) throws Exception {

        /*
         * Una pequeña empresa desea calcular los sueldos de sus empleados. Los puestos
         * de los mismos pueden tener 3 categorias: 1-repositor, 2-cajero y
         * 3-supervisor.
         * Los repositores cobran $15890 + un bono de 10%
         * Los cajeros cobran $25630.89 fijos
         * los supervisores cobran $35560.20 en bruto al cual se le descuenta 11% de
         * jubilacion
         * 
         * Se necesita un programa que, dependiendo del tipo de empleado del que se
         * trate,
         * calcule y muestre en pantalla el correspondiente sueldo.
         */

        double sueldo=0;
        int categoria;

        System.out.println("Ingrese el tipo de categoria que desee calcular el sueldo");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        teclado.close();
        

        if (categoria == 1) {
            sueldo = 15890 + (15890*0.1);
        }
         else   
             if (categoria == 2) {
             sueldo = 25630.89;
             }
             else  
              if  (categoria == 3) {
                    sueldo = 35560.20 - (35560.20*0.11);
              }
              else {
                System.out.println("Debe ingresar un numero de categoria valido");
              }
              if (categoria == 1 || categoria == 2 || categoria == 3){
                System.out.println("el total del sueldo para la categoria seleccionada " + categoria + " es igual a: " + sueldo);
            }
        }
    }
            
            
            
            
        
