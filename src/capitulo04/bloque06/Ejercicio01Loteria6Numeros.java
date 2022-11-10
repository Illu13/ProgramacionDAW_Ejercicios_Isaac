package capitulo04.bloque06;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio01Loteria6Numeros {
	
//	1.- Realiza un programa que genere una apuesta aleatoria de la lotería primitiva. Consiste en generar seis números y otro complementario entre 1 y 49 que no se repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza un array, en el ejemplo expuesto sería un array de 7 posiciones correspondiendo la séptima posición al "complementario" de la loteria.


	public static void main(String[] args) {
		
		int array[] = new int [6];
		
		loteria6Numeros(array);
		
		
	}
	
	
	public static void loteria6Numeros(int[] array) {
		int numArray;
		
		for (int i = 0; i < array.length; i++) {
			if (i != 5) {
				array[i] = Utils.obtenerNumeroAzar();
			}
			else {
				do {
				numArray = Utils.obtenerNumeroAzar(0, 49);
				array [i] = numArray;
				}
				while (valorEstaEnArray(numArray, array) == true);
			}
		}
		
		UtilsArrays.mostrarArrayConDescripcion(array, "Estos son los números de la lotería");
	}
	
	public static boolean valorEstaEnArray (int numArray, int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			if (numArray == array[i]) {
				return false;
			}
		}
		
		return true;
		
	}
	

}
