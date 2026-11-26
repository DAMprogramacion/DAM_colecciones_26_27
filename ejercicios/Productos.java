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
									System.out.printf("%-12S  %5.2f%n", nombreProductos.get(i), precioProductos.get(i));
							}
				case 3 -> buscarProducto();
				case 4 -> modificarPrecioProducto();
				case 5 -> eliminarProducto();
				case 6 -> { mostrarProductoMasCaro();
							mostrarProductoMasBarato();
						}
				case 7 -> mostrarPrecioMedioProductos();
				case 8 -> scanner.close();
				default -> System.out.println("Opción incorrecta");
			}
		} while (opcion != 8);
	}
	
	public static void mostrarProductoMasBarato(){
		if (nombreProductos.isEmpty()) {
			System.out.println("No hay productos");
			return;
		}
		double precioMasBarato = 1_000_000_000;
		int posicionMasBarato  = -1;
		for (int i = 0; i < precioProductos.size(); i++) {
			if (precioProductos.get(i) < precioMasBarato) {
				precioMasBarato = precioProductos.get(i);
				posicionMasBarato = i;
			}
		}
		System.out.printf("El producto mas barato es %s y su precio es %.2f%n",
					nombreProductos.get(posicionMasBarato), precioMasBarato);
		
	}
	
	public static void mostrarProductoMasCaro(){
		if (nombreProductos.isEmpty()) {
			System.out.println("No hay productos");
			return;
		}
		double precioMasCaro = 0;
		int posicionMasCaro  = -1;
		for (int i = 0; i < precioProductos.size(); i++) {
			if (precioProductos.get(i) > precioMasCaro) {
				precioMasCaro = precioProductos.get(i);
				posicionMasCaro = i;
			}
		}
		System.out.printf("El producto mas caro es %s y su precio es %.2f%n",
					nombreProductos.get(posicionMasCaro), precioMasCaro);
		
	}
	
	public static void mostrarPrecioMedioProductos() {
		double sumaPrecioProductos = 0;
		for (double precio : precioProductos)
			sumaPrecioProductos += precio;
		System.out.printf("El valor medio del precio de los productos es %.2f%n",
				sumaPrecioProductos / precioProductos.size());
	}
	
	public static void eliminarProducto() {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a eliminar");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		if ( nombreProductos.contains(nombreProducto)) { //elimino si existe el producto
			for (int i = 0; i < nombreProductos.size(); i++){
				if (nombreProducto.equals(nombreProductos.get(i))){
					nombreProductos.remove(i); //elimino el nombre del producto de la lista de nombreProductos
					precioProductos.remove(i); //elimino el precio del producto de la lista de precioProductos
					return; //abandona el método, hemos modificado el precio
				}
			}
		} 
		System.out.println("NO existe el producto");
	}
	
	public static void modificarPrecioProducto() {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a modificar precio");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		if ( nombreProductos.contains(nombreProducto)) { //modifico si existe el producto
			System.out.println("Introduce el nuevo precio del producto");
			double nuevoPrecioProducto =  scanner.nextDouble();
			for (int i = 0; i < nombreProductos.size(); i++){
				if (nombreProducto.equals(nombreProductos.get(i))){
					precioProductos.set(i,nuevoPrecioProducto); 
					return; //abandona el método, hemos modificado el precio
				}
			}
		} 
		System.out.println("NO existe el producto");
	}
	
	
	
	public static void buscarProducto() {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a buscar");
		String nombreProducto =  scanner.nextLine().toLowerCase();
		//recorremos la lista de productos, para saber si está y encontrar la posición
		for (int i = 0; i < nombreProductos.size(); i++){
			if (nombreProducto.equals(nombreProductos.get(i))){
				System.out.printf("Si existe el producto y su precio es %.2f%n", precioProductos.get(i));
				return; //abandona el método, hemos encontrado el producto, hemos mostrado el precio
			}
		}
		System.out.println("NO existe el producto");
	}
	
	public static void addProducto() {
		scanner.nextLine(); //limpiamos el salto de línea de opcion = scanner.nextInt();
		System.out.println("Introduce el nombre del producto a añadir");
		String nombreProducto =  scanner.nextLine().toLowerCase();
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

