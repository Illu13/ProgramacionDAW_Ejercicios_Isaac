package capitulo04.bloque01;

//4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras, debes indicar al usuario la posición del array en que se encuentra. En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {

		int array1 [] = new int [150];
		int intr;
		String introducir;
		introducir = JOptionPane.showInputDialog("¿Qué número quieres buscar?");
		intr = Integer.parseInt(introducir);
		boolean encontrado = false;
		
		for (int i = 0; i < array1.length; i++) {
			
			array1 [i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == intr) {
				encontrado = true;
				System.out.println("La posición en la que está tu número es: " + i);
			}
		
		}
		if (encontrado = false) {
			System.out.println("No se ha encontrado el número.");
		}
	}

}
