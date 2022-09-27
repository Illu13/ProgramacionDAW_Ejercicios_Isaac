package capitulo02.bloque01;

import javax.swing.JOptionPane;

//5º.- Pedir al usuario cinco números, e imprimir posteriormente el mayor valor introducido y el menor valor introducido.


public class Ejercicio05 {

	public static void main(String[] args) {
		String numero1;
		String numero2;
		String numero3;
		String numero4;
		String numero5;

		numero1 = JOptionPane.showInputDialog("Introduzca un número");
		numero2 = JOptionPane.showInputDialog("Introduzca un número");
		numero3 = JOptionPane.showInputDialog("Introduzca un número");
		numero4 = JOptionPane.showInputDialog("Introduzca un número");
		numero5 = JOptionPane.showInputDialog("Introduzca un número");

		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		int num3 = Integer.parseInt(numero3);
		int num4 = Integer.parseInt(numero4);
		int num5 = Integer.parseInt(numero5);
		
		
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("Este es el número más pequeño: " + num1);
		}
			else { if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) 
				System.out.println("Este es el número más grande: " + num1);
			}
		
		
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("Este es el número más pequeño: " + num2);
					}
					
						else { if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) 
						System.out.println("Este es el número más grande: " + num2);
					}
			
			
			
						if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
							System.out.println("Este es el número más pequeño: " + num3);
							}
							else { if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) 
								System.out.println("Este es el número más grande: " + num3);
							}
										
								if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
									System.out.println("Este es el número más pequeño: " + num4);
									}
								
									 else { if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5)
											System.out.println("Este es el número más grande: " + num4);
									 }
										 
										 
										if (num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
											System.out.println("Este es el número más pequeño: " + num5);
											}
												else { if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1) 
													System.out.println("Este es el número más grande: " + num5);
										}


	}

}
