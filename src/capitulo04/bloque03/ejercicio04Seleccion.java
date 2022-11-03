package capitulo04.bloque03;

import capitulo04.bloque04.UtilsArrays;

public class ejercicio04Seleccion {
	public static void main(String[] args) {

		int array[] = UtilsArrays.creaArrayNumerosAzar(6, 0, 1000);
		UtilsArrays.mostrarArray(array);
		int actual, mas_pequenio, temp;

		for (actual = 0; actual < array.length - 1; actual++) {

			mas_pequenio = actual;
			for (int j = actual + 1 ; j < array.length; j++) {
				if (array[j] < array[mas_pequenio]) {
					mas_pequenio = j;
				}
				temp = array[actual];
				array[actual] = array[mas_pequenio];
				array[mas_pequenio] = temp;
			}
		}
		UtilsArrays.mostrarArray(array);

	}

}
