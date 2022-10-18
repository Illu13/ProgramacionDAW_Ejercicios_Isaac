package capitulo04.bloque02;

//1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100. Debes conseguir que todos los números pares del array cambien de signo, los positivos deben pasar a negativos y viceversa.

public class Ejercicio01EjercicioCambiarSignosArray {
	public static void main(String[] args) {

		int array1[] = new int[150];

		for (int i = 0; i < array1.length; i++) {

			array1[i] = ((int) Math.round(Math.random() * (100 - (-100)))) - 100;
		}

		System.out.println("Este es el primer array.");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Este es el segundo array.");

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 0) {
				array1[i] = array1[i] * -1;
			}
			System.out.println(array1[i]);
		}
	}
}
