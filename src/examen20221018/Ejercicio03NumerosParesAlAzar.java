package examen20221018;

public class Ejercicio03NumerosParesAlAzar {

	public static void main(String[] args) {

//		Para este ejercicio necesitamos un bucle, para de esta manera conseguir los 10 números que nos piden.
		for (int i = 0; i < 10;) {
			int numero = ((int) Math.round(Math.random() * 100));
			/*
			 * Lo primero que tenemos que conseguir es el número sea par, para ello usaremos
			 * un condicional de este estilo, para que el resto no sea igual a 0. Si no lo
			 * es, la i no sufrirá ningún aumento, por lo que el bucle seguirá. El aumento
			 * no se incluye en el for, está aparte.
			 */
			if (numero % 2 != 0) {
				i = i + 0;
			}
			/*
			 * Si nuestro número cumple esa condición, haremos otro condicional para
			 * establecer los valores entre los que estará nuestro número, usando los & para
			 * establecer un "y" y los | para establecer un "o". Si los números cumplen esta
			 * condición, se imprimen en pantalla y la variable i sufre un aumento igual a
			 * 1.
			 */
			else {
				if (numero >= 20 && numero <= 30 || numero >= 40 && numero <= 50) {
					System.out.println(numero);
					i++;
				}

			}
		}
	}

}
