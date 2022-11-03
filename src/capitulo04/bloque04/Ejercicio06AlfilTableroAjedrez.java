package capitulo04.bloque04;

//6.- Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

public class Ejercicio06AlfilTableroAjedrez {

	public static void main(String[] args) {

		int matriz[][] = new int[8][8];

		int posicionXAlfil;
		int posicionYAlfil;

		do {
			posicionYAlfil = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Posición Y alfil:");
			posicionXAlfil = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Posición X alfil");
		} while (posicionXAlfil >= 8 && posicionYAlfil >= 8);

		int posicionYAlfil2 = posicionYAlfil;
		int posicionXAlfil2 = posicionXAlfil;
		int posicionXAlfilInicial = posicionXAlfil;
		int posicionYAlfilInicial = posicionYAlfil;

		for (int i = 0; i < posicionYAlfilInicial; i++) {
			posicionYAlfil2 = posicionYAlfil - 1;
			posicionYAlfil = posicionYAlfil2;
			posicionXAlfil2 = posicionXAlfil - 1;
			posicionXAlfil = posicionXAlfil2;
			System.out.println("El alfil se podría ir a la posición " + posicionXAlfil2 + "," + posicionYAlfil2);
		}
		posicionYAlfil = posicionYAlfilInicial;
		posicionXAlfil = posicionXAlfilInicial;

		for (int i = 0; i <= 7 - (posicionXAlfilInicial + 1); i++) {
			posicionYAlfil2 = posicionYAlfil + 1;
			posicionYAlfil = posicionYAlfil2;
			posicionXAlfil2 = posicionXAlfil + 1;
			posicionXAlfil = posicionXAlfil2;
			System.out.println("El alfil se podría ir a la posición " + posicionXAlfil2 + "," + posicionYAlfil2);
		}
		posicionYAlfil = posicionYAlfilInicial;
		posicionXAlfil = posicionXAlfilInicial;
		for (int i = 0; i > -1; i++) {
			posicionYAlfil2 = posicionYAlfil - 1;
			posicionYAlfil = posicionYAlfil2;
			posicionXAlfil2 = posicionXAlfil + 1;
			posicionXAlfil = posicionXAlfil2;
			System.out.println("El alfil se podría ir a la posición " + posicionXAlfil2 + "," + posicionYAlfil2);
			if (posicionXAlfil == 8 || posicionYAlfil == 0) {
				break;
			}
		}

		posicionYAlfil = posicionYAlfilInicial;
		posicionXAlfil = posicionXAlfilInicial;
		for (int i = 0; i > -1; i++) {
			posicionYAlfil2 = posicionYAlfil + 1;
			posicionYAlfil = posicionYAlfil2;
			posicionXAlfil2 = posicionXAlfil - 1;
			posicionXAlfil = posicionXAlfil2;
			System.out.println("El alfil se podría ir a la posición " + posicionXAlfil2 + "," + posicionYAlfil2);
			if (posicionXAlfil == 0 || posicionYAlfil == 8) {
				break;
			}
		}
	}

}
