/*
 * Diccionario1.java
 * Recorriendo diccionarios
 */

import java.util.Map;
public class Diccionario1 {
	
	public static void main (String[] args) {
		Map<Integer, String> futbolistas = Map.of(1, "De Gea", 2, "Sergio Ramos", 6, "Pedri", 
				9, "Fernando Torres");
		System.out.println(futbolistas);
		//recordar el método get devuelve el valor dada la clave, ejemplo:
		//1 -> De Gea, 2 -> Sergio Ramos
		int dorsal_ = 9;
		System.out.printf("El jugador %s tiene el dorsal %n%n%n", futbolistas.get(dorsal_), dorsal_);
		for (int dorsal : futbolistas.keySet())
			System.out.printf("El jugador %s tiene el dorsal %d%n", futbolistas.get(dorsal), dorsal);

	}
}

