package capitulo04.bloque03;

import java.lang.reflect.Array;

import capitulo04.bloque04.UtilsArrays;

public class ejercicio01Burbuja {

	public static void main(String[] args) {
		int[] array1 = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		UtilsArrays.mostrarArray(array1);


		for (int i = 0; i <= array1.length - 2; i++) {
			for (int j = 0; j <= array1.length - 2; j++) {
				int aux = 0;
				if (array1[j] > array1[j + 1]) {
					aux = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = aux;
				}

			}
		}
		UtilsArrays.mostrarArray(array1);
	}

}
