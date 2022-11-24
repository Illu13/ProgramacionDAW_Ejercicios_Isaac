package examen20221123;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio02NumerosArraysAleatorios {

	public static void main(String[] args) {
		int[] array = UtilsArrays.creaArrayNumerosAzar(5, 0, 100);
		int[] arrayAleatorio = new int[5];
		UtilsArrays.mostrarArray(array);

		for (int i = 0; i < arrayAleatorio.length; i++) {

			int numeroPosicionArray = Utils.obtenerNumeroAzar(0, 4);
			if (i == 0) {
				arrayAleatorio[i] = array[numeroPosicionArray];
				array[numeroPosicionArray] = -1;
			}
			else {
				if (array[numeroPosicionArray] == -1) {
					i--;
				}
				else {
					arrayAleatorio[i] = array[numeroPosicionArray];
					array[numeroPosicionArray] = -1;
				}
			}
			  
			
		}
		
		UtilsArrays.mostrarArray(arrayAleatorio);

	}

}
