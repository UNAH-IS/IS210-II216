package implementacion;

import clases.Alumno;
import clases.Maestro;

public class Principal {
	int a = 4;
	public static void main(String args[]){
		a=6;
		Alumno a = new Alumno("ElBrayan","Rodriguez",
				24,"M","Ing. Electrica",
				"Ciudad Universitaria","121321321321","6666644563");
		//a.setNombre("ElBrayan");
		/*a.mostrarInformacion();
		a.matricular();

		Maestro m = new Maestro("ElKevin","Rodriguez",
				24,"M","Ing. Electrica",
				"Ciudad Universitaria","121321321321",
				234,34534534);

		System.out.println("Nombre maestro: " + m.getNombre());*/

		System.out.println(a);
	}
}
