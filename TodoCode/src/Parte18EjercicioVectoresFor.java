public class Parte18EjercicioVectoresFor {
    public static void main(String[] args) {

        /*
         * Llevar a cabo un programa que incluya un vector que almacene los nombre :
         * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
         * Realizar
         * un recorrido del vector para cargar los datos y otro recorrido para
         * mostrar los mismos en pantalla
         */

        String vector[] = new String[8];

        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Gabriel";
        vector[5] = "Daniel";
        vector[6] = "Luisa";
        vector[7] = "Ludmila";

        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posicion " + i + " se encuentra: " + vector[i]);
        }
    }

}
