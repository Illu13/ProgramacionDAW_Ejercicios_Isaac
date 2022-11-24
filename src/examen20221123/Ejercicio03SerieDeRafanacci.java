package examen20221123;

import capitulo04.bloque04.UtilsArrays;

public class Ejercicio03SerieDeRafanacci {

	public static void main(String[] args) {
		float array[] = new float[10];
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[i] = 1;
			}
			if (i == 1) {
				array[i] = (array[i - 1] * 0) + (array[i - 1]/2);
			}
			if (i != 0 && i != 1) {
				array[i] = (array[i - 1] * array[i - 2]) + (array[i - 1]/2);
			}
			}
		
		UtilsArrays.mostrarArrayFloat(array);
		}

	}

