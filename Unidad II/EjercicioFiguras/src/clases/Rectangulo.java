package clases;

import java.awt.Color;

public class Rectangulo extends Figura {

	public Rectangulo(int coordenadaX, int coordenadaY, int ancho, int alto, Color color, double area) {
		super(coordenadaX, coordenadaY, ancho, alto, color, area);
	}

	public Rectangulo() {}

	@Override
	public void dibujar() {
		System.out.println("Dibujando rectangulo");
	}

}
