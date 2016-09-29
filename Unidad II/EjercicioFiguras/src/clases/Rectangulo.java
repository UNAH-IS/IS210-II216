package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura {

	public Rectangulo(int coordenadaX, int coordenadaY, int ancho, int alto, Color color, double area) {
		super(coordenadaX, coordenadaY, ancho, alto, color, area);
	}

	public Rectangulo() {}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(color);
		g.drawRect(coordenadaX, coordenadaY, ancho, alto);
		System.out.println("Dibujando rectangulo");
	}

}
