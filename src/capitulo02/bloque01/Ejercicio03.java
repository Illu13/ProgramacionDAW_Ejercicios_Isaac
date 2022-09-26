package capitulo02.bloque01;

import javax.swing.JOptionPane;

//3º.- Repetir el ejercicio 1º de este bloque de ejercicios, pero pidiendo al usuario cinco variables. Es decir, se pedirán al usuario cinco variables y se mostrará el mayor valor en pantalla.

public class Ejercicio03 {

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

	}

}
