package capitulo03.bloque04;

public class Ejercicio03 {
	
//	3º.- Crea un ejercicio que imprima en pantalla todas las tablas de multiplicar desde el 1 hasta el 15. Debes utilizar únicamente bucles de tipo "do...while".


	public static void main(String[] args) {

		int num1, num2, multiplicacion;
		num1 = 1;
		multiplicacion = 1;
		
		do { 
			while (multiplicacion <= 10){
			System.out.println("La multiplicacion es " + num1 * multiplicacion);	
				multiplicacion++;
			}	
			num1++;
			multiplicacion = 1;
		} while (num1 <= 15);
		
		
		
		
		
		
	}
}
