package clases;

import java.util.Scanner;

public class EjemploScanner {
	public static void main(String[] args) {
		String nombre; //String se importa automaticamente
		int entero;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un nombre: ");
		nombre = entrada.next();
		System.out.println("Nombre:" + nombre);

		System.out.println("Ingrese un entero: ");
		entero = entrada.nextInt();
		System.out.println("Entero ingresado: " + entero);
		entrada.close();//Liberar recursos
	}
}
