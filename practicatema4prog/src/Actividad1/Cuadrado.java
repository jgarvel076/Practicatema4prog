package Actividad1;

public class Cuadrado extends Geometria implements Coloreable {
    Double lado;
    Cuadrado (double lado){
        this.lado = lado;
    }

    @Override
    protected double Area() {
        return lado * lado;
    }

    @Override
    protected double Perimetro() {
        return 4 * lado;
    }
}