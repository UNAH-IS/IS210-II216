package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends Figura {

	public Ovalo(int coordenadaX, int coordenadaY, int ancho, int alto, Color color, double area) {
		super(coordenadaX, coordenadaY, ancho, alto, color, area);
	}

	public Ovalo() {}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(color);
		g.drawOval(coordenadaX, coordenadaY, ancho, alto);
		System.out.println("Dibujar un ovalo");
	}

}
