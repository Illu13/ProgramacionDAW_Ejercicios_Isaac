package capitulo06.bloque04;

public class Ejercicio01TablaLimitesNumerosJava {
	
//	1º.- Realizar un programa que imprima una tabla (simplemente unas líneas en la consola) con los límites máximo y mínimo representables para los diferentes tipos primitivos en Java (byte, int, short, long, float, double). En la tabla también deberá aparecer el número de bytes que cada tipo usa para su representación.


	public static void main(String[] args) {
		System.out.println("\nValor máximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo para un Long: " + Long.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Long: " + Long.SIZE);
		
		System.out.println("\nValor máximo para un int: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo para un int: " + Integer.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para int: " + Integer.SIZE);
		
		System.out.println("\nValor máximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo para un Short: " + Short.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Short: " + Short.SIZE);
		
		System.out.println("\nValor máximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un Float: " + Float.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Float: " + Float.SIZE);
		
		System.out.println("\nValor máximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un Double: " + Double.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Double: " + Double.SIZE);
		
		System.out.println("\nValor máximo para un Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo para un Byte: " + Byte.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Byte: " + Byte.SIZE);


	}

}
