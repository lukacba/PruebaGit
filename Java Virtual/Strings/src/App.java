public class App {
    public static void main(String[] args) throws Exception {
        //String = Clase
        // mensaje1 y mensaje 2 son objetos

        String mensaje = "Hola, soy un string";

                //length se utiliza para contabilizar los caracteres del string
        int cantidad = mensaje.length();
        
                //Puede ser una palabra o letra
                //V o F dependera de mayusculas o minusculas
        boolean contiene = mensaje.contains("u");

                // starts-ends_With puede ser una palabra o una letra, 
                //V o F dependera de mayusculas o minuscualas
        boolean comienzaCon = mensaje.startsWith("H");
        boolean terminaCon = mensaje.endsWith("g");


        System.out.println(cantidad);
        System.out.println(contiene);

        System.out.println(comienzaCon);
        System.out.println(terminaCon);
        
            //Unir Strings con mensaje.concat
        String nuevoString = mensaje.concat(", estamos en el curso de Java");
        System.out.println(nuevoString);

        String nuevoString1 = mensaje.concat(" y por fin estoy entendiendo esto.");
        System.out.println(nuevoString1);
        
        int cantidad1 = nuevoString1.length();
        System.out.println(cantidad1);
        
    }
}
