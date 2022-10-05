package capitulo03.bloque03;

import javax.swing.JOptionPane;

//1º.- Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el usuario introduzca el número 0 (cero), que no debe tenerse en cuenta para ninguna operación aritmética, simplemente para salir de la aplicación. Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma  y de la media de todos los números.


public class Ejercicio01 {

	public static void main(String[] args) {

		
		float suma = 0;
		String numero;
		int i = 0;
		for (i = 0; i>=0; i++) {
		
		
		numero = JOptionPane.showInputDialog("Introduzca el número, el número 0 apaga el problema.");
		int num = Integer.parseInt(numero);
		
		if (num != 0) {
			
			suma = suma + num;	
		}
		else {
			break;
		}
		
		
	
		}
		
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media aritmética de los números es: " + suma/i);
		
		
		
		
	}

}
