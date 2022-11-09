package capitulo04.bloque05;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio04CosasVariasMatriz5x5 {

	public static void main(String[] args) {
		int matriz[][] = new int[][] { 	{1, 2, 3, 4, 5}, 
										{6, 7, 8, 9, 10}, 
										{11,12, 13, 14, 15}, 
										{16,17, 18, 19,20}, 
										{21,22, 23, 24, 25} };
	
		int fila = Utils.obtenerEnteroPorJOptionPaneEntreLimitesYDescripcion(-1, 5, "¿Qué fila quieres eliminar?");
		
		
		matrizFilaEliminada(matriz, fila);
		
	}

	public static void inicializaMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar(0, 100);
			}
		}
	}

	public static void mostrarMatriz(int matriz[][]) {
		System.out.println("Contenido de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static boolean matrizPositiva(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean matrizDiagonal(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) {
					if (matriz[i][j] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean matrizTriangularSuperior(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					if (matriz[i][j] != 0) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static boolean matrizDispersa(int matriz[][]) {

		int contadorFilas = 0;
		int contadorColumnas = 0;
		int numeroFilas = -1;
		int j = 0;
		int i = 0;

		for (j = 0; j < matriz.length; j++) {
			for (i = 0; i < matriz[j].length; i++) {
				if (matriz[j][i] == 0) {
					contadorFilas += 1;
					break;
				}
			}
		}

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				numeroFilas += 1;
				if (matriz[i][j] == 0) {
					contadorColumnas += 1;
					break;
				}

			}
		}

		if (contadorColumnas == i && contadorFilas == numeroFilas) {
			return true;
		}
		
			return false;

	}
	
	public static void matrizToArray (int matriz[][], int longitudArray) {
		
		int array[] = new int [longitudArray];
		int numeroArray = -1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numeroArray++;
				array[numeroArray] = matriz[i][j];
			}
		}
		
		
		UtilsArrays.mostrarArray(array);
	}
	
	public static boolean matrizSimetrica (int matriz[][], int cantidadNumerosMatriz) {
		int variableAuxiliar = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					variableAuxiliar++;
				}
				else {
					return false;
				}
				
			}
		}
		if (variableAuxiliar == cantidadNumerosMatriz) {
			return true;
		}
		
		return false;
	}
	
	public static void matrizTraspuesta (int matriz[][], int filas, int columnas) {
		;
		int matriz2[][] = new int [columnas][filas];
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz2[j][i] = matriz[i][j];
			}
		}
		
		
		UtilsArrays.mostrarMatriz(matriz2);
	}
	
	public static void matrizOpuesta (int matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				 
				matriz [i][j] = matriz[i][j] * (- 1);
				
			}
		}
			
		UtilsArrays.mostrarMatriz(matriz);
	}
	
	public static void matrizFilaEliminada (int matriz[][], int filas) {
		int matriz2[][] = new int [4][5];
		int iMatriz1 = 0;
		
		for (int i = 0; i < 4; i++) {
			
			if (i != 0) {
			iMatriz1++;
			}
			if (iMatriz1 == filas) {
				iMatriz1++;
			}
			for (int j = 0; j < 5; j++) {
			
				matriz2[i][j] = matriz[iMatriz1][j];
			}
		}
		
		UtilsArrays.mostrarMatriz(matriz2);
		
	
	}
}
