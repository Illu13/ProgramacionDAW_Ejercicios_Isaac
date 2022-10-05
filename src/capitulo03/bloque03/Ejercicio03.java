package capitulo03.bloque03;

import javax.swing.JOptionPane;

//Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.

public class Ejercicio03 {

	public static void main(String[] args) {
	
		
		String numero;
		int multiplicacion = 0, num = 1;
		
		for (int i = 0; num != 0; i++) {
			
			numero = JOptionPane.showInputDialog("Introduzca el número, el número 0 apaga el programa.");
			num = Integer.parseInt(numero);
			
			if (num != 0) {
				
				for (int j = 1; j <= 10 ;j++) {
					
					
					multiplicacion = j * num;
					System.out.println("La tabla de multiplicar de " + num + " es " + multiplicacion);
				}
			}
			
		}

	}

}
