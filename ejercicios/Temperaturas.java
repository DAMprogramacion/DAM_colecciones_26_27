/*
 * Temperaturas.java
 */

import java.util.Scanner;
public class Temperaturas {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] diaSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
		double[] temperaturas = new double[7];
		for (int i = 0; i < temperaturas.length; i++) {
			//Solicitar al usuario las temperaturas de los siete días de la semana
			System.out.printf("Dime la temperatura del día %s%n", diaSemana[i]);
			temperaturas[i] = scanner.nextDouble();
		}
		
		//Mostrar todas las temperaturas introducidas.
		double sumaTemperaturas = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("Temperatura del %S: %.2f%n", diaSemana[i], temperaturas[i]);
			sumaTemperaturas += temperaturas[i];
		}
		//calcular media
		double mediaTemperaturas = sumaTemperaturas / temperaturas.length;
		System.out.printf("Temperatura media semanal %.2f%n", mediaTemperaturas);
		//calcular la temperatura máxima y mínima
		double max = temperaturas[0];
		double min = temperaturas[0];
		//se debería hacer en el bucle anterior, para aprovechar el procesamiento 
		for (double temperatura: temperaturas) {
			if (temperatura > max) 
				max = temperatura;
			if (temperatura < min)
				min = temperatura;
		}
		System.out.printf("Temperatura máxima %.2f y temperatura mínima %.2f%n", max, min);
		//Indicar cuántos días se ha superado la temperatura media semanal.
		int contador = 0;
		for (double temperatura : temperaturas) 
			if (temperatura > mediaTemperaturas)
				contador++;
		System.out.printf("Nº de días que superan la media %d%n", contador);
		//Solicitar una temperatura y comprobar si se ha registrado algún día con ese valor.
		System.out.println("Introduce temperatura a buscar");
		double temperaturaABuscar = scanner.nextDouble();
		for (int i = 0; i < temperaturas.length; i++) {
			if ( temperaturaABuscar == temperaturas[i]) {
				System.out.printf("La temperatura %.2f se alcanzó el día %s%n", temperaturas[i], diaSemana[i]);
			}
		}

		scanner.close(); //cerramos el Scanner, no lo necesitamos más
		
	}
}

