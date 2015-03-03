
package edu.eetac.dsa.rgonzalez.Ejercicio2;

public abstract class AbstractShape implements Shape {
    private String tipo;

    public AbstractShape(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Soy un " + tipo;
    }

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
