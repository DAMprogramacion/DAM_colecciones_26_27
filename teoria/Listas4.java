/*
 * Listas4.java
 */

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Listas4 {
	
	public static void main (String[] args) {
		List<String> listaCadenasInmutables = List.of("hola","mundo","desde","java");
		System.out.println(listaCadenasInmutables);
		//listaCadenasInmutables.add("pepe"); es inmutable
		//Collections.sort(listaCadenasInmutables); es inmutable
		//listaCadenasInmutables.set(0, "hello"); es inumutable
		//convertir a mutable
		List<String> listaCadenasMutables = new ArrayList(listaCadenasInmutables);
		listaCadenasMutables.add("pepe");
		System.out.println(listaCadenasMutables);
		Collections.sort(listaCadenasMutables);
		System.out.println(listaCadenasMutables);
		listaCadenasMutables.set(0, "hello");
		System.out.println(listaCadenasMutables);


		
	}
}

