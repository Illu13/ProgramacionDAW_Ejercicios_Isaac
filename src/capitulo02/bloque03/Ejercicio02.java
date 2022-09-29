package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
//		 Realiza una calculadora avanzada, pero con la particularidad de que las operaciones deben ser raices, potencias y el módulo de la división.

	public static void main(String[] args) {

		String opcion1;
		String numero12;
		String numero13;
		String numero14;
		String numero22;
		String numero23;
		String indice1;
		
		System.out.println("1-Raíces");
		System.out.println("2-Potencias");
		System.out.println("3-Resto de una división");
		
		
		
		opcion1 = JOptionPane.showInputDialog("¿Qué quieres calcular? ");
		
		int opcion = Integer.parseInt(opcion1);
		
		switch (opcion) {
		
		case 1:
			numero12 = JOptionPane.showInputDialog("Introduzca el número al que le quieres hacer la raíz");
			int numero1 = Integer.parseInt(numero12);
			indice1 = JOptionPane.showInputDialog("Introduzca el índice de la raíz");
			double indice = Double.parseDouble(indice1);
			System.out.println(Math.pow(numero1, 1/indice));
			break;
			
		case 2: 
			numero13 = JOptionPane.showInputDialog("Introduzca el primer número de la potencia.");
			int numeroPotencia1 = Integer.parseInt(numero13);
			numero22 = JOptionPane.showInputDialog("Introduzca el número al que quieres elevar.");
			int numeroPotencia2 = Integer.parseInt(numero22);
			System.out.println("El resultado es: " + Math.pow(numeroPotencia1, numeroPotencia2));
			break;
		case 3:
			numero14 = JOptionPane.showInputDialog("Introduzca el primer número de la división.");
			int numeroDivision1 = Integer.parseInt(numero14);
			numero23 = JOptionPane.showInputDialog("Introduzca el número por el cual quieres dividir el número anterior");
			int numeroDivision2 = Integer.parseInt(numero23);
			System.out.println("El resto de la división es: " + numeroDivision1 % numeroDivision2);
			break;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
