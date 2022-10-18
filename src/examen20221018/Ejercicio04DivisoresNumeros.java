package examen20221018;

public class Ejercicio04DivisoresNumeros {

	public static void main(String[] args) {

		/*
		 * Primero se crea un bucle para crear los números, como en anteriores
		 * ejercicios, tras crearlo, se imprime en la consola.
		 */

		for (int i = 0; i < 10; i++) {
			int numero = (int) Math.round(Math.random() * 100);
			System.out.println(numero);
			/*
			 * Dentro del primer bucle, que su función es crear el número, crearemos otro,
			 * que este servirá para conseguir los divisores del número.
			 */
			for (int j = numero; j != 0; j--) {
				/*
				 * Si el resto del número entre j, que es igual a la variable número y con cada
				 * iteración su valor se resta en uno, j será un divisor , y por lo tanto, si j
				 * es un divisor, se imprime en la pantalla, de ahí el uso del condicional.
				 */
				if (numero % j == 0) {
					System.out.println(j + " es divisor de " + numero);
				}
			}
		}

	}

}
