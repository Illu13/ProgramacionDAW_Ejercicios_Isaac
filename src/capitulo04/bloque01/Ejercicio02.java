package capitulo04.bloque01;

//2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para comprobar el funcionamiento


import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int array1 [] = new int [150];
		int intr;
		int intr2;
		String introducir;
		String introducir2;
		introducir = JOptionPane.showInputDialog("¿Cuál es el número más bajo?");
		intr = Integer.parseInt(introducir);
		introducir2 = JOptionPane.showInputDialog("¿Cuál es el número más alto?");
		intr2 = Integer.parseInt(introducir2);
		
		for (int i = 0; i < array1.length; i++) {
			
			array1 [i] = ((int) Math.round(Math.random() * (intr2 - intr))) + intr;
			}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
			}
		
		

	}

}
