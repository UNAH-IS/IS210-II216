import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {
	private BufferedOutputStream flujoEscritura;
	public EjemploFileOutputStream(){
		try {
			flujoEscritura =
					new BufferedOutputStream(new FileOutputStream("prueba.txt", true));
			String mensaje = "Hola mundo";
			//System.out.println(mensaje.getBytes()[0]);
			flujoEscritura.write(mensaje.getBytes());
			flujoEscritura.write(13);// El codigo 13 representa un salto de linea \n
			flujoEscritura.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EjemploFileOutputStream();
	}

}
