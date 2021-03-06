package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Empleado;
import clases.Fecha;

public class Principal {

	public static void solicitarInformacion(Empleado e, Scanner entrada){
		System.out.println("Nombre: ");
		e.setNombre(entrada.next());
		System.out.println("Apellido: ");
		e.setApellido(entrada.next());
		System.out.println("Genero: ");
		e.setGenero(entrada.next());
		System.out.println("Edad: ");
		e.setEdad(entrada.nextInt());
		System.out.println("Profesi�n: ");
		e.setProfesion(entrada.next());
		System.out.println("Fecha de ingreso (DD/MM/YYYY): ");
		e.setFechaIngreso(new Fecha(entrada.next()));
		System.out.println("Sueldo base: ");
		e.setSueldoBaseMensual(entrada.nextDouble());
		System.out.println("Impuesto sobre la renta: ");
		e.setImpuesto(entrada.nextDouble());
		System.out.println("Deduccion de seguro social: ");
		e.setDeduccion(entrada.nextDouble());
	}

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;

		do{
			System.out.println(
					"0 Salir\n"
					+ "1 Agregar empleado\n"
					+ "2 Modificar empleado\n"
					+ "3 Eliminar empleado\n"
					+ "4 Mostrar informaci�n"
			);
			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					//Crear una instancia vacia de empleado
					Empleado e = new Empleado();
					//Solicitar la informacion
					solicitarInformacion(e, entrada);
					//Agregar la instancia al ArrayList
					empleados.add(e);
					break;
				case 2:
					//Solicitar el indice a modificar
					System.out.println("�Que registro desea modificar? (del 0 al "+(empleados.size()-1)+")");
					int indiceModificar = entrada.nextInt();
					Empleado e1=empleados.get(indiceModificar);
					//Solicitar nuevamente la informacion
					solicitarInformacion(e1, entrada);
					//Sustituir el objeto modificado
					empleados.set(indiceModificar, e1);
					break;
				case 3:
					//Solicitar el indice a eliminar
					System.out.println("�Que registro desea eliminar? (del 0 al "+(empleados.size()-1)+")");
					int indiceEliminar = entrada.nextInt();
					//Eliminar registro
					empleados.remove(indiceEliminar);
					break;
				case 4:
					System.out.println("-------Listado de empleados--------");
					for (int i = 0;i<empleados.size();i++)
						System.out.println(empleados.get(i));
					break;

			}
		}while(opcion!=0);

		System.out.println("Finalizo el programa");
	}

}
