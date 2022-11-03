package capitulo04.bloque04;

//7.- Programa el juego de las tres en raya.

public class Ejercicio07TresEnRaya {

	public static void main(String[] args) {

		int matriz[][] = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		int turno = 1;
		
		UtilsArrays.mostrarMatriz(matriz);
		
		do {
		int posicionX = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la posición X");
		int posicionY = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la posición Y");
		
		if (matriz[posicionY][posicionX] == 0) {
		           matriz[posicionY][posicionX] = turno;
		}
		else {
			matriz[posicionY][posicionX] = matriz[posicionY][posicionX];
			System.out.println("El otro jugador ya ha colocado un número en esa posición.");
			turno = turno - 1;
		}
		UtilsArrays.mostrarMatriz(matriz);
		if (turno == 1) {
			turno++;
		}
		else {
			turno = 1;
		}
		} while (estaTerminado(matriz) == 0);
		
		if (estaTerminado(matriz) == 1) {
			System.out.println("¡Gana el Jugador 1!");
		}
		else {
			System.out.println("¡Gana el Jugador 2!");
		}
		
	}

	public static int estaTerminado(int matriz[][]) {

		if (matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2] && matriz[0][0] != 0) {
			return matriz[0][0];
		}
		
		if (matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && matriz[1][0] != 0) {
			return matriz[1][0];
		}
		if (matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && matriz[2][0] != 0) {
			return matriz[2][0];
		}
		if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
			return matriz[0][0];
		}
		if (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2] && matriz[2][0] != 0) {
			return matriz[2][0];
		}
		if (matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0] && matriz[0][0] != 0) {
			return matriz[0][0];
		}
		if (matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && matriz[1][0] != 0) {
			return matriz[1][0];
		}
		if (matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && matriz[2][0] != 0) {
			return matriz[2][0];
		}
		return 0;

	}
}