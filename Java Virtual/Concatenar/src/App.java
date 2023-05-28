public class App {
    public static void main(String[] args) throws Exception {
        //Concatenar String
    
        String nombre = "Codi";
        String curso = "Curso de Java9";
            //.concat es utilizado para unir unicamente 2 String
        String mensaje = "Hola, bienvenido " .concat (nombre);

            //se utiliza otro/s .concat para unir otro/s string
        mensaje = mensaje.concat (" al ");
        mensaje = mensaje.concat (curso);
        mensaje = mensaje.concat (".");

        System.out.println(mensaje);

            //otra forma mas facil es la siguiente
        
        String mensaje1 = "Hola, bienvenido " + nombre + " al " + curso + ".";
        
        System.out.println(mensaje1);


    }
}
