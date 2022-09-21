package capitulo01.bloque01;
import javax.swing.JOptionPane;

/*
 *  Realiza un programa igual al anterior, con la particularidad de que ahora se debe mostrar cada número justo a continuación del momento en que ha sido introducido.
 * 
 * 
*/

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		String numero1;
		String numero2;
		String numero3;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num1 = Integer.parseInt(numero1);
		System.out.println("Su número flotante es: " + num1);
		numero2 = JOptionPane.showInputDialog("Introduzca un número flotante");
		float num2 = Float.parseFloat(numero2);
		System.out.println("Su número entero es: " + num2);
		numero3 = JOptionPane.showInputDialog("Introduzca un número double");
		double num3 = Double.parseDouble(numero3);
		System.out.println("Su número doble es: " + num3);
		


			
		}
	
	}
	


