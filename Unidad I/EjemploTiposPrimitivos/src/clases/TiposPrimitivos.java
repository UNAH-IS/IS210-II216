package clases;

public class TiposPrimitivos {
	//Declaracion de variables globales
	//..
	
	public static void main(String[] args) {
		//Declaracion de variables locales
		//Solo son visibles dentro del metodo
		byte numeroByte = 120;
		int numeroInt = 12354;
		long numeroLong = 454612354;
		
		//Para los flotantes es necesario agregar el postfijo f
		float numeroFlotante = 3342.4f;
		//Para los double se puede utilizar el postfijo d o se puede omitir
		double numeroDouble = 4556465.5464565d;
		boolean boleano = true;//true/false
		//Solo puede almacenar una sola letra y debe ir entre apostrofes
		char caracter = 'A';
		String texto = "Hola Mundo"; //Las cadenas se escriben entre comillas dobles
		
		//Se utiliza el signo + para concatenar
		System.out.println("Numero Byte:" + numeroByte);
		System.out.println("Numero Int:" + numeroInt);
		System.out.println("Numero Long:" + numeroLong);
		System.out.println("Numero Float:" + numeroFlotante);
		System.out.println("Numero Double:" + numeroDouble);		
		System.out.println("Valor boleano: " + boleano);
		System.out.println("Caracter: " + caracter);
		System.out.println("Texto: " + texto);
	}
}
