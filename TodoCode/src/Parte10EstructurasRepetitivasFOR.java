public class Parte10EstructurasRepetitivasFOR {
    public static void main (String[] args) throws Exception {

        /*   FOR
         * ********
         *  for (inicializacion; condicion; modificacion)
         *  {
         *      Sentencias;
         *  }
         * Inicializacion: de la variable que utilizaremos en la condicion (se ejecuta 1 vez al principio del cilo)
         * Condicion: de fin del ciclo (se evalua esta expresion al comiendo de cada iteracion)
         * Modificacion: se ejecuta al final de cada iteracion.
         */

            for (int cont=0; cont<=10; cont++) {
                System.out.println("Estoy dando vueltas con for, estoy en la vuelta: " + cont);
            }

    }
}
