package capitulo04.bloque02;

//4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.

public class Ejercicio04ArrayDesplazamientoCircular {

	public static void main(String[] args) {

		int array1[] = new int[5];

		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array1[i] + " ");
		}
		int variableultima = array1[4];

		for (int i = array1.length - 1; i >= 0; i--) {
			if (i != 0) {
				array1[i] = array1[i - 1];
			} else {
				array1[0] = variableultima;
			}

		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}
