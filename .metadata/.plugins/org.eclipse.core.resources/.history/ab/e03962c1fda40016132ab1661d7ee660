import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploClaseFileReader {
	private FileReader flujoLectura;
	private BufferedReader flujoLecturaMejorado;
	private String linea;
	public EjemploClaseFileReader(){
		try {
			flujoLectura = new FileReader("C:/Prueba/HolaMundo.java");
			flujoLecturaMejorado = new BufferedReader(flujoLectura);
			linea = flujoLecturaMejorado.readLine();
			while (linea!=null){
				System.out.println(linea);
				linea = flujoLecturaMejorado.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EjemploClaseFileReader();
	}

}
