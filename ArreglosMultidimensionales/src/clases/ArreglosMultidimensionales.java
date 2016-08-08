package clases;

public class ArreglosMultidimensionales {

	public static void main(String[] args) {
		int[][] matriz = new int[5][3];
		matriz[0][0] = 5;
		matriz[0][1] = 15;
		matriz[0][2] = 20;

		matriz[1][0] = 5;
		matriz[1][1] = 15;
		matriz[1][2] = 20;

		matriz[2][0] = 5;
		matriz[2][1] = 15;
		matriz[2][2] = 20;

		matriz[3][0] = 5;
		matriz[3][1] = 15;
		matriz[3][2] = 20;

		matriz[4][0] = 5;
		matriz[4][1] = 15;
		matriz[4][2] = 20;

		System.out.println("Cantidad de filas: " + matriz.length);
		System.out.println("Cantidad de columnas: " + matriz[0].length);
		for (int i = 0; i<matriz.length; i++){
			for (int j = 0;j<matriz[0].length;j++){
				//System.out.println("Valor "+ i +"," +j +": "+ matriz[i][j]);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
