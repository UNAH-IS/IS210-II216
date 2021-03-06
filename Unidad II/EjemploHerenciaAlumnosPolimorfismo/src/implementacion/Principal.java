package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Alumno;
import clases.Maestro;
import clases.Persona;

public class Principal {
	private ArrayList<Persona> personas;

	public Principal(){
		personas = new ArrayList<Persona>();
		/*Persona p1 = new Persona(
				"Juan","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123"
		);

		Persona p2 = new Persona(
				"Jose","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123"
		);

		Persona p3 = new Persona(
				"Pablo","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123"
		);*/


		Persona a1 = new Alumno(
				"Maria","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				"20120132112312"
		);
		Persona a2 = new Alumno(
				"Alfredo","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				"20120132112312"
		);
		Persona a3 = new Alumno(
				"Luis","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				"20120132112312"
		);

		Persona m1 = new Maestro(
				"Brayan","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				4444,
				250000
		);
		Persona m2 = new Maestro(
				"Kevin","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				4444,
				250000
		);
		Persona m3 = new Maestro(
				"Britany","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				4444,
				250000
		);



		personas.add(m3);
		//personas.add(p3);
		personas.add(a1);
		personas.add(m2);
		//personas.add(p1);
		personas.add(a2);
		//personas.add(p2);
		personas.add(a3);
		personas.add(m1);

		mostrarAlumnos();
		mostrarMaestros();
		mostrarPersonas();

		Alumno a4 = new Alumno("Matusalen","Perez",
				34,"M","Ing. Sistemas",
				"Ciudad Universitaria",
				"0801-12313-123123",
				"20120132112312");

		Persona p4 = (Persona)a4;
		System.out.println("Persona 4: " + p4);
	}

	public void mostrarAlumnos(){
		System.out.println("---Listado de Alumnos-------");
		for(int i=0;i<personas.size();i++){
			// objeto instanceof Clase
			if (personas.get(i) instanceof Alumno){
				System.out.println(personas.get(i).toString());
				Alumno a = (Alumno)personas.get(i);
				a.suspenderAlumno();
			}
		}
	}

	public void mostrarMaestros(){
		System.out.println("---Listado de Maestros-------");
		for(int i=0;i<personas.size();i++){
			// objeto instanceof Clase
			if (personas.get(i) instanceof Maestro)
				System.out.println(personas.get(i).toString());
		}
	}

	public void mostrarPersonas(){
		System.out.println("---Listado de Personas-------");
		for(int i=0;i<personas.size();i++){
			// objeto instanceof Clase
			if (!(personas.get(i) instanceof Alumno) &&
					!(personas.get(i) instanceof Maestro))
				System.out.println(personas.get(i).toString());
		}
	}


	public static void main(String args[]){
		new Principal();
	}
}
