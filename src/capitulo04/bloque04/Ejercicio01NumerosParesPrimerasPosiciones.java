package capitulo04.bloque04;

//1.- Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.

public class Ejercicio01NumerosParesPrimerasPosiciones {
	public static void main(String[] args) {

		int[] array = new int[20];
		int[] array1 = UtilsArrays.creaArrayNumerosAzar(20, 0, 100);
		int posicionArray = 0;
		int posicionArrayInversa = 19;

		for (int i = 0; i < array.length; i++) {
			if (array1[i] % 2 == 0) {
				array[posicionArray] = array1[i];
				posicionArray++;
			} 
			else {
				array[posicionArrayInversa] = array1[i];
				posicionArrayInversa--;
			}

		}

		UtilsArrays.mostrarArray(array);
	}

}
