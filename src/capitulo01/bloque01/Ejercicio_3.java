package capitulo01.bloque01;
import javax.swing.JOptionPane;


public class Ejercicio_3 {

	public static void main(String[] args) {
//		 Realiza un programa que pida al usuario tres números y calcule y muestre en pantalla la suma de los tres.

		String numero1;
		String numero2;
		String numero3;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número");
		numero2 = JOptionPane.showInputDialog("Introduzca otro número");
		numero3 = JOptionPane.showInputDialog("Introduzca un último número");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		int num3 = Integer.parseInt(numero3);
		
		System.out.println("La suma de los 3 números es: " + (num1 + num2 + num3));
		
		
		
		
		
		
	}

}
