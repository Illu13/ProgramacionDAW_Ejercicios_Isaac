package capitulo04.bloque04;



//6.- Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

public class Ejercicio06AlfilTableroAjedrez {

	public static void main(String[] args) {

		int posicionxAlfil, posicionyAlfil;
		int tablero[][] = UtilsArrays.creaEInicializaMatriz(8, 8, 0);

		do {
			posicionxAlfil = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Posición Y alfil:");
			posicionyAlfil = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Posición X alfil");
		} while (posicionxAlfil >= 8 && posicionyAlfil >= 8);

		System.out.println("Posibles posiciones");
		UtilsArrays.mostrarMatriz(tablero);

		
		tablero[posicionyAlfil][posicionxAlfil] = 2;

		
		for (int i = posicionyAlfil - 1, j = posicionxAlfil - 1; i > -1 && j > -1; i--, j--) {
			tablero[i][j] = 1;
		}

		
		for (int i = posicionyAlfil + 1, j = posicionxAlfil + 1; i < tablero.length && j < tablero[i].length; i++, j++) {
			tablero[i][j] = 1;
		}

		
		for (int i = posicionyAlfil - 1, j = posicionxAlfil + 1; i > -1 && j < tablero[i].length; i--, j++) {
			tablero[i][j] = 1;
		}

		
		for (int i = posicionyAlfil + 1, j = posicionxAlfil - 1; i < tablero.length && j > -1; i++, j--) {
			tablero[i][j] = 1;
		}

		UtilsArrays.mostrarMatriz(tablero);
	}

}
