package Ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio_1 {

	public static void main(String[] args) {
		String numero1;
		String numero2;
		String numero3;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número entero");
		numero2 = JOptionPane.showInputDialog("Introduzca un número float");
		numero3 = JOptionPane.showInputDialog("Introduzca otro número doble");
		
		int num1 = Integer.parseInt(numero1);
		float num2 = Float.parseFloat(numero2);
		double num3 = Double.parseDouble(numero3);
		
		System.out.println("El número entero introducido es: " + num1); System.out.println("El número float introducido es: " + num2); System.out.println("El número double introducido es: " + num3);
		
		
	}

}
