package clases;

public class LineaTelefonica {
	private String numeroTelefono;
	private String modelo;
	private String marca;
	private Plan plan;
	public LineaTelefonica(String numeroTelefono, String modelo, String marca, Plan plan) {
		this.numeroTelefono = numeroTelefono;
		this.modelo = modelo;
		this.marca = marca;
		this.plan = plan;
	}

	public LineaTelefonica(){}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "LineaTelefonica [numeroTelefono=" + numeroTelefono + ", modelo=" + modelo + ", marca=" + marca
				+ ", plan=" + plan + "]";
	}

}
