package capitulo03.bloque02;

import javax.swing.JOptionPane;

//Media de una cantidad de números introducidos por el usuario. El usuario especificará una cantidad de números, tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir la media.

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String introducir; 
		String numero;
		int suma = 0;
		introducir = JOptionPane.showInputDialog("¿Cuántos números quieres introducir?");
		float intr = Float.parseFloat(introducir);
		
		for (int i=0; i<intr; i++) {
			
			numero = JOptionPane.showInputDialog("Introduzca un número");
			int num = Integer.parseInt(numero);
			
			suma = suma + num;
			
			
		}
		
		System.out.println("La media aritmética de los números introducidos es: " + suma / intr);
		
		

	}

}
