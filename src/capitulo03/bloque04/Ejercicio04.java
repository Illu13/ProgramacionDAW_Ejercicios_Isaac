package capitulo03.bloque04;

import javax.swing.JOptionPane;

// Crea un programa que pida al usuario un número e imprima ese número en binario. Tienes prohibido el uso del bucle "for".

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String numero;
		numero = JOptionPane.showInputDialog("Introduza el número");
		int num1 = Integer.parseInt(numero);
		int mascara = 128;
		while (mascara != 0) {
			if ((num1 & mascara) != 0) {
				
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
			mascara = mascara / 2;
		} 
		
		
	
	}

}
