package capitulo04.bloque06;

import capitulo04.bloque04.Utils;

public class Ejercicio03NumerosAleatoriosMedia500 {
	
//3.- Realizar un programa que genere números aleatorios entre 1 y 1000 hasta que el valor medio de los números generados se aproxime a 500 con un margen de error de 0,5. El programa deberá decir cuantos números aleatorios han sido generados cuando finalice.

	
	public static void main(String[] args) {
	
		System.out.println(numerosAleatoriosHastaMedia());
		
	}
	
	
	public static int numerosAleatoriosHastaMedia() {
		
		int contadorNumeros = 0;
		int mediaNumeros = 0;
		int sumaNumeros = 0;
		
		do {
			
			int numero = Utils.obtenerNumeroAzar(1, 1000);
			contadorNumeros++;
			sumaNumeros += numero;
			mediaNumeros = sumaNumeros / contadorNumeros;
			
		} while (!(mediaNumeros >= 499.5 && mediaNumeros <= 500.5));
		
		return contadorNumeros;
		
		
	}
	

}
