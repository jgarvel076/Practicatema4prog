package Actividad1;

public class Triangulo extends Geometria implements Coloreable {
    protected Double base;
    protected Double altura;
    Triangulo (double base, double altura){

    }

    @Override
    protected double Area() {
        return (base * altura)/2;
    }

    @Override
    protected double Perimetro() {
        return 3 * base;
    }
}

