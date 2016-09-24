package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Cliente;
import clases.LineaTelefonica;
import clases.Plan;

public class Principal {
	public static void main(String args[]){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		LineaTelefonica lineasTelefonicas[] = new LineaTelefonica[2];
		lineasTelefonicas[0] =
				new LineaTelefonica(
						"98887789","S7","Samsung",
						new Plan(45,65,100,500)
				);

		lineasTelefonicas[1] =
				new LineaTelefonica(
						"445646546","7","iPhone",
						new Plan(44,100,200,700)
				);
		Cliente c = new Cliente(
				"Juan","Rodriguez",34,"M",
				"1111-1111-11111","juan@gmail.com",
				"Colonia Kenide",
				lineasTelefonicas
		);
		clientes.add(c);

		System.out.println("----Informacion clientes---");

		for(int i=0;i<clientes.size();i++){
			System.out.println(clientes.get(i));
		}

		LineaTelefonica lineasClienteSeleccionado[] =
				clientes.get(0).getLineasTelefonicas();
		System.out.println("Lineas telefonicas cliente 0:");
		for(int i=0;i<lineasClienteSeleccionado.length;i++){
			System.out.println(lineasClienteSeleccionado[i].toString());
		}

		do{
			c.setIdentidad(JOptionPane.showInputDialog("Ingrese la identidad"));
		}while(c.verificarIdentidad()==false);
	}
}
