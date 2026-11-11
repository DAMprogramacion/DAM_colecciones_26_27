/*
 * Arrays5.java
 * Uso del bucle mejorado
 */


public class Arrays5 {
	
	public static void main (String[] args) {
		
		float[] numeros = {1.4f, 1.5f, 1.2f, 1.3f, 1.7f, 55}; //inicialización de un array de floats
		//forma clásica, interesante para inicializar valores y saber posición
		for (int i = 0; i < numeros.length; i++)
			System.out.println(numeros[i]);
		System.out.println("===================");
		//otra forma de recorrerlo
		for (float numero : numeros)
			System.out.println(numero);
			
		//calcular el valor medio, usando un bucle mejorado (enhaced)
		float suma = 0;
		for (float numero : numeros ) {
			suma += numero;
		}
		float media = suma / numeros.length;
		System.out.printf("La media de valores es: %.2f%n", media);
		//calculamos el valor máximo y el valor mínimo
		//Suponemos que el primer valor es el más grande, y luego en el bucle lo comparamos con el resto
		float max = numeros[0];
		for (float numero : numeros) {
			if (numero > max) 
				max = numero;
		}
		System.out.printf("El valor máximo es %.2f%n", max);
		
		float min = numeros[0];
		for (float numero : numeros) {
			if (numero < min) 
				min = numero;
		}
		System.out.printf("El valor mínimo es %.2f%n", min);
		//usando la clase Helper
		float[] maxMin = Helper.calcularMaximoMinimoArrays(numeros);
		System.out.printf("El valor máximo es %.2f y el valor mínimo es %.2f%n", maxMin[0], maxMin[1]);
		
		
	}
}

