package Actividad4;

public class ValidadorDNI {
    public static void main(String[] args) {

        System.out.print("Escriba su DNI: ");
        String dni = "20501079A";
        System.out.println(" ");

        if (dni.length() != 9) {
            System.out.println("DNI NO ENCONTRADO (debe constar de 9 caracteres).");
            return;
        }

        String numerosDni = dni.substring(0, 8);
        char letraDni = dni.charAt(8);

        int numeros = Integer.parseInt(numerosDni); //Mediante el método parseInt convertimos la cadena de 9 caractéres en un entero
        char letraCorrecta = getLetraDni(numeros);

        if (letraCorrecta != letraDni) {
            System.out.println("DNI NO ENCONTRADO (letra incorrecta).");
            return;
        }
        System.out.println("DNI ENCONTRADO.");
    }
    private static char getLetraDni(int numeros) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int let = numeros % 23;
        return abecedario.charAt(let);
    }
}
