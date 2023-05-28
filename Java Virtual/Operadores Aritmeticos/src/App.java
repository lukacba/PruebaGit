public class App {
    public static void main(String[] args) throws Exception {
       //Operadores aritmeticos

       int variableX = 50, variableY = 10;
       int resultado;

       resultado = variableX + variableY;
       System.out.println(resultado);

       resultado = variableX - variableY;
       System.out.println(resultado);

       resultado = variableX * variableY;
       System.out.println(resultado);

       resultado = variableX / variableY;
       System.out.println(resultado);

    

       variableX++; // ++ incrementa en uno. Resultado 51
       System.out.println(variableX);

       variableX--; // -- decrece en uno. Resultado 50
       System.out.println(variableX);

       
       variableX+=100; // es igual a poner que variableX = variableX + 100; Resultado 150
       System.out.println(variableX);

       variableX-=200; // es igual a poner que variableX = variableX - 200; Resultado -50
       System.out.println(variableX);

       variableX+=100; //la variable vuelve a valer 50
       System.out.println(variableX);

       variableX*=3; // variableX = variableX * 3...la variable 50 se multiplica x3
       System.out.println(variableX);

       variableX/=5; // variableX= variableX / 5... la variable 50 se divide por 5
       System.out.println(variableX);

       /* ++ la variable aumenta 1 digito
        * -- la variable decrece 1 digito
        *= "X" la variable se multiplica por X
        /= "X" la variable se divide por X
        esto provocara que la variable se pueda modificar
        */

    
    
    
    
    
    }
}
