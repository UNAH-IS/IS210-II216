package clases;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		//Hay que tener cuidado al realizar divisiones entre numeros
		//enteros ya que de ser asi se perderan los decimales,
		//para evitar este problema hay que hacer un cast o
		//conversion de tipos
		int a      = 12;
		int b      = 10;
		float c      = (float)a; //Cast o conversion de tipos
		float d      = (float)b;
		int suma   = a + b;
		int resta  = a - b;
		int mult   = a * b;
		float div    = (float)a / (float)b; //Hacer el cast o conversion para no perder los decimales
		int modulo = a % b;

		System.out.print("Suma :");
		System.out.println(suma );
		//System.out.print("Suma :" + suma);
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);
	}

}
