/*
 * Arrays2.java
 */


public class Arrays2 {
	
	public static void main (String[] args) {
		 //int[] numeros = new int[5]  Se rellena con 5 ceros: 0, 0, 0, 0, 0
		 int[] numeros = {1, 2, 3, 4, 5};
		 for (int i = 0; i < numeros.length; i++) {
			 System.out.printf("Posicion %d: %d%n", i, numeros[i]);
		 }
		 numeros[4] = 555;
		 for (int i = 0; i < numeros.length; i++) {
			 System.out.printf("Posicion %d: %d%n", i, numeros[i]);
		 }
		 //definir un array de doubles, con valores predefinidos: 1.2, 2.2, ....
		 double[] valores = {1.1, 2.2, 3.3, 4.4, 5.5};
		 //mostramos en la consola
		 for (int i = 0; i < valores.length; i++)
			System.out.printf("Posicion %d: %.2f%n", i, valores[i]);
		 //mostramos en la consola, pero al revés, desde la última posición a la primera
		 for (int i = valores.length - 1; i >= 0; i--)
			System.out.printf("Posicion %d: %.2f%n", i, valores[i]);
	}
}

