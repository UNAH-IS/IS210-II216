package clases;

public class Color {
	private int codigoColor;
	private String nombreColor;
	private Color color;

	public Color(int codigoColor, String nombreColor, Color color) {
		super();
		this.codigoColor = codigoColor;
		this.nombreColor = nombreColor;
		this.color = color;
	}
	public int getCodigoColor() {
		return codigoColor;
	}
	public void setCodigoColor(int codigoColor) {
		this.codigoColor = codigoColor;
	}
	public String getNombreColor() {
		return nombreColor;
	}
	public void setNombreColor(String nombreColor) {
		this.nombreColor = nombreColor;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String toString(){
		return nombreColor;
	}

	public String toCSV(){
		return codigoColor + "," + nombreColor;
	}
}
