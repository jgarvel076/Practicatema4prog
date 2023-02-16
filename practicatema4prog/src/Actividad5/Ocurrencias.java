package Actividad5;

public class Ocurrencias {
    public static void main(String[] args) {
        String texto = "Glorioso partido del Real Betis en el glorioso Coliseum Alfonso Perez";
        String palabraBuscada = "glorioso";
        System.out.println("Este es el texto: " + " '" + texto + "' " + " donde vamos a buscar cuantas veces aparece la palabra: " + palabraBuscada);
        int ocurrencias = contarOcurrencias(texto, palabraBuscada);
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + ocurrencias + " veces en el texto");
    }
    public static int contarOcurrencias(String texto, String palabraBuscada) {
        int ocurrencias = 0;
        int indice = 0;
        while (indice != -1) {

            indice = texto.indexOf(palabraBuscada, indice);
            if (indice != -1) {
                ocurrencias++;
                indice += palabraBuscada.length();
            }
        }
        return ocurrencias;
    }
}
