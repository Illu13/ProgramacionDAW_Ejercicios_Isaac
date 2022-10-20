package capitulo04.bloque02;

import java.lang.reflect.Array;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio06DesplazamientoCircularEleccionUsuario {
	public static void main(String[] args) {

		int array1[] = new int[5];
		String opc;
		opc = JOptionPane.showInputDialog("¿Quieres moverlo a la derecha (2) o a la izquierda? (1)");
		int opcion = Integer.parseInt(opc);

		switch (opcion) {

		case 1:
			int array2[] = new int[5];
			for (int i = 0; i < array1.length; i++) {

				array1[i] = (int) Math.round(Math.random() * 100);
				System.out.print(array1[i] + " ");
			}
			for (int i = 0; i < array2.length; i++) {
				array2[i] = array1[i];
			}

			for (int i = 0; i < array2.length; i++) {
				if (i == 4) {
					array1[i] = array2[0];
				} else {
					array1[i] = array2[i + 1];
				}
			}
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[j] + " ");
			}

			break;
		case 2:
			for (int i = 0; i < array1.length; i++) {

				array1[i] = (int) Math.round(Math.random() * 100);
				System.out.print(array1[i] + " ");
			}

			int variableultima = array1[4];

			for (int j = array1.length - 1; j >= 0; j--) {
				if (j != 0) {
					array1[j] = array1[j - 1];
				} else {
					array1[0] = variableultima;
				}

			}
			for (int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + " ");
			}

		}
	}
}
