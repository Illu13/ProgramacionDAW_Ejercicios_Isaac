package capitulo01.bloque01;
import javax.swing.JOptionPane;

public class Ejercicio_4 {

	public static void main(String[] args) {
//		Realiza un programa que muestre la media de tres números introducidos.

		String numero1;
		String numero2;
		String numero3;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número");
		numero2 = JOptionPane.showInputDialog("Introduzca otro número");
		numero3 = JOptionPane.showInputDialog("Introduzca un último número");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		int num3 = Integer.parseInt(numero3);
		
		System.out.println("La media aritmética de los 3 números es: " + ((num1 + num2 + num3)/3));
		
		
		
		
		
		
	



	}

}
