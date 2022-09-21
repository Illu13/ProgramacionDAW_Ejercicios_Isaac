package Cosas_Aleatorias;
import javax.swing.JOptionPane;

public class Hola_Mundo {

	public static void main(String[] args) {
	System.out.println("UwU");
	
	String numero1;
	String numero2;
	String numero3;
	
	
	numero1 = JOptionPane.showInputDialog("Escribe un número");
	numero2 = JOptionPane.showInputDialog("Escribe otro número");
	numero3 = JOptionPane.showInputDialog("Escribe un último número");
	float num1 = Float.parseFloat(numero1);
	float num2 = Float.parseFloat(numero2);
	float num3 = Float.parseFloat(numero3);
	

	
	
	System.out.println("La media aritmética de esos 3 números es: " + (num1 + num2 + num3)/3);
	
	}

}
