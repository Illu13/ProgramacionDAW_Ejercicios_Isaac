package capitulo06.bloque04;

import capitulo04.bloque04.Utils;

public class Ejercicio02Contrasenia {

//	2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
//	- Al menos una mayúscula.
//	- Al menos una minúscula.
//	- Al menos un dígito
//	- Al menos un carácter no alfanumérico.
//	El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.

	public static void main(String[] args) {

		boolean contraseniaCorrecta = false;

		do {

			String str = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca una contraseña");

			boolean caracterA = false;
			boolean mayuscula = false;
			boolean minuscula = false;
			boolean digito = false;

			for (int i = 0; i < str.length(); i++) {

				if (Character.isUpperCase(str.toCharArray()[i])) {
					mayuscula = true;
					break;
				}
			}
			for (int i = 0; i < str.length(); i++) {

				if (Character.isLowerCase(str.toCharArray()[i])) {
					minuscula = true;
					break;
				}
			}
			for (int i = 0; i < str.length(); i++) {

				if (Character.isDigit(str.toCharArray()[i])) {
					digito = true;
					break;
				}
			}
			for (int i = 0; i < str.length(); i++) {

				if (!Character.isLetterOrDigit(str.toCharArray()[i])) {
					caracterA = true;
					break;
				}
			}
			
			if (caracterA == true && minuscula == true && mayuscula == true && digito == true) {
				contraseniaCorrecta = true;
			}
			
		} while (contraseniaCorrecta = false);
		
		System.out.println("Contraseña validada.");

	}

}
