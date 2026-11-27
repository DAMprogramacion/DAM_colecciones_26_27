/*
 * ProductosMap.java
 */

import java.util.*;
public class ProductosMap {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String,Double> productos = new HashMap();
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
				case 1 -> addProducto(scanner, productos);
				case 2 -> System.out.println(productos);
				case 3 -> buscarProducto(scanner, productos);
				case 4 -> modificarPrecioProducto(scanner, productos);
				case 5 -> eliminarProducto(scanner, productos);
				case 6 -> System.out.println("Opción 8");
				case 7 -> System.out.println("Opción 7");
				case 8 -> scanner.close();
				default -> System.out.println("Opción incorrecta");
			}
		} while (opcion != 8);
	
	}
	
	public static void eliminarProducto(Scanner scanner, Map<String,Double> productos) {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a eliminar");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		Double precioProducto = productos.remove(nombreProducto); //recibe un null si no existe la clave
		if (precioProducto != null)
			System.out.println("Eliminado producto");
		else
			System.out.println("No existe el producto");
	}
	public static void modificarPrecioProducto(Scanner scanner, Map<String,Double> productos) {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a modificar precio");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		System.out.println("Introduce el nuevo precio del producto");
		double nuevoPrecioProducto =  scanner.nextDouble();  //puede recibir el null, si no existe la clave
		Double precioProducto = productos.replace(nombreProducto, nuevoPrecioProducto); //recibe un null si no existe la clave
		String mensaje =  (precioProducto != null) ? "Modificado precio" : "No existe el producto";
		System.out.println(mensaje);
	}
	
	public static void buscarProducto(Scanner scanner, Map<String,Double> productos) {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a buscar");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		Double precioProducto = productos.get(nombreProducto); //recibe un null si no existe la clave
		if (precioProducto != null)
			System.out.printf("Si existe el producto y su precio es %.2f%n", precioProducto);
		else
			System.out.println("No existe el producto");
	}
	
	public static void addProducto(Scanner scanner, Map<String,Double> productos) {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a añadir");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		System.out.println("Introduce el precio del producto");
		double precioProducto =  scanner.nextDouble();
		productos.put(nombreProducto, precioProducto);
		
	}
}

