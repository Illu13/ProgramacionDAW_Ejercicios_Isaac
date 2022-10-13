package capitulo04.bloque01;

//3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Después de su inicialización debéis imprimir el array en orden inverso.


public class Ejercicio03 {

	public static void main(String[] args) {
		int array1 [] = new int [150];
		
		for (int i = 0; i < array1.length; i++) {
			
			array1 [i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = array1.length - 1; i != 0; i--) {
			System.out.print(array1[i] + " ");
			}

	}

}
