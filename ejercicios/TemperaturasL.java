/*
 * TemperaturasL.java
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TemperaturasL {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] diaSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
		List<Double> temperaturas = new ArrayList();
		for (int i = 0; i < diaSemana.length; i++) {
			//Solicitar al usuario las temperaturas de los siete días de la semana
			System.out.printf("Dime la temperatura del día %s%n", diaSemana[i]);
			temperaturas.add(scanner.nextDouble());
		}
		
		//Mostrar todas las temperaturas introducidas.
		double sumaTemperaturas = 0;
		for (int i = 0; i < temperaturas.size(); i++) {
			System.out.printf("Temperatura del %S: %.2f%n", diaSemana[i], temperaturas.get(i));
			sumaTemperaturas += temperaturas.get(i);
		}
		//calcular media
		double mediaTemperaturas = sumaTemperaturas / temperaturas.size();
		System.out.printf("Temperatura media semanal %.2f%n", mediaTemperaturas);
		//calcular la temperatura máxima y mínima
		double max = temperaturas.get(0);
		double min = temperaturas.get(0);
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
		for (int i = 0; i < temperaturas.size(); i++) {
			if ( temperaturaABuscar == temperaturas.get(i)) {
				System.out.printf("La temperatura %.2f se alcanzó el día %s%n", temperaturas.get(i), diaSemana[i]);
			}
		}

		scanner.close(); //cerramos el Scanner, no lo necesitamos más
		
	}
}

