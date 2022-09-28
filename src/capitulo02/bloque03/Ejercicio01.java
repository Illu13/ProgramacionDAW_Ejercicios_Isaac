package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	
//	1º.- Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla su traducción a nota de texto: muy deficiente, insuficiente, suficiente, bien, notable y sobresaliente. Debes realizar el ejercicio a través de una sentencia switch, no de if anidados.

	
	
	public static void main(String[] args) {
		
		String nota1;
		
		nota1 = JOptionPane.showInputDialog("Meta la nota del alumno");
		int nota = Integer.parseInt(nota1);
		
		switch (nota) {
		
		case 1:
		case 2:
			System.out.println("Muy insuficiente");
			break;
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
