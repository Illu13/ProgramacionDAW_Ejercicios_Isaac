package capitulo02.bloque01;
import javax.swing.JOptionPane;
public class Ejercicio07 {

	public static void main(String[] args) {
		
		String numero;
		
		numero = JOptionPane.showInputDialog("Introduzca un número");
		int num = Integer.parseInt(numero);
		
		if ((num & 1) == 1) { System.out.println("Es un número impar.");
		
		}
			else { if ((num & 1) == 0) System.out.println("Es un número par");
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
