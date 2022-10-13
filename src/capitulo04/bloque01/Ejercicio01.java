package capitulo04.bloque01;

//1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los números que aparecen en el array.


public class Ejercicio01 {

	public static void main(String[] args) {
		
		
	int array1 [] = new int [150];
	float suma = 0;
	float media;
	int mayor = 0;
	int menor = 0;
	
	for (int i = 0; i < array1.length; i++) {
		
		array1 [i] = (int) Math.round(Math.random() * 100);
	}
	
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i] + " ");
		}
	for (int i = 0; i < array1.length; i++) {
		suma = suma + array1[i];
	}
	media = suma / array1.length;
	
	for (int i = 0; i < array1.length; i++) {
		if (i == 0) {
			mayor = array1[0];
			menor = array1[0];
		}
		else {
			if (array1[i] > mayor) { 
				mayor = array1[i];
				}
			if (array1[i] < menor) {
				menor = array1[i];
			}
		}
	}
	System.out.print("\n" + "La suma es: " + suma + " La media es: " + media + " El mayor es: " + mayor + " El menor es: " + menor);
	
	}

}
