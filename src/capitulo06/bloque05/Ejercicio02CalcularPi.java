package capitulo06.bloque05;

public class Ejercicio02CalcularPi {

	public static void main(String[] args) {
		double divisor = -1;
		double resultado = 0;
		int numeroVeces = -0;
		double diferencia = 0;
		
		
		do {
			numeroVeces += 1;
			divisor += 2;
			
			
			
			
			if (numeroVeces % 2 != 0) {
				
				resultado += 4/divisor; 
			} 
			else {
				resultado -= 4/divisor;
			}
			
			diferencia = Math.abs(resultado - Math.PI);
			
		} while (!(diferencia < 0.00001));
		
		System.out.println(resultado);

	}

}
