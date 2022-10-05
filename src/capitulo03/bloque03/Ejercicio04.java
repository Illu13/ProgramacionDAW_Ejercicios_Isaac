package capitulo03.bloque03;

import javax.swing.JOptionPane;

//4º.- Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos. No debes tener en cuenta el 0 (cero).

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String numero;
		int num, numP = 0, numN = 0;
		
		for (int i = 0; i >= 0; i++) {
			
			numero = JOptionPane.showInputDialog("Introduzca el número, el número 0 apaga el programa.");
			num = Integer.parseInt(numero);
			
			if (num != 0) {
				if (num > 0) {
					numP = numP + 1;
				}
				else {
					numN = numN + 1;
				}
			}
			
			else {
				break;
			}
			
		}
		System.out.println("Números negativos: " + numN);
		System.out.println("Números positivos: " + numP);
	}

}
