package capitulo04.bloque02;

//3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, pedido al usuario.

import javax.swing.JOptionPane;

public class Ejercicio03MultiplicarElementosArraysNumero {

	public static void main(String[] args) {

		int array1[] = new int[150];
		String numeroMultiplicarArray;

		for (int i = 0; i < array1.length; i++) {

			array1[i] = (int) Math.round(Math.random() * 100);
		}

		numeroMultiplicarArray = JOptionPane.showInputDialog("Introduzca el número para multiplicar el array.");
		int numMA = Integer.parseInt(numeroMultiplicarArray);

		System.out.println("Este es el array sin multiplicar.");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		for (int i = 0; i < array1.length; i++) {

			array1[i] = array1[i] * numMA;
		}
		System.out.println("Este es el array multiplicado.");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
}
