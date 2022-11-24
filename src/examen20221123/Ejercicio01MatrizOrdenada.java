package examen20221123;

import capitulo04.bloque04.Utils;

public class Ejercicio01MatrizOrdenada {

	public static void main(String[] args) {

		int matriz[][] = new int[][] { { 1, 2, 3, 4, }, { 5, 6, 7, 8, }, { 9, 10, 11, 12, }, { 13, 14, 15, 16, } };

		if (estaMatrizOrdenada(matriz) == true) {
			System.out.println("La matriz está ordenada.");
		}
		else {
			System.out.println("La matriz no está ordenada.");
		}
	}

	public static boolean estaMatrizOrdenada(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 1; j < matriz[i].length; j++) {
				if (i == 0 && j == matriz[i].length) {
					if (matriz[i][j] != matriz[i][0] + 1) {
						return false;
					}
				}
				if (i != 0 && j == matriz[i].length) {
					if (matriz[i][j] != matriz[i - 1][matriz[i].length] + 1) {
						return false;
					}
				}
				if (matriz[i][j] != matriz[i][j - 1] + 1) {
					return false;
				}

			}

		}

		return true;
	}

}
