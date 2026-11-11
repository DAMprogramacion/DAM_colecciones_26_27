/*
 * Arrays4.java
 */

import java.util.Scanner;
public class Arrays4 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		//definimos un array de cadenas vacías, tamaño 3
		String[] palabras = new String[3];
		//con scanner solicitamos palabras (no compuestas)
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Introduce una palabra");
			//cada palabra se guardará en el array
			palabras[i] = scanner.next();
		}
		//ejemplo: ["hola", "felipe", "garcía"]
		//Lo recorremos y debe salir en consola:
		//"hola felipe garcía" las comillas tienen que mostrarse
		System.out.print('"');
		for (int i = 0; i < palabras.length -1; i++) {
			System.out.printf("%s ", palabras[i]);
		}
		if (palabras.length > 0)
			System.out.print(palabras[palabras.length - 1]);
		System.out.print('"');
	}
}

