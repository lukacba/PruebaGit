public class App {
    public static void main(String[] args) throws Exception {
        //Operadores logicos
        //and (y), or (o) y not (no)

        boolean resultado; 
                    //true
                    //&& 1 sola expresion falsa dara resultado FALSe
        resultado = 5 >= 5 && true && 10 > 9;
        System.out.println(resultado);

                    //true
                    // 1 sola expresion verdadera dara resultado TRUE
        resultado = false || false || false || true;
        System.out.println(resultado);
        
                    // (verdadero || es verdadero)  && (verdadero && verdadero)
                    //          verdadero           &&       verdadero
                    //                           verdadero
        resultado = (5 >= (2 * 3) || true) && ( true && 10 >5);
        System.out.println(resultado);

                    // "!" significa NOT.. colocado antes de true o false provocara lo contrario
                    // !true = false
                    // !false = true
        System.out.println(!true);
        System.out.println(!false);

    }
}
