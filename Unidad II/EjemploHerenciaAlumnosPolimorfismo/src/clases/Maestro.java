package clases;

public class Maestro extends Persona{
	private int numeroEmpleado;
	private double sueldo;

	public Maestro(String nombre, String apellido, int edad, String genero, String carrera, String centroRegional,
			String identidad, int numeroEmpleado, double sueldo) {
		super(nombre, apellido, edad, genero, carrera, centroRegional, identidad);
		this.numeroEmpleado = numeroEmpleado;
		this.sueldo = sueldo;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Maestro [numeroEmpleado=" + numeroEmpleado + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", genero=" + genero + ", carrera=" + carrera + ", centroRegional="
				+ centroRegional + ", identidad=" + identidad + "]";
	}

	@Override
	public void admision() {

	}

	@Override
	public void aprobar() {

	}

	@Override
	public void reprobar() {

	}
}
