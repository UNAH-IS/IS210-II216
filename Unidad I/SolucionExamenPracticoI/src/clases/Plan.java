package clases;

public class Plan {
	private int cantidadMinutos;
	private int cantidadMensajes;
	private int cantidadMegabytes;
	private double costoPaquete;
	public Plan(int cantidadMinutos, int cantidadMensajes, int cantidadMegabytes, double costoPaquete) {
		this.cantidadMinutos = cantidadMinutos;
		this.cantidadMensajes = cantidadMensajes;
		this.cantidadMegabytes = cantidadMegabytes;
		this.costoPaquete = costoPaquete;
	}

	public Plan(){}
	public int getCantidadMinutos() {
		return cantidadMinutos;
	}
	public void setCantidadMinutos(int cantidadMinutos) {
		this.cantidadMinutos = cantidadMinutos;
	}
	public int getCantidadMensajes() {
		return cantidadMensajes;
	}
	public void setCantidadMensajes(int cantidadMensajes) {
		this.cantidadMensajes = cantidadMensajes;
	}
	public int getCantidadMegabytes() {
		return cantidadMegabytes;
	}
	public void setCantidadMegabytes(int cantidadMegabytes) {
		this.cantidadMegabytes = cantidadMegabytes;
	}
	public double getCostoPaquete() {
		return costoPaquete;
	}
	public void setCostoPaquete(double costoPaquete) {
		this.costoPaquete = costoPaquete;
	}
	@Override
	public String toString() {
		return "Plan [cantidadMinutos=" + cantidadMinutos + ", cantidadMensajes=" + cantidadMensajes
				+ ", cantidadMegabytes=" + cantidadMegabytes + ", costoPaquete=" + costoPaquete + "]";
	}
}
