/*
 * Helper.java
 * Clase con métodos estáticos para ayudar 
 * a realizar operaciones sobre arrays
 */


public class Helper {
	//devuelve un array de floats con dos elementos
	//el primero un maxímo de un array de float
	//y el segundo elemento el mínimo de ese array
	public static float[] calcularMaximoMinimoArrays(float[] numeros) {
		float[] maxMin = new float[2];
		
		float min = numeros[0], max = numeros[0];
		for (float numero : numeros){
			if (numero > max)
				max = numero;
			if (numero < min)
				min = numero;
		}
		
		maxMin[0] = max;
		maxMin[1] = min;
		return maxMin;
	}
}

