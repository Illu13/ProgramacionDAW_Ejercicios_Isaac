package capitulo03.bloque01;

import javax.swing.JOptionPane;

//Modifica el ejercicio anterior de manera que, en lugar de que el programa siempre pida cuatro números, sea el usuario el que decida cuantos números se van a pedir

public class Ejercicio02 {

	public static void main(String[] args) {
		String numero;
		String nose;
		int suma = 0;
		int num;
		nose = JOptionPane.showInputDialog("¿Cuántos números quieres introducir?");
		int sibro = Integer.parseInt(nose);
		
		for (int i = 0; i<sibro; i++) {
	
			numero = JOptionPane.showInputDialog("Introduzca un número");
			num = Integer.parseInt(numero);
			if (num>10) {
				
				suma = suma + num;
			}
			
			
		}
		
		
		System.out.println("La suma de los números mayores de 10 es " + suma);
		
		

	}


	}

