package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
//	Realiza un programa que pida al usuario cuatro números enteros, y calcule la suma solo de aquellos números introducidos por el usuario, que sean mayores de 10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de 10.

	public static void main(String[] args) {
		
		String numero;
		int suma = 0;
		int num;
		
		for (int i = 0; i<4; i++) {
	
			numero = JOptionPane.showInputDialog("Introduzca un número");
			num = Integer.parseInt(numero);
			if (num>10) {
				
				suma = suma + num;
			}
			
			
		}
		
		
		System.out.println("La suma de los número mayores de 10 es " + suma);
		
		

	}

}
