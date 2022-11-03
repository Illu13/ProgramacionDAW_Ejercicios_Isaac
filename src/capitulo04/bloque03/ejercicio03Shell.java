package capitulo04.bloque03;

import java.lang.reflect.Array;

public class ejercicio03Shell {
	public static void main(String[] args) {
		int num[] = new int[150];
		int reserva, shell;
		boolean movimiento = true;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(num[i] + " ");
		}
		System.out.println("");

		for (shell = num.length / 2; shell != 0; shell /= 2) {
			movimiento = true;
			while (movimiento) {
				movimiento = false;
				for (int i = shell; i < num.length; i++) {
					if (num[i - shell] > num[i]) {
						reserva = num[i];
						num[i] = num[i - shell];
						num[i - shell] = reserva;
						movimiento = true;
					}
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}