package examen20230209;

import capitulo04.bloque04.Utils;

public class Ejercicio03FraseConWrappers {

//	3. (2 puntos) Pide una frase al usuario. Toma la frase y divídela en palabras, teniendo en cuenta que la
//	separación entre palabras puede ser de varios espacios en blanco. Recorre todas las palabras obtenidas
//	y muestra en consola sólo aquellas que tengan al menos una mayúscula, DOS minúsculas, un dígito y un
//	carácter no alfanumérico.
//	Te recomiendo que, hasta que el programa funcione, en lugar de pedir al usuario que introduzca un String,
//	establezcas este directamente, mediante programación. Te ahorrará tiempo.

	public static void main(String[] args) {

		boolean mayuscula = false;
		boolean digito = false;
		boolean caracterA = false;
		int contadorMinusculas = 0;
		boolean minusculas = false;

		do {
			String frase = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca una frase cuyas palabras tengan"
					+ "una mayúscula, dos minúsculas, un dígito y un caracter alfanumérico");
			String[] palabras = frase.split("[ ]{1,}");
			for (int i = 0; i < palabras.length; i++) {
				System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);

				mayuscula = false;
				digito = false;
				caracterA = false;
				contadorMinusculas = 0;
				minusculas = false;

				for (int j = 0; j < palabras[i].length(); j++) {

					if (Character.isUpperCase(palabras[i].toCharArray()[j])) {
						mayuscula = true;
					}
					if (Character.isDigit(palabras[i].toCharArray()[j])) {
						digito = true;

					}
					if (!Character.isLetterOrDigit(palabras[i].toCharArray()[j])) {
						caracterA = true;
					}
					if (Character.isLowerCase(palabras[i].toCharArray()[j])) {
						contadorMinusculas++;
					}
					if (contadorMinusculas >= 2) {
						minusculas = true;
					}

				}

				if (mayuscula == false | minusculas == false | digito == false | caracterA == false) {
					System.out.println("La frase es incorrecta, introduzca otra.");
					break;
				}

			}
		} while (!(mayuscula && minusculas && digito && caracterA));
		
		System.out.println("La frase es correcta.");
	}
}