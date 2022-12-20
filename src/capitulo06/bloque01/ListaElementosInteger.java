package capitulo06.bloque01;

import java.util.ArrayList;
import java.util.List;

import capitulo04.bloque04.Utils;

public class ListaElementosInteger {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> numerosNuevos = new ArrayList<Integer>();

		int longitud = 0;
		int valorMin = 0;
		int valorMax = 0;
		float suma = 0;
		float media = 0;
		int mayor = 0;
		int menor = 0;
		int longitudLista = 0;
		int posicion = 0;

		do {

			int opcion = Utils.obtenerEnteroPorJOptionPaneConDescripcion(
					"1.-Salir" + "\n2.-Crear aleatoreamente valores" + "\n3.-Calcular suma, media, mayor y menor."
							+ "\n4.-Agregar una cantidad de nuevos valores"
							+ "\n5.-Eliminar elementos cuyo valor esté en un intervalo\"" + "\n6.-Imprimir la lista"
							+ "\nIntroduzca una opción.");

			switch (opcion) {
			case 1:
				System.exit(0);
				break;
			case 2:
				numeros.clear();
				longitud = Utils
						.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuántos números quieres que tenga la lista?");
				longitudLista = longitud;
				valorMin = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuál quieres que sea el valor mínimo?");
				valorMax = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuál quieres que sea el valor máximo?");
				
				for (int i = 0; i < longitud; i++) {
					numeros.add(Utils.obtenerNumeroAzar(valorMin, valorMax));
				}
				break;
			case 3:
				for (Integer i : numeros) {
					suma += i.intValue();
				}
				media = suma / longitudLista;
				menor = numeros.get(0);
				
				for (Integer i : numeros) {
					if (i.intValue() > mayor) {
						mayor = i.intValue();
					}
					if (i.intValue() < menor) {
						menor = i.intValue();
					}
				}

				System.out.println(suma);
				System.out.println(" ");
				System.out.println(media);
				System.out.println(" ");
				System.out.println(mayor);
				System.out.println(" ");
				System.out.println(menor);
				System.out.println(" ");
				
				break;
				
			case 4:
				numerosNuevos.clear();
				longitud = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿En cuántos números "
						+ "quieres aumentar la lista?");
				posicion = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿A partir de qué posición?");
				valorMin = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuál quieres que sea el valor mínimo?");
				valorMax = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuál quieres que sea el valor máximo?");
				
				for (int i = 0; i < longitud; i++) {
					numerosNuevos.add(Utils.obtenerNumeroAzar(valorMin, valorMax));
				}
				numeros.addAll(posicion, numerosNuevos);
				break;
				
			case 5:
				
				valorMin = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el número menor del intérvalo");
				valorMax = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el número mayor del intérvalo");
				
				for (int i = numeros.size() - 1; i != 0; i--) {
					if (numeros.get(i) >= valorMin && i <= valorMax) {
						numeros.remove(i);
					}
				}
				
				break;
				
			case 6:
				
				for (Integer i : numeros) {
					System.out.println(i.intValue());
				}
				
				System.out.println(" ");
				break;

			}
		} while (true);

	}

}
