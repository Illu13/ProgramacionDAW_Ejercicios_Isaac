package capitulo05.bloque01;

import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

public class Ejercicio01GestionPersonas {

	public static void main(String[] args) {
		
		Persona personas[] = new Persona[3];
		
		do {	
			
			int opcion = Utils.obtenerEnteroPorJOptionPaneConDescripcion("1.-Salir" + 
					"\n2.-Introducir datos de persona" + 
					"\n3.-Ver las personas introducidas"
					+ "\nIntroduzca una opción.");
			
			switch (opcion) {
			
			case 1: 
				System.exit(0);
				break;
			
			case 2: 
				for (int i = 0; i < personas.length; i++) {
				
				String nombre = JOptionPane.showInputDialog("¿Cómo se llama?");
				String apellido = JOptionPane.showInputDialog("¿Cómo se apellida?");
				String dni = JOptionPane.showInputDialog("¿Cuál es su dni?");
				String direccion = JOptionPane.showInputDialog("¿Dónde vive?");
				int numero;
				numero = Utils.obtenerEnteroPorJOptionPaneConDescripcion("¿Cuál es su número?");
				Persona per = new Persona(nombre, apellido, dni, direccion, numero);
				personas[i] = per;

				}
				break;
				
			case 3:

				for (int i = 0; i < personas.length; i++) {
					System.out.println(personas[i].toString());
				}
				break;
			}	
		} while (true);

		

	}

}
