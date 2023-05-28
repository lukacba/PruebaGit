public class App {
    public static void main(String[] args) throws Exception {
        
        int variable1 = 300, variable2 = 200;
        boolean resultado;

        resultado = variable1 > variable2; // 1 mayor > 2
        System.out.println(resultado);

        resultado = variable1 < variable2; // 1 menor < 2
        System.out.println(resultado);
        
        resultado = variable1 >= variable2; // 1 mayor igual >= 2
        System.out.println(resultado);
        
        resultado = variable1 <= variable2; // 1 menor igual <= 2
        System.out.println(resultado);

        resultado = variable1 == variable2; // 1 igual a 2
        System.out.println(resultado);

        resultado = variable1 != variable2; // 1 diferente a 2
        System.out.println(resultado);

    }
}
