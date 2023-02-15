package examen20230209;

import capitulo04.bloque04.Utils;

public class Ejercicio04RGBHexadecimal {

	public static void main(String[] args) {

		int numeroAConvertir = 0;
		int numeroAConvertir2 = 0;
		int numeroAConvertir3 = 0;
		boolean noEsTexto = true;

		do {
			try {

				numeroAConvertir = Utils
						.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la cantidad de rojo del 0 al 255");
			} catch (NumberFormatException e) {
				System.out.println("Ha introducido algo que no es un número, vuelva a intentarlo");
				noEsTexto = false;
			}

		} while (!(numeroCorrecto(numeroAConvertir) == true && noEsTexto == false));

		do {
			try {
				numeroAConvertir2 = Utils
						.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la cantidad de azul del 0 al 255");
			} catch (NumberFormatException e) {
				System.out.println("Ha introducido algo que no es un número, vuelva a intentarlo");
				noEsTexto = false;
			}

		} while (!(numeroCorrecto(numeroAConvertir2) == true && noEsTexto == false));

		do {
			try {
				numeroAConvertir3 = Utils
						.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la cantidad de verde del 0 al 255");
			} catch (NumberFormatException e) {
				System.out.println("Ha introducido algo que no es un número, vuelva a intentarlo");
				noEsTexto = false;
			}

		} while (!(numeroCorrecto(numeroAConvertir3) == true && noEsTexto == false));

		String rojo = Integer.toHexString(numeroAConvertir);
		String azul = Integer.toHexString(numeroAConvertir2);
		String verde = Integer.toHexString(numeroAConvertir3);

		System.out.println(rojo + verde + azul);

	}

	public static boolean numeroCorrecto(int numero) {

		if (numero > 0 && numero < 255) {
			return true;
		}
		return false;
	}

}
