package Actividad2;

public class Main {
    public static void main(String[] args) {
        String a = "Glorios partido del Real Betis en el Coliseum Alfonso Perez";
        int i = 0;
        calcularPalabras(a, i);
    }
    static void calcularPalabras (String a, int i){
        i = 0;
        for (int b = 0; b < 10 ; b++){
            while (a == " "){
                i++;
            }
        }
        System.out.println("Palabras del texto es " + i);
    }
}
