/*
 *Ejercicio4Array.java
 * Por Tomás Afán Gámez
 * alumno de 1º DAM
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4Array {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] productos = new String[0];
		Double[] precios = new Double[0];
		String menu = """
		\n
		=================================================================
		1. Registrar un producto indicando su nombre y precio.
		2. Mostrar todos los productos registrados junto con sus precios.
		3. Buscar un producto por su nombre y mostrar su precio.
		4. Modificar el precio de un producto.
		5. Eliminar un producto.
		6. Mostrar el producto más caro y el más barato.
		7. Calcular el precio medio de todos los productos.
		8. Salir.
		=================================================================
		""";
		
		int opcion = -1;
		
		do {
			System.out.println(menu);
			System.out.print("\nIntroduce una opción: ");
			opcion = scanner.nextInt();
			System.out.println('\n');
			
			switch (opcion) {
				case 1: // Crear producto
					// Aumentamos el tamaño de productos
					String[] productosX = Arrays.copyOf(productos, productos.length);
					productos = Arrays.copyOf(productosX, productosX.length + 1);
					// Aumentamos el tamaño de precios
					Double[] preciosX = Arrays.copyOf(precios, precios.length);
					precios = Arrays.copyOf(preciosX, preciosX.length + 1);
					
					// Introducir nombre producto
					scanner.nextLine(); // Limpiado de salto de linea de opción
					System.out.println("Introduce el nombre del nuevo producto:");
					
					boolean success = false;
					String nuevoProducto = "";
					do {
						success = true;
						nuevoProducto = scanner.nextLine();
						for (int i = 0; i < productos.length -1; i++) {
							if (productos[i].equalsIgnoreCase(nuevoProducto)) // Le pongo ignoreCase para que no permite con mayusculas distintas
							success = false;
						}
						if (!success)
							System.out.println("Ese nombre ya esta en uso.");
					} while(!success);
					productos[productos.length - 1] = nuevoProducto;
					// Introducir precio producto
					System.out.println("Introduce el precio para este producto:");
					double nuevoPrecio = -1;
					do {
						nuevoPrecio = scanner.nextDouble();
						if (nuevoPrecio < 0)
							System.out.println("Introduce un número positivo.");
					} while(nuevoPrecio < 0);
					precios[precios.length -1] = nuevoPrecio;
					System.out.println("Producto añadido");
					break;
				case 2: // Mostrar productos
					if (productos.length == 0)
					System.out.println("No hay productos.");
					else {
						for (int i = 0; i < productos.length; i++) {
							System.out.printf("%nProducto %d:%n - Nombre: %s%n - Precio: %.2f %s%n", i + 1, productos[i], precios[i], pluralizarEuro(precios[i]));
						}
					}
					
					break;
				case 3: // Buscar producto
					String buscado = null;
					if (productos.length == 0)
						System.out.println("No hay productos.");
					else {
						success = false;
						scanner.nextLine(); // Limpiado de salto de linea de opción
						System.out.print("\nIntroduce el nombre del producto que buscas -> ");
						buscado = scanner.nextLine();
						for (int i = 0; i < productos.length; i++) {
								if (productos[i].equalsIgnoreCase(buscado)) { // Le pongo ignoreCase para que permita con mayusculas distintas
								System.out.printf("%s cuesta %.2f %s.%n", productos[i], precios[i], pluralizarEuro(precios[i]));
								success = true;
								break;
							}
						}
						if (!success)
						System.out.println("Ese producto no exíste.");
					}
					break;
				case 4: // Cambiar precio
					if (productos.length == 0)
						System.out.println("No hay productos.");
					else {
						success = false;
						scanner.nextLine(); // Limpiado de salto de linea de opción
						System.out.print("\nIntroduce el nombre del producto que quieres cambiar -> ");
						buscado = scanner.nextLine();
						for (int i = 0; i < productos.length; i++) {
								if (productos[i].equalsIgnoreCase(buscado)) { // Le pongo ignoreCase para que permita con mayusculas distintas
								System.out.print("\nIntroduce el nuevo precio -> ");
								do {
									precios[i] = scanner.nextDouble();
									if (precios[i] < 0)
									System.out.println("Introduce un número positivo.");
								} while(precios[i] < 0); //el precio debe ser mayor a cero
								
								System.out.printf("%s ahora cuesta %.2f %s.%n", productos[i], precios[i], pluralizarEuro(precios[i]));
								success = true;
								break;
								}
						}
						if (!success)
							System.out.println("Ese producto no exíste.");
					}
					break;
				case 5: // Eliminar producto
					if (productos.length == 0)
					System.out.println("No hay productos.");
					else {
						success = false;
						scanner.nextLine(); // Limpiado de salto de linea de opción
						System.out.print("\nIntroduce el nombre del producto que quieres eliminar -> ");
						buscado = scanner.nextLine();
						for (int i = 0; i < productos.length; i++) {
							if (productos[i].equalsIgnoreCase(buscado)) { // Le pongo ignoreCase para que permita con mayusculas distintas
								System.out.printf("%s ha sido eliminado.%n", productos[i]);
								for (int j = productos.length - i - 1, contador = i; j > 0; j--, contador++) { // Vamos pasando los datos que hay despues del eliminado a la izquierda para dejar un hueco libre al final que borrar
									productos[contador] = productos[contador + 1];
									precios[contador] = precios[contador + 1];
								}
								productosX = Arrays.copyOf(productos, productos.length);
								productos = Arrays.copyOf(productosX, productosX.length - 1); // Disminuimos el tamaño de productos
						
								preciosX = Arrays.copyOf(precios, precios.length);
								precios = Arrays.copyOf(preciosX, preciosX.length - 1); // Disminuimos el tamaño de precios
								success = true;
								break;
							}
						}
						if (!success)
						System.out.println("Ese producto no exíste.");
					}
					break;
				case 6: // Producto mas caro y barato
					if (productos.length == 0)
						System.out.println("No hay productos.");
					else {
						double alto = precios[0];
						double bajo = precios[0];
						int productoCaro = 0;
						int productoBarato = 0;
						for (int i = 1; i < productos.length; i++) {
							if (alto < precios[i]){
								alto = precios[i];
								productoCaro = i;
							}
							if (bajo > precios[i]) {
								bajo = precios[i];
								productoBarato = i;
							}
						}
						System.out.printf("Más caro:%n - %s%n - %.2f %s%n", productos[productoCaro], precios[productoCaro], pluralizarEuro(precios[productoCaro]));
						System.out.printf("Más barato:%n - %s%n - %.2f %s%n", productos[productoBarato], precios[productoBarato], pluralizarEuro(precios[productoBarato]));
					}
					break;
				case 7: // Media
					double acumulador = 0;
					if (productos.length == 0)
						System.out.println("No hay productos.");
					else {
						for (double precio : precios) {
							acumulador += precio;
						}
						System.out.printf("La media de los precios de todos los productos es igual a %.2f %s%n",
							acumulador / productos.length, pluralizarEuro(acumulador / productos.length));
					}
					break;
				case 8: // Salir
					System.out.println("¡Adios!");
					break;
				default:
					System.out.println("Por favor, introduce una de las opciones.");
					break;
				}
		} while (opcion != 8);
	}
	
	public static String pluralizarEuro(double precio) {
		if (precio == 1)
			return("euro");
		return("euros");
	}
}

