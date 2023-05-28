public class ConcatenarStrings {
    public static void main(String[] args) throws Exception {

        String nombre = "Lucas";
        Integer followersInstagram = 2180;
        Integer followersYoutube = 5650;
        String frase = "Hola, mi nombre es " + nombre + ". Tengo " +
                (followersInstagram + followersYoutube) + " followers.";
        System.out.println(frase);

    }

}