package ejemplos;

public class ArreglosBasicos {
	public static void main(String[] args){
		byte[] edad = new byte[4];

		int[] enteros;
		enteros = new int[5];
		enteros[0] = 10;
		enteros[1] = 7;
		enteros[2] = 11;
		enteros[3] = 15;
		enteros[4] = 50;


		System.out.println("Cantidad de elementos: " + enteros.length);

		for (int i=0; i<enteros.length;i++){
			System.out.println("Elemento " + i + ":"+enteros[i]);
		}

		//for each
		/*

		 for (tipoDato nombreVariable: arreglo){

		 }

		 * */
		System.out.println("Imprimir valores con un for each");
		for (int valor: enteros)
			System.out.println("Valor: "+valor);

		/*enteros = new int[6];
		System.out.println(enteros[4]);
		System.out.println("Cantidad de elementos: " + enteros.length);
		*/




		//short[] edad = new short[4];
		//int[] edad = new int[4];
		//long[] edad = new long[4];
		float[] estatura = new float[3];
		//double[] estatura = new double[3];
		boolean[] estado = new boolean[5];
		char[] genero = new char[2];
		String[] nombre = new String[2];

		double[] estaturas = {1.73, 1.67, 1.56}; //Arreglo de 3 elementos
	}
}
