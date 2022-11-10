package capitulo04.bloque06;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio02ArrayAsteeriscos {
	
//2.- Realiza un programa que dibuje en la pantalla una onda aleatoria de asteriscos. Para resolver este problema utilizarás matrices de tipo char. En un tipo char guardas un carácter. Por ejemplo, la línea "char variable = 'p';" crea una variable de tipo char y le asigna la letra 'p' minúscula. Crea una matriz de 10 filas y 30 posiciones por fila, de tipo char, a continuación genera en cada fila un número aleatorio de asteriscos, cuando acabes en cada fila de introducir asteriscos, rellena el resto de la fila con espacios en blanco. Finalmente muestra la matriz en consola. Ejemplo:

	
	public static void main(String[] args) {
		
		char [][] matriz = new char[10][30];
		
		matrizAsteriscosAleatorios(matriz);
		
	}
	
	public static void matrizAsteriscosAleatorios (char matriz[][]) {
		
		
		for (int i = 0; i < matriz.length; i++) {
			int numeroLimite = Utils.obtenerNumeroAzar(0, 29);
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < numeroLimite ) {
					matriz[i][j] = '*';
				}
				else {
					matriz[i][j] = ' ';
				}
				
			}
		}
		
		UtilsArrays.mostrarMatrizChar(matriz);
		
	}

}
