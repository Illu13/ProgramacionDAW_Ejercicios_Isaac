package capitulo03.bloque02;

import javax.swing.JOptionPane;

//Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario. Se imprimirán todos los múltiplos menores de 100, este será el límite.

public class Ejercicio03 {

	public static void main(String[] args) {
	
		String numero;
		numero = JOptionPane.showInputDialog("Introduzca el número");
		int num = Integer.parseInt(numero);

		
		for (int i=0; i<100 ; i = i + num) {
			
			System.out.println("Los factores son estos: " + i);
			
			
		}
		
	

		
	
		
		
		
		}
		
		
		
	 
		
		
		

	}


