package clases;

public class Alumno extends Persona{
	private String cuenta;

	public Alumno(String nombre, String apellido,
			int edad, String genero,
			String carrera, String centroRegional,
			String identidad, String cuenta){
		super(nombre, apellido, edad, genero,
				carrera, centroRegional, identidad);
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void mostrarNombre(){
		System.out.println(nombre);
	}

	public void mostrarInformacion(){
		System.out.println(super.toString() + "Cuenta:  " + cuenta);
	}

	@Override
	public void matricular(){
		super.matricular();
		System.out.println("Matriculando desde la clase alumno, "
				+ "es una funcionalidad complemente nueva");
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", genero=" + genero + ", carrera=" + carrera + ", centroRegional=" + centroRegional + ", identidad="
				+ identidad + "]";
	}

	public void suspenderAlumno(){
		System.out.println("Suspendiendo alumno");
	}

	public void admision(){
		System.out.println("Admision");
	}
	public void aprobar(){
		System.out.println("Aprobar");
	}
	public void reprobar(){
		System.out.println("Reprobar");
	}
}
