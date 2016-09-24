package clases;

import java.awt.Color;

public class Ovalo extends Figura {

	public Ovalo(int coordenadaX, int coordenadaY, int ancho, int alto, Color color, double area) {
		super(coordenadaX, coordenadaY, ancho, alto, color, area);
	}

	public Ovalo() {}

	@Override
	public void dibujar() {
		System.out.println("Dibujar un ovalo");
	}

}
