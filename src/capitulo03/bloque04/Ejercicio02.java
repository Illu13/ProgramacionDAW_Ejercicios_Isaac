package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio02 {
//	2º.- Crea un programa que compruebe si son primos o compuestos todos los números entre un límite inferior y uno superior que debes pedir al usuario. Tienes prohibido el uso del bucle "for".

	public static void main(String[] args) {
		
		
		String limite;
		limite = JOptionPane.showInputDialog("Introduza el límite inferior");
		int num = Integer.parseInt(limite);
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

