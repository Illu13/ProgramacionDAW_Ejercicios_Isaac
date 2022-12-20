package examen20221213;


import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

public class Juego {

	public static void main(String[] args) {

		do {

			Ladrillo[] ladrillos = new Ladrillo[20];
			Ladrillo[] ladrillosRotos = new Ladrillo[20];

			String colores[] = new String[] { "rojo", "verde", "azul" };

			Pelota pelota = new Pelota();

			for (int i = 0; i < ladrillos.length; i++) {
				ladrillos[i] = new Ladrillo();
			}

			for (int i = 0; i < ladrillos.length; i++) {
				ladrillos[i].setX(Utils.obtenerNumeroAzar(0, 800));
				ladrillos[i].setY(Utils.obtenerNumeroAzar(0, 500));
				ladrillos[i].setAlto(50);
				ladrillos[i].setAncho(100);
				ladrillos[i].setPuntosVida(Utils.obtenerNumeroAzar(1, 3));

				if (ladrillos[i].getPuntosVida() == 1) {
					ladrillos[i].setColor(colores[Utils.obtenerNumeroAzar(0, colores.length - 1)]);
				} else {
					if (ladrillos[i].getPuntosVida() == 2) {
						ladrillos[i].setColor("Plateado");
					}

					if (ladrillos[i].getPuntosVida() == 3) {
						ladrillos[i].setColor("Dorado");
					}
				}
				ladrillos[i].setRoto(false);

			}

			do {

				pelota.setX(Utils.obtenerNumeroAzar(0, 900));
				pelota.setY(Utils.obtenerNumeroAzar(0, 600));

				
				
				for (int i = 0; i < ladrillos.length; i++) {
					if (ladrillos[i] != null && pelota.getX() >= ladrillos[i].getX() &&
						pelota.getX() <= (ladrillos[i].getX() + ladrillos[i].getAncho()) &&
						pelota.getY() >= ladrillos[i].getY() &&
						pelota.getY() <= (ladrillos[i].getY() + ladrillos[i].getAlto())) {

						ladrillos[i].setPuntosVida(ladrillos[i].getPuntosVida() - 1);

						if (ladrillos[i].getPuntosVida() == 0) {
							ladrillos[i].setRoto(true);

							for (int j = 0; j < ladrillosRotos.length; j++) {
								if (ladrillosRotos[j] == null) {
									ladrillosRotos[j] = ladrillos[i];
									ladrillosRotos[j].setOrdenMuerte(j + 1);
									break;
								}

							}

							ladrillos[i] = null;

						}

					}

				}
				
				System.out.println(pelota.toString());
				
				System.out.println(" ");
				
				
				for (int i = 0; i < ladrillos.length; i++) {
					if (ladrillos[i] != null) {
						System.out.println(ladrillos[i].toString());
					}
				}

				System.out.println(" ");
				

			} while (ladrillosRotos(ladrillos) == false);

			System.out.println("El primer ladrillo destruido fue: " + ladrillosRotos[0]);
			System.out.println(" ");
			System.out.println("El último ladrillo destruido fue: " + ladrillosRotos[ladrillosRotos.length - 1]);
			System.out.println(" ");

			System.out.println("El orden en el que se rompieron todos los ladrillos fue: ");

			System.out.println(" ");

			for (int i = 0; i < ladrillosRotos.length; i++) {
				System.out.println(ladrillosRotos[i].toString());
			}

		} while (!(JOptionPane.showInputDialog("¿Quieres volver a iniciar el programa? Pulse 'Aceptar' para volver a repetir"
				+ " o ponga cualquier otra cosa si quiere que no se repita. ") == null));

	}

	/**
	 * 
	 * @param ladrillos
	 * @return
	 */

	public static boolean ladrillosRotos(Ladrillo[] ladrillos) {

		for (int i = 0; i < ladrillos.length; i++) {
			if (ladrillos[i] != null && ladrillos[i].isRoto() == false) {
				return false;
			}
		}

		return true;

	}

}
