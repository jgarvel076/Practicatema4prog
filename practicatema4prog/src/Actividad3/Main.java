package Actividad3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        int suma = 0;
        int numeroAnt = numeros[12];
        int numeroNue = numeros[13];
        numeroAleatorio(numeros);
        numeroMayor( numeros);
        numeroMenor(numeros);
        int sumados = numeroSuma(suma, numeros);
        double media = (double) sumados/numeros.length;
        System.out.println(media);

        System.out.println(Arrays.toString(numeros));
        numeroSustituir(numeros, numeroAnt, numeroNue);

    }
    static void numeroAleatorio (int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
    }
    static int numeroMayor ( int[] numeros){
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor del array es: " + mayor);
        return mayor;
    }
    static int numeroMenor ( int[] numeros){
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El menor del array es: " + mayor);
        return mayor;
    }
    static int numeroSuma (int suma, int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de todos los números del array es: " + suma);
        return suma;
    }
    static void numeroSustituir (int[] numeros, int numeroAnt, int numeroNue){
        int [] numeros2 = numeros.clone();
        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] == numeroAnt) {
                numeros2[i] = numeroNue;
            }
        }
        System.out.println(Arrays.toString(numeros2));
    }
}
