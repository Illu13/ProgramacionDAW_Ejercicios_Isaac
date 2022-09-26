package capitulo02.bloque01;
import javax.swing.JOptionPane;


public class Ejercicio01 {

	public static void main(String[] args) {
		
		String numero1;
		String numero2;
		numero1 = JOptionPane.showInputDialog("Introduzca un número");
		numero2 = JOptionPane.showInputDialog("Introduzca otro número");
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		if (num1>num2) { 
			System.out.println("El número más grande es: " + num1);
		}
		else {
			if (num2 > num1) {
				System.out.println("El número más grande es: " + num2);
			}
			else {
				System.out.println("Ambos son iguales");
			}
		}
		
	}

	}

