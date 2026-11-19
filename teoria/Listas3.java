/*
 * Listas3.java
 */

import java.util.*;
public class Listas3 {
	
	public static void main (String[] args) {
		Random random = new Random();
		List<Integer> enterosRandom = new ArrayList();
		for (int i = 0; i < 1_000; i++) 
			enterosRandom.add(random.nextInt(1,10_000));
		System.out.println(enterosRandom);
		int maximo = Collections.max(enterosRandom);
		int minimo = Collections.min(enterosRandom);
		System.out.println("=============================================");
		System.out.printf("El valor máximo es %d y el mínimo es %d%n", maximo, minimo);

	}
}

