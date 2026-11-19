/*
 * ClaseArrays.java
 */

import java.util.Arrays;
public class ClaseArrays {
	
	public static void main (String[] args) {
		int enteros[] = new int[4];
		enteros[0] = 0;
		enteros[1] = 1;
		enteros[2] = 2;
		enteros[3] = 3;
		System.out.println(enteros);
		System.out.println(Arrays.toString(enteros));
		//necesitas incrementar el tamaño del array, porque hay que introducir un nuevo dato
		//enteros[4] = 4; no se puede incrementar el tamaño
		int[] nuevosEnteros = new int[enteros.length + 1];
		for (int i = 0; i < enteros.length; i++)
			nuevosEnteros[i] = enteros[i];
		System.out.println("Nuevo arrays:");
		System.out.println(Arrays.toString(nuevosEnteros));
		nuevosEnteros[4] = 4;
		System.out.println(Arrays.toString(nuevosEnteros));
		//usando la clase Arrays
		int[] nuevosEnteros2 = Arrays.copyOf(enteros, enteros.length + 1);
		System.out.println("Usando la clase arrays");
		System.out.println(Arrays.toString(nuevosEnteros2));
		nuevosEnteros2[4] = 4;
		System.out.println(Arrays.toString(nuevosEnteros2));
		//ordenando arrays
		double[] numeros = {5.5, 3.2, 1.1, 8.7, 4.4, 5.3};
		System.out.println("array sin ordenar");
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println("array ordenado");
		System.out.println(Arrays.toString(numeros));
		//hemos perdido en orden
		double min = numeros[0];
		double max = numeros[numeros.length - 1];
		System.out.printf("Valor máximo del array: %.2f y mínimo: %.2f%n", max, min);
		
		



	}
}

