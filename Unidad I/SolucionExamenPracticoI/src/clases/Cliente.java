package clases;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String identidad;
	private String correoElectronico;
	private String direccion;
	private LineaTelefonica lineasTelefonicas[];
	public Cliente(String nombre, String apellido, int edad, String genero, String identidad, String correoElectronico,
			String direccion, LineaTelefonica[] lineasTelefonicas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.identidad = identidad;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.lineasTelefonicas = lineasTelefonicas;
	}
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdentidad() {
		return identidad;
	}
	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LineaTelefonica[] getLineasTelefonicas() {
		return lineasTelefonicas;
	}
	public void setLineasTelefonicas(LineaTelefonica[] lineasTelefonicas) {
		this.lineasTelefonicas = lineasTelefonicas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", identidad=" + identidad + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion
				+ ", lineasTelefonicas=" + Arrays.toString(lineasTelefonicas) + "]";
	}

	public boolean verificarIdentidad(){
		String partes[] = identidad.split("-");
		if(partes.length!=3){
			JOptionPane.showMessageDialog(null, "Identidad incorrecta, solo 3 tokens");
			return false;
		}

		if(
			partes[0].length()!=4 ||
			partes[1].length()!=4 ||
			partes[2].length()!=5
		){
			JOptionPane.showMessageDialog(null, "Identidad incorrecta, la cantidad de caracteres por token esta mal");
			return false;
		}

		return true;
	}
}
