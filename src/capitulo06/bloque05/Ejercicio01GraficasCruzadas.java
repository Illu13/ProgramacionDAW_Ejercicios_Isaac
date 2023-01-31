package capitulo06.bloque05;

public class Ejercicio01GraficasCruzadas {

	public static void main(String[] args) {
		
		double x = 0;
		
		do {
			
			x += 0.001;
			double x1 = Math.sqrt(x);
			double x2 = -Math.log(x);
			
			if (Math.abs(x2) - Math.abs(x1) < 0.001) {
				System.out.println("La solución es: " + x);
				break;
				
			}
			
			
		} while (true);

	}

}
