package clases;

public class Modelo {
	private int codigoModelo;
	private String nombreModelo;
	public Modelo(int codigoModelo, String nombreModelo) {
		super();
		this.codigoModelo = codigoModelo;
		this.nombreModelo = nombreModelo;
	}
	public int getCodigoModelo() {
		return codigoModelo;
	}
	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	public String getNombreModelo() {
		return nombreModelo;
	}
	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}
	public String toString(){
		return nombreModelo;
	}

	public String toCSV(){
		return codigoModelo + "," + nombreModelo;
	}
}
