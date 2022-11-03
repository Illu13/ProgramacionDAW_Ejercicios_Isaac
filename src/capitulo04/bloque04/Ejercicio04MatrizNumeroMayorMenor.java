package capitulo04.bloque04;

// Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo. Los números dentro de la matriz no pueden repetirse.

public class Ejercicio04MatrizNumeroMayorMenor {

	public static void main(String[] args) {

		int mayor = 0;
		int menor = 0;
		int matriz[][] = new int[6][12];
		UtilsArrays.inicializaMatriz1000(matriz);
		UtilsArrays.mostrarMatriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
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

}
