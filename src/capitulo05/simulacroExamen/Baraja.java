package capitulo05.simulacroExamen;

import java.util.Arrays;
import java.util.Iterator;

import capitulo04.bloque04.Utils;

public class Baraja {

	private Carta[] cartas = new Carta[52];

	public Baraja() {
		int j = 0;
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Picas", i + 1, j);
		}
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Diamantes", i + 1, j);
		}
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Tréboles", i + 1, j);
		}
		for (int i = 0; i < 13; i++, j++) {
			this.cartas[j] = new Carta("Corazones", i + 1, j);
		}

	}

	public void desplazamientoCircular() {

		Carta cartaUltima = cartas[51];

		for (int i = cartas.length - 1; i >= 0; i--) {
			if (i != 0) {
				cartas[i] = cartas[i - 1];
			} else {
				cartas[0] = cartaUltima;
			}

		}
	}

	public void desplazamientoCircular2() {

		Carta ultimo = cartas[0];
		for (int i = 0; i < cartas.length - 1; i++) {
			cartas[i] = cartas[i + 1];

		}
		cartas[cartas.length - 1] = ultimo;
	}

	public Baraja(Carta[] cartas) {
		super();
		this.cartas = cartas;
	}

	public void mezclarCartas() {
		for (int i = 0; i < 300; i++) {
			int posicion1 = Utils.obtenerNumeroAzar(0, 51);
			int posicion2 = Utils.obtenerNumeroAzar(0, 51);
			Carta cartaAuxiliar = null;
			cartaAuxiliar = cartas[posicion1];
			cartas[posicion1] = cartas[posicion2];
			cartas[posicion2] = cartaAuxiliar;
		}
	}

	public void ordenarCartas() {

		for (int i = 0; i <= cartas.length - 2; i++) {
			for (int j = 0; j <= cartas.length - 2; j++) {
				Carta cartaAuxiliar = null;
				if (cartas[j].getId() > cartas[j + 1].getId()) {
					cartaAuxiliar = cartas[j];
					cartas[j] = cartas[j + 1];
					cartas[j + 1] = cartaAuxiliar;
				}

			}
		}
	}

	public Jugador darCartasYNombre(Jugador[] jugadores) {
		Carta[] mano = new Carta[5];
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = 0; j < mano.length; j++) {
				Carta cartaAleatoria = null;
				
				int posicionAleatorio = Utils.obtenerNumeroAzar(0, 51);
				if (j == 0 && i == 0) {
					cartaAleatoria = cartas[posicionAleatorio];
					mano[j] = cartaAleatoria;
					cartas[posicionAleatorio] = null;
				} else {
					if (cartas[posicionAleatorio] == null) {
						j--;
					} else {
						cartaAleatoria = cartas[posicionAleatorio];
						mano[j] = cartaAleatoria;
						cartas[posicionAleatorio] = null;
					}
				}
			}
			jugadores[i].setMano(mano);
			System.out.println(jugadores[i].toString());
		}
		return null;
		
	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

}
