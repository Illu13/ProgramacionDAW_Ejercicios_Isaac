package capitulo04.bloque07;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio03AddInteger {
	
	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 100);
		
		UtilsArrays.mostrarArray(array);
		
		int numeroAAñadir = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el número a añadir en el array"); 
		
		UtilsArrays.mostrarArray(addInteger(array, numeroAAñadir));
	}
	
	/**
	 * 
	 * @param array
	 * @param numeroAAñadir
	 * @return
	 */
	public static int[] addInteger (int[] array, int numeroAAñadir) {
		
		int[] array2 = new int [array.length + 1];
		
		for (int i = 0; i < array2.length; i++) { 
			if (i != array.length) {
				array2[i] = array[i];
			}
			else {
				array2[i] = numeroAAñadir;
			}
		}
		
		return array2;
		
	}

}
