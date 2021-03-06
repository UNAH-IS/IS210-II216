package clases;

import java.io.File; //Input-Output
import java.io.IOException;

public class EjemploClaseFile {
	private File archivo;
	private File directorio;
	public EjemploClaseFile(){
		archivo = new File("C:\\Prueba\\HolaMundo.java");
		directorio = new File("C:\\Prueba\\DirectorioNuevo");
		directorio.mkdir();

		if(archivo.exists()){
			System.out.println("El archivo si existe");
			System.out.println(archivo.getName());
			System.out.println(archivo.getPath());
			System.out.println("Tama�o:"+archivo.length());
		}else{
			System.out.println("El archivo NO existe");
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File archivoTemporal;
		File directorioTemporal;

		for(int i=0;i<300;i++){
			archivoTemporal = new File("C:\\Prueba\\DirectorioNuevo\\archivo"+i+".txt");
			directorioTemporal = new File("C:\\Prueba\\DirectorioNuevo\\directorio"+i);
			try {
				archivoTemporal.createNewFile();
				directorioTemporal.mkdir();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]){
		new EjemploClaseFile();
	}
}
