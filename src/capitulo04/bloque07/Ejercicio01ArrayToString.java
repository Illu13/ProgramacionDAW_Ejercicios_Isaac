package capitulo04.bloque07;

import capitulo04.bloque04.Utils;

public class Ejercicio01ArrayToString {

	public static void main(String[] args) {
		int array[] = new int[300];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(65, 90);
		}
		System.out.println(arrayToString(array));
	}

	public static String arrayToString(int array[]) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += (char) array[i];
		}
		return str;
	}
}
