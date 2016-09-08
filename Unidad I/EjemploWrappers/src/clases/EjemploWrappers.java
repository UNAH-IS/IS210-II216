package clases;

import java.util.ArrayList;

public class EjemploWrappers {

	public static void main(String[] args) {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(10);

		int a = 5;
		Integer b = new Integer("9");
		Integer c = 95;



		String nombre = "ElBrayan";
		String apellido = new String("Perez");

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		System.out.println("nombre: "+ nombre);
		System.out.println("apellido: "+ apellido);

	}

}
