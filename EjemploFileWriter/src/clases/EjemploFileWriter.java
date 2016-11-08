package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
	private FileWriter flujo;
	private BufferedWriter flujoMejorado;
	public EjemploFileWriter(){
		try {
			//El segundo parametro indica si el archivo se abre
			//para anexar contenido(true) o para sustituirlo complemente(false)
			flujo = new FileWriter("archivo.txt", true);
			flujoMejorado = new BufferedWriter(flujo );
			flujoMejorado.write("Hola Pedro");
			flujoMejorado.newLine();
			flujoMejorado.write("Otro texto");
			flujoMejorado.newLine();
			flujoMejorado.flush();
			flujo.close();
			System.out.println("Archivo finalizado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		new EjemploFileWriter();
	}
}
