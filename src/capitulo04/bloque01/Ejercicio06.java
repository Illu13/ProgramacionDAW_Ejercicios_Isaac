package capitulo04.bloque01;

//6º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar al usuario la suma de los elementos cuyo índice sea par.


public class Ejercicio06 {

	public static void main(String[] args) {
	int array1 [] = new int [150];
	int suma = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			array1 [i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				suma = suma + array1[i];
			}
		}
		System.out.println("La suma de los elementos pares del array es: " + suma);
	}	
}