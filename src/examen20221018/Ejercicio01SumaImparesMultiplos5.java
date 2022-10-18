package examen20221018;

public class Ejercicio01SumaImparesMultiplos5 {

	public static void main(String[] args) {

//		Primero creamos una variable, para sumar en esta los múltiplos de 5.
		int multiplos = 0;
//		Luego creamos otras, para de esta manera, conseguir la media de los números impares.
		float impares = 0;
		int cantidadimpares = 0;
//		Ahora creamos un bucle para conseguir los 10 números.
		for (int i = 0; i < 10; i++) {
			int numero = (int) Math.round(Math.random() * 100);
//		Con esto mostramos el número en la consola.
			System.out.println(numero);
//		Creamos este condicional para de esta manera saber si nuestro número es impar, y poder añadirlo a un contador.
//		También de esta manera, lo sumamos a un total de números impares que nos servirá para sacar la media de este.
			if (numero % 2 == 1) {
				impares = numero + impares;
				cantidadimpares = cantidadimpares + 1;
			}
//			Con este condicional conseguimos saber si este número es múltiplo de 5 y sumarlo a la variable múltiplos.
			if (numero % 5 == 0) {
				multiplos = multiplos + numero;
			}
		}
//		Finalmente, con esto sacaremos en consola la media de los impares y la suma de los múltiplos de 5.
		System.out.println("La media de los números impares es: " + impares / cantidadimpares);
		System.out.println("La suma de los múltiplos de 5 es: " + multiplos);
	}

}
