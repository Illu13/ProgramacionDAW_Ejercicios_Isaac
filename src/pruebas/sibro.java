package pruebas;

import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

public class sibro {

	public static void main(String[] args) {
		
		int sexo = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Sexo");
		int dividendo = sexo;
		
		while (dividendo > 0) {
			if (sexo % dividendo == 0) {
				System.out.println(dividendo + " es divisor de " + sexo);
			}
			dividendo --;
		}
		
	}

}
