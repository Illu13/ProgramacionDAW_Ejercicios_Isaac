package capitulo02.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {
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
		int sumneg = 0;
		int num12 = 0;
		int num22 = 0;
		int num32 = 0;
		int num42 = 0;
		
		
		
		
		
		
		if (num1 < 0) { 
			num12 = num12 + num1;
		}		
		if (num2 < 0) {
			num12 = num12 + num2;
		}
		if (num3 < 0) {
			num12 = num12 + num3;
		}
		if(num4 < 0) {
			num12 = num12 + num4;
		}
		if (num5 < 0) {
			num12 = num12 + num5;
		}
		if (num1 >= 0 && num1 <=25) {
			num22 = num22 + num1;
		}
		if (num2 >= 0 && num2 <=25) {
			num22 = num22 + num2;
		}
		if (num3 >= 0 && num3 <=25) {
			num22 = num22 + num3;
		}
		if (num4 >= 0 && num4 <=25) {
			num22 = num22 + num4;
		}
		if (num5 >= 0 && num5 <=25) {
			num22 = num22 + num5;
		}
		if (num1 >= 26 && num1 <= 250) {
			num32 = num32 + num1;
		}
		if (num2 >= 26 && num2 <= 250) {
			num32 = num32 + num2;
		}
		if (num3 >= 26 && num3 <= 250) {
			num32 = num32 + num3;
		}
		if (num4 >= 26 && num4 <= 250) {
			num32 = num32 + num4;
		}
		if (num5 >= 26 && num5 <= 250) {
			num32 = num32 + num5;
		}
		if (num1 > 250) {
			num42 = num42 + num1;
		}
		if (num2 > 250) {
			num42 = num42 + num2;
		}
		if (num3 > 250) {
			num42 = num42 + num3;
		}
		if (num4 > 250) {
			num42 = num42 + num4;
		}
		if (num5 > 250) {
			num42 = num42 + num5;
		}
		
		System.out.println("La suma de los números negativos es: " + num12);
		System.out.println("La suma de los números pequeños es: " + num22);
		System.out.println("La suma de los números medianos es: " + num32);
		System.out.println("La suma de los números grandes es: " + num42);
		
		
		
		
		
		
	}

}
