package capitulo04.bloque06;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio05Ejercicio04Con0Y1Aleatorios {
	
	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		
		matrizAsteriscos(matriz);
	}

	public static void matrizAsteriscos(char matriz[][]) {

		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = '*';
				}
				else {
					if (j == 0 || j == 9) {
						matriz[i][j] = '*';
					}
					
					else {
						if (Math.random() > 0.5) {
							matriz[i][j] = '1';
						}
						else {
							matriz[i][j] = '0';
						}
					}
				}
				
			}
		}
		
		UtilsArrays.mostrarMatrizChar(matriz);

	}

}


