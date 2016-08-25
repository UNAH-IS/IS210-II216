package clases;

public class Empleado {
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	private String profesion;
	private Fecha fechaIngreso;
	private double sueldoBaseMensual;
	private double impuesto;
	private double deduccion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSueldoBaseMensual() {
		return sueldoBaseMensual;
	}
	public void setSueldoBaseMensual(double sueldoBaseMensual) {
		this.sueldoBaseMensual = sueldoBaseMensual;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getDeduccion() {
		return deduccion;
	}
	public void setDeduccion(double deduccion) {
		this.deduccion = deduccion;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", edad=" + edad
				+ ", profesion=" + profesion + ", fechaIngreso=" + fechaIngreso + ", sueldoBaseMensual="
				+ sueldoBaseMensual + ", impuesto=" + impuesto + ", deduccion=" + deduccion + "]";
	}

	public double obtenerSueldoNeto(){
		return sueldoBaseMensual - (impuesto+deduccion);
	}

	public String obtenerNombreCompleto(){
		return nombre + " " + apellido;
	}
}
