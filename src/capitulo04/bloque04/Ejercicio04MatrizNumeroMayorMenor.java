package capitulo04.bloque04;

// Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo. Los números dentro de la matriz no pueden repetirse.

public class Ejercicio04MatrizNumeroMayorMenor {

	public static void main(String[] args) {

		int mayor = 0;
		int menor = 0;
		int i = 0;
		int j = 0;
		int matriz[][] = new int[6][12];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				for (; j < matriz[i].length; j++) {
					matriz[i][j] = Utils.obtenerNumeroAzar(0, 10);
					estaRepetido(matriz, i, j);
				}
			}
		}

		UtilsArrays.mostrarMatriz(matriz);

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (j == 0 && i == 0) {
					mayor = matriz[i][j];
					menor = matriz[i][j];
				} else {
					if (matriz[i][j] > mayor) {
						mayor = matriz[i][j];
					}
					if (matriz[i][j] < menor) {
						menor = matriz[i][j];
					}
				}

			}
		}

		System.out.println("El número mayor es: " + mayor + " y el número menor es: " + menor);

	}

	public static void estaRepetido(int matriz[][], int i, int j) {

		for (int k = i; k >= 0; k--) {
			if (i == k) {
				for (int l = j - 1; l > -1; l--) {
					if (matriz[i][j] == matriz[k][l]) {
						do
						matriz[i][j] = Utils.obtenerNumeroAzar(0, 100);
						while (matriz[i][j] == matriz[k][l]);
					}
				}

			} else {

				for (int l = 11; l > -1; l--) {
					if (matriz[i][j] == matriz[k][l]) {
						matriz[i][j] = Utils.obtenerNumeroAzar(0, 100);
					}
				}

			}
		}

	}

}
