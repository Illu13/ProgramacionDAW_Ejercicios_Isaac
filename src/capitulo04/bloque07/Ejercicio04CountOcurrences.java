package capitulo04.bloque07;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio04CountOcurrences {

	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(50, 0, 100);
		int numeroABuscar = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Qué número quieres buscar");
		UtilsArrays.mostrarArray(array);
		System.out.println(countOcurrences(array, numeroABuscar));
	}
	
	/**
	 * 
	 * @param array
	 * @param numeroABuscar
	 * @return
	 */
	public static int countOcurrences (int[] array, int numeroABuscar) {
	
		int contadorNumeros = 0;	
		for (int i = 0; i < array.length; i++) {
			if (numeroABuscar == array[i]) {
				contadorNumeros++;
			}
		}
		return contadorNumeros;
	}
}
