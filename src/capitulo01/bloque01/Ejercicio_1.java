package capitulo01.bloque01;
import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

/*
 * Realiza un programa que pida al usuario tres números: uno de tipo entero, otro de tipo flotante y otro de tipo doble. A continuación se tienen que mostrar en pantalla los tres números en una sola fila de la consola de salida.
 */

public class Ejercicio_1 {

	public static void main(String[] args) {
		String numero1;
		String numero2;
		String numero3;
		int nume1;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número entero");
		numero2 = JOptionPane.showInputDialog("Introduzca un número float");
		numero3 = JOptionPane.showInputDialog("Introduzca otro número doble");
		
		int num1 = Integer.parseInt(numero1);
		float num2 = Float.parseFloat(numero2);
		double num3 = Double.parseDouble(numero3);
		
		System.out.println("El número entero introducido es: " + num1); System.out.println("El número float introducido es: " + num2); System.out.println("El número double introducido es: " + num3);
		
		nume1 = Utils.obtenerEnteroPorInputStreamReader();
	}

}
