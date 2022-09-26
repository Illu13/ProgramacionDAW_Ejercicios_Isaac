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
		
		double num1 = Double.parseDouble(numero1);
		double num2 = Double.parseDouble(numero2);
		double num3 = Double.parseDouble(numero3);
		double media = ((num1+num2+num3)/3);
		
		System.out.println("La media aritmética de los 3 números es: " + media);
		
		
		
		
		
		
	



	}

}
