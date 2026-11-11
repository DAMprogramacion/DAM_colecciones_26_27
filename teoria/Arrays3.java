/*
 * Arrays3.java
 */

import java.util.Random;
public class Arrays3 {
	
	public static void main (String[] args) {
		Random random = new Random();
		//crear una array de char, de 5 valores inicializados a las vocales
		char[] arrayChars = {'a', 'e', 'i', 'o', 'u'};
		//recorremos con un bucle while, mostramos en consola
		for (int i = 0; i < arrayChars.length; i++)
			System.out.printf("Posción: %d, valor: %c%n", i, arrayChars[i]);
		int contador = 0;
		while (contador < arrayChars.length) {
			System.out.printf("Posción: %d, valor: %c%n", contador, arrayChars[contador]);
			contador++;
		}
		if (arrayChars.length != 0) { 
			int posicion = random.nextInt(0, arrayChars.length);
			System.out.printf("%nVocal obtenidad de forma aleatoria: %c%n", arrayChars[posicion]);
			//obtenemos de forma aleatoria una de las cinco vocales
		}
	}
}

