

package edu.eetac.dsa.rgonzalez.Ejercicio2;


public class Circle extends AbstractShape {
    private double radio;

    public Circle(double radius) {
        super("circulo");
       // this.radio= radius;
    }

    public double getRadius() {
        return radio;
    }

    public void setRadius(double radius) {
        this.radio = radius;
    }

    @Override
    public double area() {
        return 3.1416 * radio * radio;
    }
}
