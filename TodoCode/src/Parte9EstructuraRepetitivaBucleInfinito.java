public class Parte9EstructuraRepetitivaBucleInfinito {
    public static void main (String [] args) throws Exception {


        boolean centinela = true;

        while (centinela == true) { 

            System.out.println("El valor de la bandera es " + centinela);

            centinela = false; //sin esto se producira un bucle infinito

        }
    }
}