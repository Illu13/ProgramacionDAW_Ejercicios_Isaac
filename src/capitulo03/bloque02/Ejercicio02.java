package capitulo03.bloque02;

import javax.swing.JOptionPane;

//Mayor y menor de una cantidad de números dada por el usuario. El usuario introducirá una cantidad de números, tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir el mayor y el menor de todos los introducidos.

public class Ejercicio02 {

	public static void main(String[] args) {

		String introducir;
		introducir = JOptionPane.showInputDialog("¿Cuántos números quieres introducir?");
		int intr = Integer.parseInt(introducir);
		int mayor = 0;
		int menor = 0;
		String numero;
		int num;

		for (int i = 0; i < intr - 1; i++) {

			if (i == 0) {
				mayor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
				;
				menor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
				;
				num = mayor;

			}

			else {
				numero = JOptionPane.showInputDialog("Introduzca un número");
				num = Integer.parseInt(numero);
				if (num > mayor) {
					mayor = num;
				}
			}
			if (num < menor) {

				menor = num;
			}

		}

		System.out.println("El número más grande es: " + mayor + " y el menor es: " + menor);
	}

}
