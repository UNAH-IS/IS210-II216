package clases;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {
	protected int coordenadaX;
	protected int coordenadaY;
	protected int ancho;
	protected int alto;
	protected Color color;
	protected double area;

	public Figura(int coordenadaX, int coordenadaY, int ancho, int alto, Color color, double area) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
		this.area = area;
	}

	public Figura(){}




	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Figura [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", ancho=" + ancho + ", alto="
				+ alto + ", color=" + color + ", area=" + area + "]";
	}

	public abstract void dibujar(Graphics g);
}
