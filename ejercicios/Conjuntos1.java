/*
 * Conjuntos1.java
 */

import java.util.*;
public class Conjuntos1 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<String> lNombres = new ArrayList(); //lista vácia, para introducir String nada mas
		Set<String>  sNombres = new HashSet(); //conjunto vacío, para introdicir String SIN repetición
		String nombre = null;
		do {
			System.out.println("Introduce el nombre de persona:");
			nombre = scanner.nextLine().toLowerCase();
			lNombres.add(nombre);
			sNombres.add(nombre);
		} while (!nombre.equalsIgnoreCase("fin"));
		scanner.close();
		lNombres.remove("fin");
		sNombres.remove("fin");
		System.out.println(lNombres);
		System.out.println(sNombres);

	}
}

