public class App {
    public static void main(String[] args) throws Exception {
        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        float resultado;
        
        //resultado= variableX + variableZ; // ERROR. resultado seria 55.5, al ser int, no es soportada

        resultado = variableX + (int)variableZ; // (int)> la variable se convierte de un flotante a un entero
        System.out.println(resultado);

        resultado = (float)variableX + variableZ; // (float) la variable se convierte de un entero a un flotante
        System.out.print(resultado);

        
        
        

    }
}
