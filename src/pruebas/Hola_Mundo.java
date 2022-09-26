package pruebas;
import javax.swing.JOptionPane;

public class Hola_Mundo {

	public static void main(String[] args) {
	
	String numero1;
	String numero2;
	String numero3;
	
	
	numero1 = JOptionPane.showInputDialog("Escribe un número");
	numero2 = JOptionPane.showInputDialog("Escribe otro número");
	numero3 = JOptionPane.showInputDialog("Escribe un último número");
	int num1 = Integer.parseInt(numero1);
	int num2 = Integer.parseInt(numero2);
	int num3 = Integer.parseInt(numero3);
	

	
	
	System.out.println("La media aritmética de esos 3 números es: " + (num1 + num2 + num3)/3);
	
	}

}
