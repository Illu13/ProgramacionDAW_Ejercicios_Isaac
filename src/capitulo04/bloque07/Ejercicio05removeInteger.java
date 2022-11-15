package capitulo04.bloque07;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio05removeInteger {

	public static void main(String[] args) {
		
		int array[] = UtilsArrays.creaArrayNumerosAzar(100, 0, 100);
		int numeroABuscarYRemplazar = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Qué número quieres buscar");
		UtilsArrays.mostrarArray(array);
		UtilsArrays.mostrarArray(removeInteger(array, numeroABuscarYRemplazar));
	}
	
	public static int[] removeInteger (int [] array, int numeroABuscarYRemplazar) {
		
		
		Ejercicio04CountOcurrences.countOcurrences(array, numeroABuscarYRemplazar);
		int array2[] = new int [array.length - Ejercicio04CountOcurrences.countOcurrences(array, numeroABuscarYRemplazar)];
		
		int i = 0;
		int j = i;
		
		for (; i < array2.length; i++) {
			if (array[j] == numeroABuscarYRemplazar) {
				array2[i] = array[j + 1];
				j++;
			}
			else {
				array2[i] = array[j];
			}
			j++;
		}
		
		
		return array2;
		
		
	}

}
