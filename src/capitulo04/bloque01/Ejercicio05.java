package capitulo04.bloque01;

//5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes obtener la suma de los números pares y los impares en variables separadas.


public class Ejercicio05 {

	public static void main(String[] args) {
		
		int array1 [] = new int [150];
		int sumI = 0;
		int sumP = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			array1 [i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array1.length; i++) {
			if (i % 2 == 0) {
				sumP = sumP + array1[i];
			}
			else {
				sumI = sumI + array1[i];
			}
		}
		System.out.println("La suma de los números en posiciones pares es: " + sumP +
				" y la de los números en posiciones impares es: " + sumI);
		
	}

}
