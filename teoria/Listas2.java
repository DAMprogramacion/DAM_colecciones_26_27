/*
 * Listas2.java
 
 * 
 */

import java.util.List;
import java.util.ArrayList;
public class Listas2 {
	
	public static void main (String[] args) {
		List cadenas = new ArrayList();
		cadenas.add("hola"); //se guarda como Objetc, no como String
		cadenas.add("mundo"); //se guarda como Objetc, no como String
		cadenas.add(1); //se guarda como Objetc, no como String
		cadenas.add(true); //se guarda como Objetc, no como String
		cadenas.add(2.1f); //se guarda como Objetc, no como String
		cadenas.add(2); //se guarda como Objetc, no como String

		System.out.println(cadenas);
		Object cadena0 = cadenas.get(0);
		System.out.println(cadena0);
		float elementoFloat = (float) cadenas.get(4);
		int elementoInt = (int) cadenas.get(5);
		
		System.out.println(elementoFloat + elementoInt);
		
		List<String> soloCadenas = new ArrayList();
		soloCadenas.add("hello");
		soloCadenas.add("world");
		System.out.println(soloCadenas);
		//soloCadenas.add(1); no se puede añadir, solo se puede añadir String (List<String>)
	}
}

