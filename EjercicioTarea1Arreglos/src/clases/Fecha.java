package clases;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha(String fecha){ //  DD/MM/YYYY
		String partes[] = fecha.split("/");
		dia = Integer.valueOf(partes[0]);
		mes = Integer.valueOf(partes[1]);
		anio = Integer.valueOf(partes[2]);
	}

	public boolean verificarFecha(){
		if (dia<=0 || dia>31)
			return false;

		if (mes<=0 || mes>12)
			return false;

		if (anio<0 || anio>9999)
			return false;

		return true;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
}
