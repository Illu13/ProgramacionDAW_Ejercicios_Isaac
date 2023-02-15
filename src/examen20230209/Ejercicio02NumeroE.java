package examen20230209;

public class Ejercicio02NumeroE {
	
//	(2 puntos) Calcular el número E (Número de Euler 2,7182818284590452353602874713527…) de la
//	siguiente forma:

	public static void main(String[] args) {
		
		double numeroE = 0;
		for (double i = 0; i <= 7; i++) {
			if (i == 0) {
				numeroE = 1;		
			}
			else {
				numeroE += 1/conseguirFactoriales(i);
			}
		}
		System.out.println(numeroE);

	}
	
	
	public static double conseguirFactoriales(double numero) {
		
		double num1 = numero;
		double fact = 1;
		double i;
		i = num1;
		while (i != 0) {
			fact = fact * i;
			i--;
		}
		return fact;
		
	}

}
