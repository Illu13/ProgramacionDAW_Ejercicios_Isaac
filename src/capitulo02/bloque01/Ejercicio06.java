package capitulo02.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	
//	Realizar un ejercicio en Java que pida un número al usuario e indique en pantalla si se trata de un número par o impar. Recuerda que un número par es aquel cuyo resto de su división entre dos sea siempre cero, y recuerda que un número impar es aquel cuyo resto de su división entre dos sea siempre uno.

	public static void main(String[] args) {

		String numero;
		
		numero = JOptionPane.showInputDialog("Introduzca un número");
		int num = Integer.parseInt(numero);
		
		if (num % 2 == 1) { System.out.println("Este número es impar.");
			
		}
			else { if (num % 2 ==0) 
				System.out.println("Este número es par.");
							}
		
		
		
		
		
		

	}

}
