package capitulo04.bloque02;

//2º.- Realiza un ejercicio que inicialice  arrays de 150 elementos enteros al azar entre 0 y 100. Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer array debes copiar los elementos de índice impar del primer array; en los elementos de índice par del tercer array debes copiar los elementos de índice par del segundo array.

public class Ejercicio02TresArraysCombinacion {

	public static void main(String[] args) {

		int numarray1 = 0;
		int numarray2 = 0;
		int array1[] = new int[150];

		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) Math.round(Math.random() * 100);
		}
		int array2[] = new int[150];

		for (int i = 0; i < array2.length; i++) {

			array2[i] = (int) Math.round(Math.random() * 100);
		}

		int array3[] = new int[150];

		for (int i = 0; i < array3.length; i++) {
			
			if (i % 2 == 1) {
				array3[i] = array1[numarray1];
				numarray1++;
			} else {
				array3[i] = array2[numarray2];
				numarray2++;
			}
		}

		System.out.println("Este es el primer array.");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Este es el segundo array.");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("Este es el tercer array.");
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}
}
