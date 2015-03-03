
package edu.eetac.dsa.rgonzalez.Ejercicio2;


public class Rectangle extends AbstractShape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        super("rectangulo");
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
