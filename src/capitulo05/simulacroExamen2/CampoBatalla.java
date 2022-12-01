package capitulo05.simulacroExamen2;

import java.util.Arrays;

import capitulo04.bloque04.Utils;

public class CampoBatalla {

	private Humano[] humanos = new Humano[20];
	private Monstruo[] monstruos = new Monstruo[20];

	public CampoBatalla() {

		for (int i = 0; i < humanos.length; i++) {
			if (i == humanos.length - 1) {
				this.humanos[i] = new Humano(Utils.obtenerNumeroAzar(50, 100) * 2, "Humano" + i, true, 0);
			} else {
				this.humanos[i] = new Humano(Utils.obtenerNumeroAzar(50, 100), "Humano" + i, true, 0);
			}

		}

		for (int i = 0; i < monstruos.length; i++) {
			if (i == monstruos.length - 1) {
				this.monstruos[i] = new Monstruo(Utils.obtenerNumeroAzar(50, 100) * 2, "Monstruo" + i, true, 0);
			} else {
				this.monstruos[i] = new Monstruo(Utils.obtenerNumeroAzar(50, 100), "Monstruo" + i, true, 0);
			}

		}

	}

	public void mezclarHumanos() {
		for (int i = 0; i < 300; i++) {
			int posicion1 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			int posicion2 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			Humano humanoAuxiliar = null;
			humanoAuxiliar = humanos[posicion1];
			humanos[posicion1] = humanos[posicion2];
			humanos[posicion2] = humanoAuxiliar;
		}
	}

	public void mezclarMonstruos() {
		for (int i = 0; i < 300; i++) {
			int posicion1 = Utils.obtenerNumeroAzar(0, monstruos.length - 1);
			int posicion2 = Utils.obtenerNumeroAzar(0, monstruos.length - 1);
			Monstruo monstruoAuxiliar = null;
			monstruoAuxiliar = monstruos[posicion1];
			monstruos[posicion1] = monstruos[posicion2];
			monstruos[posicion2] = monstruoAuxiliar;
		}
	}

	public void inicializarBatalla() {
		
		int i = 0;
		int j = 0;
		
		do {
			

			for (; i < humanos.length;) {
				if (humanos[i].isEstaVivo() == true) {
					break;
				} else {
					i++;
				}

			}

			for (; j < monstruos.length;) {
				if (monstruos[j].isEstaVivo() == true) {
					break;
				} 
				else {
					if (j != 19) {
						j++;
					}
					else {
						
					}
				}
			}
			
			humanos[i].setVida(humanos[i].getVida() - Utils.obtenerNumeroAzar(5, 25));
			monstruos[j].setVida(monstruos[j].getVida() - Utils.obtenerNumeroAzar(5, 25));
		

			if (monstruos[j].getVida() < 0) {
				monstruos[j].setEstaVivo(false);
			}
			if (humanos[i].getVida() < 0) {
				humanos[i].setEstaVivo(false);
			}
			
			
		} while (estanMuertos() == false);
	}

	public Humano[] getHumanos() {
		return humanos;
	}

	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}

	public Monstruo[] getMonstruos() {
		return monstruos;
	}

	public void setMonstruos(Monstruo[] monstruos) {
		this.monstruos = monstruos;
	}

	@Override
	public String toString() {
		return "CampoBatalla [humanos=" + Arrays.toString(humanos) + ", monstruos=" + Arrays.toString(monstruos) + "]";
	}

	public boolean estanMuertos() {

		for (int i = 0; i < humanos.length; i++) {

			if (humanos[i].isEstaVivo() == true) {
				return false;
			}
			
			if (humanos[humanos.length - 1].isEstaVivo() == false) {
				System.out.println("Han ganado los monstruos.");
				return true;
			}
			
			

		}

		for (int i = 0; i < monstruos.length; i++) {

			if (monstruos[i].isEstaVivo() == true) {
				return false;
			} 
			if (monstruos[monstruos.length - 1].isEstaVivo() == false) {
				System.out.println("Han ganado los humanos.");
				return true;
			}

		}

		return true;
	}

}
