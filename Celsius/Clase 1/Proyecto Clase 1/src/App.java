public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Curso de Programacion Web");
        System.out.println(((10 + 2) - 23) * 2);
        // Sumar dos numeros, luego restarlo a eso multiplicarlo

        // Concatenacion
        System.out.println("La suma es:" + (20 + 10));

        // 1)Dato primitivo
        // 2) Identificador
        // 3) Valor
        int numeroEntero = 24;

        System.out.println("Valor de variable:" + numeroEntero);
        System.out.println(numeroEntero + 23);

        // Como declarar variables:
        // numero - numeroEntero - numero_entero - numero_Entero
        // Como NO puede ser:
        // Numero - #@@#%@#% - numero entero

        String nombre = "Gaston";
        float numeroComa = 25.35f;
        
        // Sumando int con float
        System.out.println(numeroComa + numeroEntero);
        System.out.println(nombre + " " + numeroComa);
        float dobleValor = 25 + 25.45f;
        System.out.println(dobleValor);
    }
}
