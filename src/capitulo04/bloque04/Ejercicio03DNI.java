package capitulo04.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio03DNI {

	public static void main(String[] args) {
		int dni = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca los números de tu DNI");
		char[] letrasDni = new char[] { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
				'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		int moduloDivisionDni = dni % 23;

		System.out.println(letrasDni[moduloDivisionDni]);

	}

}
