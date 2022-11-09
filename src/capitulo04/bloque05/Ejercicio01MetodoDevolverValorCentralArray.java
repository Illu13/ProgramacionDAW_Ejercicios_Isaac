package capitulo04.bloque05;

//1º.- Crea un programa que reciba un array de números enteros creados al azar entre 0 y 100. Se debe examinar la longitud del array, comprobar que la longitud es un valor impar y devolver el valor que se encuentre en la posición media. En caso de que la longitud del array sea un número par se debe devolver un valor -1.


public class Ejercicio01MetodoDevolverValorCentralArray {

	public static void main(String[] args) {
		
		int array[] = new int [] {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(valorCentralArray(array));
		

	}
	
	
	public static int valorCentralArray(int[] array) {
		
		if (array.length % 2 == 0) {
			return -1;
		}
		else {
			return array[array.length / 2];
		}
		
		
	}

}
