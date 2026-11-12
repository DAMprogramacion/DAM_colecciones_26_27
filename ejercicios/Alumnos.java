/*
 * Alumnos.java
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Alumnos{
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> alumnos = new ArrayList();
	
	public static void main (String[] args) {
		//preparamos el menú
		String menu = """ 
			1. Añadir un alumno.
			2. Mostrar todos los alumnos.
			3. Buscar un alumno por su nombre.
			4. Eliminar un alumno por su nombre.
			5. Mostrar cuántos alumnos hay registrados.
			6. Salir
			""";
			int opcion = -1;
			do {
				System.out.println(menu);
				System.out.println("Introduce opción");
				opcion = scanner.nextInt();
				switch(opcion) {
					case 1 -> addAlumno();
					case 2 -> System.out.println(alumnos + "\n");
					case 3 -> buscarAlumno();
					case 4 -> eliminarAlumno();
					case 5 -> System.out.printf("Nº alumnos: %d%n%n", alumnos.size());
					case 6 -> System.out.println("Terminando el programa");
					default -> System.out.println("Opción incorrecta");
				}
			} while (opcion != 6); //la opción 6 es para terminar	
			scanner.close(); //cierro el Scanner
	}
	
	//método para añadir alumno
	private static void addAlumno() {
		System.out.println("Introduce el nombre del alumno");
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		String nombreAlumno = scanner.nextLine();
		if (!alumnos.contains(nombreAlumno)) //añado a lista si el alumno no está en ella
			alumnos.add(nombreAlumno);
	}
	//método para buscar alumno
	private static void buscarAlumno() {
		System.out.println("Introduce el nombre del alumno");
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		String nombreAlumno = scanner.nextLine();
		if (alumnos.contains(nombreAlumno))
			System.out.println("El alumno está registrado\n");
		else
			System.out.println("El alumno NO está registrado\n");
	}
	//método para borrar alumno
	private static void eliminarAlumno() {
		System.out.println("Introduce el nombre del alumno\n");
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		String nombreAlumno = scanner.nextLine();
		if (alumnos.contains(nombreAlumno)){
			alumnos.remove(nombreAlumno);
			System.out.println("El alumno ha sido borrado");
		}
		else
			System.out.println("El alumno NO está registrado\n");
	}
}

