package Actividad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Geometria[] formas = new Geometria[6];
        formas[0] = new Circulo(2d);
        formas[1] = new Cuadrado(4d);
        formas[2] = new Triangulo(3.4d, 5.3d);
        formas[3] = new Circulo(5d);
        formas[4] = new Cuadrado(5d);
        formas[5] = new Triangulo(1.2d, 3.4d);

        double totalAreas = 0;
        double totalPerimetro = 0;

        System.out.println(Arrays.toString(formas));
        for (int i = 0; i < formas.length; i ++){
            totalAreas += formas[i].Area();
            totalPerimetro += formas[i].Perimetro();
        }


        System.out.println(totalAreas);
        System.out.println(" ");
        System.out.println(totalPerimetro);
    }
}
