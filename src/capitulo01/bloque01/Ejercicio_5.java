package capitulo01.bloque01;
import javax.swing.JOptionPane;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
//		5.- Realiza un programa en Java que pida dos variables al usuario, intercambie los valores de las dos variables y las muestre en pantalla ANTES y DESPUÉS del intercambio de valores.
		
		String var1;
		String var2;
		int num;
		var1 = JOptionPane.showInputDialog("Escriba un número");
		int num1 = Integer.parseInt(var1);
		System.out.println("Su primer número es: " + num1);
		var2 = JOptionPane.showInputDialog("Escriba otro número");
		int num2 = Integer.parseInt(var2);
		System.out.println("Su primer número es: " + num2);

		num = num1;
		num1 = num2;
		num2 = num;
		
		System.out.println("Tras el cambio del valor, este es el primer número:" +num1);
		System.out.println("Y este es el segundo número: " + num2);
	
		
		
		
		
				
				
				
		
		
		
			
		
		
		
		

	}

}
