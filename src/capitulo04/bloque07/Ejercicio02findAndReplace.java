package capitulo04.bloque07;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio02findAndReplace {
	
	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 100);
		int numeroBuscar = Utils.obtenerEnteroPorJOptionPaneEntreLimitesYDescripcion(0, 100, "Introduzca el número que quiere buscar"
				+ " en el array");
		int numeroRemplazar = Utils.obtenerEnteroPorJOptionPaneEntreLimitesYDescripcion(0, 100, "Introduzca el número con el que quiere remplazar"
				+ "el número anterior");
		UtilsArrays.mostrarArrayConDescripcion(array, "Este es el array antes de los cambios");
		UtilsArrays.mostrarArrayConDescripcion(findAndReplace(array, numeroBuscar, numeroRemplazar), "Este es el array tras los cambios");
	}

	public static int [] findAndReplace (int array[], int numeroBuscar, int numeroRemplazar) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numeroBuscar) {
				array[i] = numeroRemplazar;
			}
		}
		return array;
	}
}
