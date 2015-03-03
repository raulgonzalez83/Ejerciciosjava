
package edu.eetac.dsa.rgonzalez.Ejercicio2;


public class AppInheritance {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(8.5);
        shapes[1] = new Rectangle(10, 5);

        for (Shape shape : shapes)
            System.out.println(shape + " con area = " + shape.area());
    }
}
