package clases;

import java.util.Scanner;

public class EjemploScanner {
	public static void main(String[] args) {
		String nombre; //String se importa automaticamente
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un nombre: ");
		nombre = entrada.next();
		System.out.println("Nombre:" + nombre);
		entrada.close();//Liberar recursos
	}

}
