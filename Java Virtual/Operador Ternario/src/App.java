public class App {
    public static void main(String[] args) throws Exception {
        // Operador ternario
        //IFTTT
        //?
        //Ejemplo:      expresion1 ? expresion2 : expresion3
        //               booleano
        //                V or F       
        //Si expresion 1 = true entonces expresion2
        //Si expresion 1 = false entonces expresion 3


        String mensaje = 10 > 90 ? "es mayor" : "es menor";

        int enteros = true ? 1 : 0;

        System.out.println(mensaje);
        System.out.println(enteros);
    }
}
