package capitulo04.bloque06;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio04MatrizBordesAsteriscos {
	
//4º.- Realizar un programa que cree una matriz de tipo char, con 20 filas y 10 columnas. Los elementos que constituyen el borde de la matriz se deben rellenar, mediant bucles, con un asterisco. En el interior de la matriz, no en los bordes, debes crear un caracter '0' en una posición aleatoria. El resto de la matriz debe tener espacios en blanco. Muestra la matriz por consola. Ejemplo:

	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		
		matrizAsteriscos(matriz);
	}

	public static void matrizAsteriscos(char matriz[][]) {

		int numeroAleatorioFila = Utils.obtenerNumeroAzar(1, 18);
		int numeroAleatorioColumna = Utils.obtenerNumeroAzar(1, 8);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = '*';
				}
				else {
					if (i == numeroAleatorioFila && j == numeroAleatorioColumna) {
						matriz[i][j] = '0';

					} 
					else {
						matriz[i][j] = ' ';
					}
					
					if (j == 0 || j == 9) {
						matriz[i][j] = '*';
					}
				}
				
			}
		}
		
		UtilsArrays.mostrarMatrizChar(matriz);

	}

}
