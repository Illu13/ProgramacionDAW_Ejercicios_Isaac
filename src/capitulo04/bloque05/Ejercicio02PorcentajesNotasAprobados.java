package capitulo04.bloque05;

import capitulo04.bloque04.UtilsArrays;

public class Ejercicio02PorcentajesNotasAprobados {
	public static void main(String[] args) {

		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		System.out.println("El porcentaje de notas aprobadas es: " + porcentajesNotas(array) + "%" + " y el porcentaje"
				+ " de notas suspensas es: " + (100 - porcentajesNotas(array)) + "%");

	}

	public static float porcentajesNotas(int[] array) {

		float notasAprobadasContador = 0;
		float notasAprobadas = 0;
		

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 5) {
				
			} else {
				notasAprobadas += array[i];
				notasAprobadasContador += 1;
			}

		}

		return (notasAprobadasContador / array.length) * 100;
		

	}
}
