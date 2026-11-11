/*
 * Arrays1.java
 * 
 */

import java.util.Random;
public class Arrays1 {
	
	public static void main (String[] args) {
		Random random = new Random();
		int[] enteros = new int[5];
		System.out.printf("Creado array de enteros de tamaño %d%n", enteros.length);
		for (int i = 0; i < enteros.length; i++) {
			System.out.printf("Posicion %d: %d%n", i, enteros[i]); //está lleno de ceros
		}
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = random.nextInt(1, 11);
		}
		System.out.println("Modificado de forma aleatoria los valores del array");
		for (int i = 0; i < enteros.length; i++) {
			System.out.printf("Posicion %d: %d%n", i, enteros[i]);
		}
		enteros[2] = 122;
		System.out.println("Fijamos el valor del elemento tercero");
		for (int i = 0; i <= enteros.length; i++) {
			System.out.printf("Posicion %d: %d%n", i, enteros[i]);
		}
	}
}

