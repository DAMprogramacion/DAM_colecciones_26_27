/*
 * Lista1.java
 * 
 */

import java.util.List;
import java.util.ArrayList;

public class Lista1 {
	
	public static void main (String[] args) {
		//defino un array de String de tamaño 3
		String[] arrayCadenas = new String[3];
		//defino una lista de String (no hace falta indicar el tamaño)
		List<String> listaCadenas = new ArrayList();
		//añadir tres valores a arrayCadenas
		arrayCadenas[0] = "hola";
		arrayCadenas[1] = "hello";
		arrayCadenas[2] = "hi";
		//añadir tres valores a listaCadenas
		listaCadenas.add("HOLA");
		listaCadenas.add("HELLO");
		listaCadenas.add("HI");
		//añadir un elemento adicional al array
		//arrayCadenas[3] = "bye"; no se puede hacer, el tamaño es fijo, no puedo pasar de 3
		//añadir un elemento adicional a la lista
		listaCadenas.add("BYE");
		//mostrar en consola la referencia del array usando sout
		System.out.println(arrayCadenas);
		//mostrar en consola la referencia de la lista usando sout
		System.out.println(listaCadenas);
		//Accedemos al primer elemento, el elemnto 0
		//array
		System.out.printf("Elemento 0 del array: %s%n", arrayCadenas[0]);
		//lista
		System.out.printf("Elemento 0 de la lista: %s%n", listaCadenas.get(0));
		//Acceder a una posición que no existe
		//array
		//System.out.printf("Elemento 10 del array: %s%n", arrayCadenas[10]); no funciona
		//lista
		//System.out.printf("Elemento 10 de la lista: %s%n", listaCadenas.get(10)); no funciona
		//conocer el tamaño del array
		System.out.printf("Tamaño del array: %d%n", arrayCadenas.length);
		//conocer el tamaño de la lista
		System.out.printf("Tamaño de la lista: %d%n", listaCadenas.size());
		//conocer si existe un elemento en la lista:
		String elemento = "his";
		boolean existe = false;
		for (String cadena : arrayCadenas) {
			if (cadena == elemento) {
				existe = true;
				break;
			} 
		}
		String mensaje = existe ? "Existe en el array" : "No existe en el array";
		System.out.printf("¿Existe? %s: %s%n", elemento, mensaje);
		//ahora en la lista
		System.out.printf("¿Existe %s en la lista?: %b%n", elemento, listaCadenas.contains(elemento));
		elemento = "BYE";
		System.out.printf("¿Existe %s en la lista?: %b%n", elemento, listaCadenas.contains(elemento));

		



	}
}

