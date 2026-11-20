/*
 * Productos.java
 */

import java.util.*;
public class Productos {
	static Scanner scanner = new Scanner(System.in);
	static List<String> nombreProductos = new ArrayList();
	static List<Double> precioProductos = new ArrayList();

	public static void main (String[] args) {
		
		String menu = """
			\n
			1. Registrar un producto indicando su nombre y precio.
			2. Mostrar todos los productos registrados junto con sus precios.
			3. Buscar un producto por su nombre y mostrar su precio.
			4. Modificar el precio de un producto.
			5. Eliminar un producto.
			6. Mostrar el producto más caro y el más barato.
			7. Calcular el precio medio de todos los productos.
			8. Salir.
		""";
		int opcion = -1;
		do {
			System.out.println(menu);
			System.out.println("\nIntroduce una opción");
			opcion = scanner.nextInt();
			switch (opcion) {
				case 1 -> addProducto();
				case 2 ->  {
								for (int i = 0; i < nombreProductos.size(); i++)
									System.out.printf("%-12S  %-5.2f%n", nombreProductos.get(i), precioProductos.get(i));
							}
				case 8 -> scanner.close();
				default -> System.out.println("Opción incorrecta");
			}
		} while (opcion != 8);
	}
	public static void addProducto() {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto");
		String nombreProducto =  scanner.nextLine();
		if (! nombreProductos.contains(nombreProducto)) {
			nombreProductos.add(nombreProducto);
			System.out.println("Introduce el precio del producto");
			double precioProducto =  scanner.nextDouble();
			precioProductos.add(precioProducto);
			System.out.printf("Guardado el producto %s%n", nombreProducto);
		} else 
			System.out.println("Ya existe el producto");
	}
}

