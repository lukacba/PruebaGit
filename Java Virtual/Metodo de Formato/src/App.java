public class App {
    public static void main(String[] args) throws Exception {
        
        String mensaje = "   Hola, soy un String    ";
        System.out.println(mensaje);

                //toUpperCase() Convierte el String a mayusculas
                //toLowerCase() Convierte el String a minusculas
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase());

                //trim ajustara los espacios al principio y al final del texto
        System.out.println(mensaje.trim());
                //trim combinado con toUpperCase
        System.out.println(mensaje.toUpperCase().trim());
                //trim combinado con toLowerCase
                System.out.println(mensaje.toLowerCase().trim());

        

    }
}
