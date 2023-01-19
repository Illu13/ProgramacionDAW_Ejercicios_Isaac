package capitulo06.bloque02;

import capitulo04.bloque04.Utils;


import java.util.HashMap;
import java.util.Iterator;


public class EjercicioHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Articulo> articulos = new HashMap<Integer, Articulo>();
		
		
		do {

			int opcion = Utils.obtenerEnteroPorJOptionPaneConDescripcion(
					"1.-Salir" + "\n2.-Lista de artículos" + "\n3.-Crear nuevo articulo"
							+ "\n4.-Eliminar un articulo"
							+ "\n5.-Actualizar un articulo" + 
							 "\nIntroduzca una opción.");
			
			switch (opcion) {
			case 1:
				System.exit(0);
				break;
				
			case 2:
				Iterator<Articulo> articulos1 = articulos.values().iterator();
				while (articulos1.hasNext()) {
					System.out.println("Artículo obtenido: " + articulos1.next());
				}
				break;
			case 3:
				
				int codigoBarras = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el código de barras");
				
				articulos.put(codigoBarras,new Articulo (codigoBarras, 
						Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el stock")
								,Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el estante")));
				break;
				
			case 4:
				int articuloEliminar = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el código de barras");
				
				articulos.remove(articuloEliminar);
				break;
			case 5:
				
				int codigoBarrasEditar = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el código de barras");
				
				articulos.put(codigoBarrasEditar,new Articulo (codigoBarrasEditar, 
						Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el stock")
								,Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el estante")));
				break;
			} 
			
		} while (true);


	}

}
