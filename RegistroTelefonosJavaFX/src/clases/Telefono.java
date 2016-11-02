package clases;

public class Telefono {
	private Marca marca;
	private Modelo modelo;
	private String numeroTelefono;
	private Color color;
	private String operador;
	private String nombreCliente;
	public Telefono(Marca marca, Modelo modelo, String numeroTelefono, Color color, String operador,
			String nombreCliente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroTelefono = numeroTelefono;
		this.color = color;
		this.operador = operador;
		this.nombreCliente = nombreCliente;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", modelo=" + modelo + ", numeroTelefono=" + numeroTelefono + ", color="
				+ color + ", operador=" + operador + ", nombreCliente=" + nombreCliente + "]";
	}

}
