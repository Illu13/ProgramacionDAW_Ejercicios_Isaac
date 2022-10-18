package capitulo03.bloque04;

import javax.swing.JOptionPane;

//5º.- Calcula el factorial de un número dado por el usuario. Debes usar sólo el bucle while.


public class Ejercicio05 {

	public static void main(String[] args) {
	
		String numero;
		numero = JOptionPane.showInputDialog("Introduza el número");
		int num1 = Integer.parseInt(numero);
		int fact = 1;
		int i;
		i = num1;
		while (i != 0) {
			fact = fact * i;
			i--;
		}
		System.out.println(fact);
		
	}
}

