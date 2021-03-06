package implementacion;

import java.util.Scanner;

import clases.Producto;

public class Principal {

	public static void main(String[] args) {
		//Declaracion de variables/objetos locales
		Producto productos[];
		Scanner entrada = new Scanner(System.in);
		int cantidadProductos;

		System.out.println("�Cuantos productos desea agregar?");
		cantidadProductos = entrada.nextInt();

		//Solicitar la cantidad de productos
		productos = new Producto[cantidadProductos];


		//[0] =ProductoX
		//[1] =ProductoY
		for(int i=0;i<productos.length;i++){
			productos[i] = new Producto();
			System.out.println("Ingresar datos para el producto " + i);
			System.out.println("C�digo producto:");
			productos[i].setCodigoProducto(entrada.nextInt());
			System.out.println("Nombre del producto:");
			productos[i].setNombreProducto(entrada.next());
			System.out.println("Marca del producto: ");
			productos[i].setMarca(entrada.next());
			System.out.println("Precio: ");
			productos[i].setPrecio(entrada.nextDouble());
			System.out.println("Descuento: ");
			productos[i].setDescuento(entrada.nextDouble());
			System.out.println("Impuesto: ");
			productos[i].setImpuesto(entrada.nextDouble());
		}

		System.out.println("------Informacion guardada------");
		for(int i=0;i<productos.length;i++){
			System.out.println(productos[i].toString());
		}

		System.out.println("Tama�o del arreglo: "+productos.length);
		entrada.close();
	}

}
