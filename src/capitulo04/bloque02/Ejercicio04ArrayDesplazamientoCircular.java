package capitulo04.bloque02;

//4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.


public class Ejercicio04ArrayDesplazamientoCircular {

	public static void main(String[] args) {
		
		int array1[] = new int[5];

		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array1.length; i++) {
		
		}
	}
}
