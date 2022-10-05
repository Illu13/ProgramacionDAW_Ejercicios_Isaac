package capitulo03.bloque03;

import javax.swing.JOptionPane;

//- Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero). Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor y el menor introducido. El valor 0 (cero) no debe tenerse en cuenta.


public class Ejercicio02 {

	public static void main(String[] args) {
	
		
		String introducir; 
		int mayor = 0;
		int menor = 0;
		String numero;
		int num = 1;
		
		for (int i = 0; i>=0; i++) {
			
			if (num !=0) {
			
			if (i == 0) { 
				mayor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número, el 0 termina el programa.")); ; 
				menor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número, el 0 termina el programa")); ; 
				num = mayor;
				
			}
			
			else {
				numero = JOptionPane.showInputDialog("Introduzca un número, el 0 termina el programa.");
				num = Integer.parseInt(numero);
				if (num > mayor) {
					mayor = num;
			}
				}
			if (num < menor) {
				
				menor = num;
			}
			
			}
			else {
				break;
			}
		}
	
		System.out.println("El número más grande es: " + mayor + " y el menor es: " + menor);
	}
		

		
		
		
		
		
		
		
		
		

	}


