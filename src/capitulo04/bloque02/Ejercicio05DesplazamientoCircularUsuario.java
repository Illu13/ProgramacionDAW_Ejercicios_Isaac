package capitulo04.bloque02;

import javax.swing.JOptionPane;

//Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de posiciones que deseamos desplazar.

public class Ejercicio05DesplazamientoCircularUsuario {

	public static void main(String[] args) {
		
		int array1[] = new int[5];
		String veces;
		veces = JOptionPane.showInputDialog("¿Cuántas veces quieres hacer esto?");
		int vec = Integer.parseInt(veces);

		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array1[i] + " ");
		}

		for (int i = 0; i != vec; i++) {
			int variableultima = array1[4];

			for (int j = array1.length - 1; j >= 0; j--) {
				if (j != 0) {
					array1[j] = array1[j - 1];
				} else {
					array1[0] = variableultima;
				}

			}
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
