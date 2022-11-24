package examen20221123;

import capitulo04.bloque04.UtilsArrays;

public class Ejercicio04Mayusculas {
	
	public static void main(String[] args) {
		
		 char[] array = new char [] {'H','O','L','A',' ','M','U','N','D','O'};
		
		System.out.println(minusculas(array));
	}
	
	public static String minusculas (char array[]) {
		
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			if ((int)array[i] > 64 && (int)array[i] < 90) {
				array[i] = (char) ((int)array[i] + 32);
				str += array[i];
			}
			else {
				str += array[i];
			}
		}
		
		
		return str;
	}
}
