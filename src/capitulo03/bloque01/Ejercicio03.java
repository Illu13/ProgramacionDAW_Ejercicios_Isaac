package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	
//	 Realiza un ejercicio que pida números al usuario, tantos como indique el usuario. al final debe aparecer cuantos números positivos y negativos se han introducido.

	public static void main(String[] args) {
		
		String introducir;
		String numero;
		int numN = 0;
		int numP = 0;
		int num;
		int intr;
		
		introducir = JOptionPane.showInputDialog("¿Cuántos números quieres introducir?");
		intr = Integer.parseInt(introducir);
		
		for (int i = 0; i<intr; i++) {
			
			numero = JOptionPane.showInputDialog("Introduzca número");
			num = Integer.parseInt(numero);
			
			if (num > 0) 
				numP++;
			else 
				numN++;
		}
		System.out.println("La cantidad de números positivos es: " + numP);
		System.out.println("La cantidad de números negativos es: " + numN);
		
		
		
		
		
	}

}
