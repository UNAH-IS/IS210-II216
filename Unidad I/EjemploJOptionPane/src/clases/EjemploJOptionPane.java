package clases;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Hola mundo");
		//Mostrar un mensaje
		JOptionPane.showMessageDialog(null, "Mensaje de advertencia",
				"Advertencia", JOptionPane.ERROR_MESSAGE);

		//Capturar informacion
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad:"));
		System.out.println("Edad: " + edad);

		//Consultar confirmacion
		int resultado = JOptionPane.showConfirmDialog(null, "¿Desea destruir el mundo?");
		System.out.println("Resultado: "+ resultado);
		//No: 1
		//Cancelar: 2
		//Si: 0
		if (resultado == 0)
			System.out.println("Destruiste el mundo :(");
		else
			System.out.println("Que aburrido");

	}

}
