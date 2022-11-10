package capitulo04.bloque05;

import capitulo04.bloque04.Utils;
import capitulo04.bloque04.UtilsArrays;

public class Ejercicio03ArrayDeNumerosDecimales {

	public static void main(String[] args) {
		
		double array [] = new double [20];
		double parteDecimal;
		double parteNoDecimal;
		int contadorDecimalesSuperiores = 0;
		double numeroFinal = 0;
		
		for (int i = 0; i < array.length; i++) {
			parteNoDecimal = Utils.obtenerNumeroAzar();
			parteDecimal = Math.random();
			numeroFinal = parteNoDecimal + parteDecimal;
			array[i] = numeroFinal;
			if (parteDecimal > 0.49) {
				contadorDecimalesSuperiores += 1;
			}
		}
		
		UtilsArrays.mostrarArrayDouble(array);
		System.out.println("Numeros con decimal superior a 0.49: " + contadorDecimalesSuperiores);
		
	}

}
