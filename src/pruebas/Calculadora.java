package pruebas;

import capitulo04.bloque04.Utils;

public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora() {
		super();
	}

	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int suma() {

		return num1 + num2;
	}

	public int resta(int num1, int num2) {

		return num1 - num2;
	}

	public int factorial(int numero) {

		int num1 = numero;
		int fact = 1;
		int i;
		i = num1;
		while (i != 0) {
			fact = fact * i;
			i--;
		}
		return fact;
	}

	public int multiplicar(int num1, int num2) {

		return num1 * num2;
	}

	public int dividir(int num1, int num2) {

		return num1 / num2;
	}

}
