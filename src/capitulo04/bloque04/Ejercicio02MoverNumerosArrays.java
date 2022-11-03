package capitulo04.bloque04;

//Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá desplazar todos los elementos del array a la derecha una posición, pero dejando intacto el intervalo interior. Al final se debe mostrar el array resultante.

public class Ejercicio02MoverNumerosArrays {

	public static void main(String[] args) {
		int array[] = new int[10];
		int posicionInicio;
		int posicionFinal;
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca un número");
		}

		UtilsArrays.mostrarArray(array);

		do {
			posicionInicio = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca posición inicial");
			posicionFinal = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca posición final");
		} while (posicionInicio > posicionFinal);

		int variableultima = array[posicionFinal - 1];
		int espacio = posicionFinal - posicionInicio;

		for (int j = espacio; j >= posicionInicio; j--) {
			if (j != posicionInicio) {
				array[j] = array[j - 1];
			} else {
				array[posicionInicio] = variableultima;
			}

		}

		UtilsArrays.mostrarArray(array);

	}

}
