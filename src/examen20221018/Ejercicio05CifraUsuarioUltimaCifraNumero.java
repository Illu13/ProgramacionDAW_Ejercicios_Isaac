package examen20221018;

import javax.swing.JOptionPane;

public class Ejercicio05CifraUsuarioUltimaCifraNumero {
	public static void main(String[] args) {

		/*
		 * Declaramos las variables que nos van a hacer falta, en este caso le pedimos
		 * al usuario un número para hacer las comprobaciones después.
		 */
		String ultimacifra;
		ultimacifra = JOptionPane.showInputDialog("Introduzca una cifra");
		int ultcifra = Integer.parseInt(ultimacifra);

		/*
		 * Creamos el bucle que nos cree los 100 números.
		 */

		for (int i = 0; i < 100; i++) {
			int numero = (int) Math.round(Math.random() * 100);
			System.out.println(numero);
			/*
			 * Una vez creado, este while es el más importante, porque es el que hará que el
			 * programa haga su cometido. El procedimiento es el siguiente:
			 */
			while (numero >= 10) {
				numero = numero - 10;
			}
			/*
			 * Se resta 10 al número aleatorio que obtenemos hasta que el número sea
			 * inferior a 10. Cuando consigamos esto, nos quedaremos con la última cifra del
			 * número. Si esta es igual a la cifra introducida por el usuario se comunica,
			 * para eso está el if.
			 */
			if (numero == ultcifra) {
				System.out.println("Este número tiene la misma cifra que la que el usuario indicó anteriormente");
			}

		}

	}
}
