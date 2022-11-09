package pruebas;
import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

public class Hola_Mundo {

	public static void main(String[] args) {
	
	int num = Utils.obtenerEnteroPorJOptionPaneEntreLimitesYDescripcion(1, 3, "sexo");
	

	
	
	System.out.println("La media aritmética de esos 3 números es: " + num);
	
	}

}
