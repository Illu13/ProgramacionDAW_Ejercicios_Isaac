package capitulo04.bloque03;

import capitulo04.bloque04.UtilsArrays;

public class ejercicio02InserccionDirecta {

	public static void main(String[] args) {
		int array1[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		int aux = 0;
		UtilsArrays.mostrarArray(array1);

		for (int i = 1; i < array1.length; i++) {
			aux = array1[i];
			for (int j = i-1; j > -1; j--) {
				if (array1[j] > aux) {
					array1[j + 1] = array1[j];
					array1[j] = aux;
					
				}

			}
		}
		UtilsArrays.mostrarArray(array1);
	}

}
