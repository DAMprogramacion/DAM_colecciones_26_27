/*
 * Matriz.java
 */


public class Matriz {
	
	public static void main (String[] args) {
		
		/*int[][] matriz = { {0, 1, 2},
						   {4, -1, 4},
						   {6, 7, 4},
						   {3, -5, 4} };
		System.out.println(matriz[1][1]); //-1
		System.out.println(matriz[3][0]); //3
		System.out.println(matriz[0][2]); //2
		System.out.println(matriz[0][0]); //0
		System.out.println("Tamaño (filas): " + matriz.length);
		System.out.println("Tamaño (columnas): " + matriz[0].length);
		System.out.println("Nº elementos: " + matriz.length * matriz[0].length);*/
		
		int[][] matriz1 = { {1, 2, 3},
						    {4, 5},
						    {6, 7, 8 ,9}
						};
		System.out.println(matriz1[1][1]); //5
		System.out.println(matriz1[2][3]); //9
		System.out.println(matriz1[0][0]); //1
		//recorremos la primera matriz
		for (int i = 0; i < matriz1.length; i++){
			for (int j = 0; j < matriz1[i].length; j++){
				System.out.printf("(%d,%d): %d%n", i, j, matriz1[i][j]);
			}
		}


	}
}





