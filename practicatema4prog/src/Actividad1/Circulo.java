package Actividad1;

public class Circulo extends Geometria implements Coloreable {
    Double radio;
    Circulo (double radio){

    }

    @Override
    protected double Area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected double Perimetro() {
        return 2 * Math.PI * radio;
    }
}
