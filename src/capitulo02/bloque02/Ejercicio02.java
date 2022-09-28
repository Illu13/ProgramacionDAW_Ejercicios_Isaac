package capitulo02.bloque02;

import javax.swing.JOptionPane;


//2º.- Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias: no existe la categoría de números negativos, por tanto si el usuario introduce un negativo, el programa debe terminar; la otra diferencia es que, al acabar, el programa no debe mostrar la suma de los números, sino cuantos han entrado en cada categoría. A esto se llema contadores, a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.

public class Ejercicio02 {
public static void main(String[] args) {
		
		String numero1;
		String numero2;
		String numero3;
		String numero4;
		String numero5;

		numero1 = JOptionPane.showInputDialog("Introduzca un número");
		numero2 = JOptionPane.showInputDialog("Introduzca un número");
		numero3 = JOptionPane.showInputDialog("Introduzca un número");
		numero4 = JOptionPane.showInputDialog("Introduzca un número");
		numero5 = JOptionPane.showInputDialog("Introduzca un número");

		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		int num3 = Integer.parseInt(numero3);
		int num4 = Integer.parseInt(numero4);
		int num5 = Integer.parseInt(numero5);
		
		int nump = 0;
		int numm = 0;
		int numg = 0;
		
		
		
		
		if (num1 < 0) {
			return;
		}

		if (num2 < 0) {
			return;
		}
		if (num3 < 0) {
			return;
		}
		if (num4 < 0) {
			return;
		}
		if (num5 < 0) {
			return;
		}
		if (num1 >= 0 && num1 <=25) {
			nump = nump + 1;
		}
		if (num2 >= 0 && num2 <=25) {
			nump = nump + 1;
		}
		if (num3 >= 0 && num3 <=25) {
			nump = nump + 1;
		}
		if (num4 >= 0 && num4 <=25) {
			nump = nump + 1;
		}
		if (num5 >= 0 && num5 <=25) {
			nump = nump + num1;
		}
		if (num1 >= 26 && num1 <= 250) {
			numm = numm + 1;
		}
		if (num2 >= 26 && num2 <= 250) {
			numm = numm + 1;
		}
		if (num3 >= 26 && num3 <= 250) {
			numm = numm + 1;
		}
		if (num4 >= 26 && num4 <= 250) {
			numm = numm + 1;
		}
		if (num5 >= 26 && num5 <= 250) {
			numm = numm + 1;
		}
		if (num1 > 250) {
			numg = numg + 1;
		}
		if (num2 > 250) {
			numg = numg + 1;
		}
		if (num3 > 250) {
			numg = numg + 1;
		}
		if (num4 > 250) {
			numg = numg + 1;
		}
		if (num5 > 250) {
			numg = numg + 1;
		}
		
		System.out.println("La cantidad de números pequeños es: " + nump);
		System.out.println("La cantidad de números medianos es: " + numm);
		System.out.println("La cantidad de números grandes es: " + numg);
		
		
		
		
		
		
		
		
		
		
		
	}
}
