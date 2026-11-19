/*
 * ListasClonar.java
  */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListasClonar {
	
	public static void main (String[] args) {
		
		List<String> palabras1 = new ArrayList();
		palabras1.add("hola");
		palabras1.add("mundo");
		palabras1.add("desde");
		palabras1.add("java");
		System.out.println("MOSTRAMOS LA LISTA 1");
		System.out.println(palabras1);
		//intentamos hacer una copia de seguridad
		List<String> palabras2 = palabras1;
		System.out.println("CLONAMOS LA LISTA 1 A OTRA LISTA Y LA MOSTRAMOS");
		System.out.println(palabras2);
		//ordenamos la lista1
		Collections.sort(palabras1);
		//mostramos la lista 1, que es la ordenada
		System.out.println("MOSTRAMOS LA LISTA 1 ORDENADA");
		System.out.println(palabras1);
		//mostramos la lista 2 ???
		System.out.println("MOSTRAMOS LA LISTA 2");
		System.out.println(palabras2); //muestra lo mismo, porque palabras1 y palabras2 guardan la misma posición de memoria (línea código 21)
	}
}

