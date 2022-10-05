package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		String numero;
		numero = JOptionPane.showInputDialog("Introduzca el número");
		int num = Integer.parseInt(numero);
		String limite;
		limite = JOptionPane.showInputDialog("Introduzca el límite de los múltiplos");
		int lim = Integer.parseInt(limite);
		
		for (int i=0; i<lim ; i = i + num) {
			
			System.out.println("Los factores son estos: " + i);
			
			
		}
		
	}

}
