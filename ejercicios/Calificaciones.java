/*
 * Calificaciones.java
 
 */

import java.util.*;

public class Calificaciones {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Double> calificaciones = new ArrayList(); //lista vacía
		//solicitamos el nº de alumnos
		int numeroAlumnos = -1;
		do {
			System.out.println("Introduce el nº de alumnos a calificar, máximo 10");
			numeroAlumnos = scanner.nextInt();
		} while (numeroAlumnos < 1 || numeroAlumnos > 10 );
		
		//variables para la media, nº aprobados y nº sobresalientes
		double sumaCalificaciones = 0;
		int numeroAprobados = 0, numeroSobresalientes = 0;
		//solicitamos las calificaciones
		for (int i = 0; i < numeroAlumnos; i++){
			double calificacion = -1;
			//no permitimos calificaciones no válidas, en ese caso entramos en bucle
			while (calificacion < 0 || calificacion > 10) {
				System.out.println("Introduce calificación, entre 0 y 10");
				calificacion = scanner.nextDouble();
			}
			sumaCalificaciones += calificacion;
			if (calificacion >= 5)
				numeroAprobados++;
			if (calificacion >= 9)
				numeroSobresalientes++;
			//añado la califación a la listas de califaciones	
			calificaciones.add(calificacion);
		}
		System.out.println("=========CALIFICACIONES==========");
		System.out.println(calificaciones);
		System.out.println("=========ESTADÍSTICAS==========");
		System.out.printf("Media de las califaciones: %.2f%n",   sumaCalificaciones / numeroAlumnos);
		System.out.printf("Nº aprobados: %d%n", numeroAprobados );
		System.out.printf("Nº sobresalientes: %d%n", numeroSobresalientes );
		//ordenamos las calificaciones, ¡OJO!, una vez ordenada la lista, se queda ordenada, se pierde el orden inicial
		Collections.sort(calificaciones); 
		System.out.println("===CALIFICACIONES ORDENADAS=====");
		System.out.println(calificaciones);
		System.out.printf("Nota más baja %.2f%n", calificaciones.get(0));
		System.out.printf("Nota más alta %.2f%n", calificaciones.get(calificaciones.size() - 1));
		System.out.println("Introduce una calificación a buscar (0-10)");
		double calificacionABuscar = -1;
		//no permitimos calificaciones no válidas, en ese caso entramos en bucle
		while (calificacionABuscar < 0 || calificacionABuscar > 10) {
			System.out.println("Introduce la calificación a buscar, entre 0 y 10");
			calificacionABuscar = scanner.nextDouble();
		}
		int contadorCalificacionesIdenticas = 0;
		for(double nota : calificaciones){
			if (nota == calificacionABuscar)
				contadorCalificacionesIdenticas++;
		}
		System.out.printf("Nº de %.2f en las calificacines: %d%n", calificacionABuscar, contadorCalificacionesIdenticas);


	}
}

