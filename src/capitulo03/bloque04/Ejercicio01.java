package capitulo03.bloque04;

import javax.swing.JOptionPane;

//1º.- Crea un programa que compruebe si un número es primo o no. Debes pedir al usuario un número y después informar de si se trata de un número primo o compuesto. Tienes prohibido el uso del bucle "for".

public class Ejercicio01 {
	public static void main(String[] args) {
		 
		int num = 1;
		String numero;
		numero = JOptionPane.showInputDialog("Introduza el número límite");
		int num1 = Integer.parseInt(numero);
		
		while (num < num1) {
			boolean esPrimo = true;
			int i = 2;
			while (i < num) {
				if (num % i == 0) {
					esPrimo = false;
				}
			i++;
			}
			
			if (esPrimo == true) {
				System.out.println(num + " es primo");
			}
			
			num++;
				
		}
		
		
		

	}
}
