package implementacion;

import javax.swing.JOptionPane;

import clases.Archivo;
import clases.Usuario;

public class Principal {

	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		int cantidadUsuariosCompartir = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuantos usuarios "
				+ "compartira este archivo?"));

		Usuario usuarios[] = new Usuario[cantidadUsuariosCompartir];
		usuarios[0] = new Usuario();
		usuarios[0].setNombreUsuario(
				JOptionPane.showInputDialog("Nombre del usuario 0: ")
		);
		usuarios[0].setCorreoElectronico(
				JOptionPane.showInputDialog("Correo del usuario 0: ")
		);

		//....
		archivo.setUsuariosCompartio(usuarios);


	}

}
