package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
//	4º.- Escribe un programa que lea el importe de una compra y la cantidad recibida y calcule el cambio a devolver, teniendo en cuenta que el número de monedas que se devuelven debe ser mínimo. Suponer que el sistema monetario utilizado consta de monedas de 100, 50, 25, 5, y 1 unidad. El precio viene dado en unidades monetarias enteras.
//	Ejemplo: Pagamos con 2000 unidades monetarias un articulo que nos cuesta 375 unidades monetarias, la vuelta (1625 u) debería de ser de la siguiente forma:
//	- 16 monedas de 100 = 1600
//	- 1 moneda de 25 = 25

	public static void main(String[] args) {
		

		String precioCompra;
		precioCompra = JOptionPane.showInputDialog("Introduzca el precio de la compra");
		int precio = Integer.parseInt(precioCompra);
		String dineroPagar;
		dineroPagar = JOptionPane.showInputDialog("Introduzca con cuanto dinero vas a pagar");
		int dinero = Integer.parseInt(dineroPagar);
		
		int vuelta = dinero - precio;
		
		System.out.println("Necesitarás dar estas monedas de 100: " + vuelta / 100);
		System.out.println("Necesitarás dar estas monedas de 50: " + (vuelta % 100) / 50);
		System.out.println("Necesitarás dar estas monedas de 25: " + ((vuelta % 100) % 50) / 25);
		System.out.println("Necesitarás dar estas monedas de 5: " + (((vuelta % 100) % 50) % 25) / 5);
		System.out.println("Necesitarás dar estas monedas de 1: " + ((((vuelta % 100) % 50) % 25) % 5) / 1);
		
//		Te mando ambas y así no me siento mal conmigo mismo XD.
//		System.out.println("Necesitarás dar estas monedas de 100: " + vuelta / 100);
//		vuelta = vuelta % 100;
//		System.out.println("Necesitarás dar estas monedas de 50: " + vuelta / 50);
//		vuelta = vuelta % 50;
//		System.out.println("Necesitarás dar estas monedas de 25: " + vuelta / 25);
//		vuelta = vuelta % 25;
//		System.out.println("Necesitarás dar estas monedas de 5: " + vuelta /5);
//		vuelta = vuelta % 5;
//		System.out.println("Necesitarás dar estas monedas de 1: " + vuelta/1);
//		
	
	}

}
