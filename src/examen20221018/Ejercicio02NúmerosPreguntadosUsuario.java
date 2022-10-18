package examen20221018;

import javax.swing.JOptionPane;

public class Ejercicio02NúmerosPreguntadosUsuario {

	public static void main(String[] args) {

//		Primero crearemos un bucle y una variable para pedir esos 10 números.
		int limbajo;
		int limalto;
//		Con los strings y los JOptionPane, pediremos los límites, en este caso el superior.
		String limitealto;
		limitealto = JOptionPane.showInputDialog("Introduzca un límite superior.");
		limalto = Integer.parseInt(limitealto);
//		En este caso el inferior.
		String limitebajo;
		limitebajo = JOptionPane.showInputDialog("Introduzca un límite inferior.");
		limbajo = Integer.parseInt(limitebajo);
//		Ahora usaremos el bucle while, para de esta manera asegurarnos de que el límite bajo sea inferior a 0.
		while (limbajo > 0) {
			limitebajo = JOptionPane.showInputDialog("Introduzca un límite inferior.");
			limbajo = Integer.parseInt(limitebajo);
		}
//		Hacemos lo mismo con el límite superior, para que se repita todas las veces que haga falta usamos el while.
		while (limalto < 0) {
			limitealto = JOptionPane.showInputDialog("Introduzca un límite superior.");
			limalto = Integer.parseInt(limitealto);
		}
//		Una vez hayamos hecho estas comprobaciones y el usuario haya introducido los límites establecidos entre los números establecimos, imprimiremos los números con este bucle.

		for (int i1 = 0; i1 < 10; i1++) {
			int numero = ((int) Math.round(Math.random() * (limalto - limbajo))) + limbajo;
			System.out.println(numero);
		}
	}
}
