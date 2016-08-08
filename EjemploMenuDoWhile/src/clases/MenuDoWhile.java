package clases;

import java.util.Scanner;

public class MenuDoWhile {
	public static void main(String[] args) {
		int opcion;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("-----Menu-----");
			System.out.println("0 Salir");
			System.out.println("1 Opcion 1");
			System.out.println("2 Opcion 2");
			System.out.println("3 Opcion 3");
			System.out.println("4 Opcion 4");
			System.out.print("¿Que opcion desea ejecutar?: ");
			opcion = entrada.nextInt();
			switch(opcion){
				case 0:
					System.out.println("Adios");
				break;
				case 1:
					System.out.println("Se selecciono la opcion 1");
				break;
				case 2:
					System.out.println("Se selecciono la opcion 2");
				break;
				case 3:
					System.out.println("Se selecciono la opcion 3");
				break;
				case 4:
					System.out.println("Se selecciono la opcion 4");
				break;
				default:
					System.out.println("Opcion invalida");
				break;
			}

		} while (opcion!=0);
		System.out.println("Fin del programa");
	}
}
