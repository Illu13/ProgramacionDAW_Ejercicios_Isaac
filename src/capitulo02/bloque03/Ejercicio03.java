package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
//	3º.- Realiza un programa que resuelva lo siguientes puntos:
//        a.- Que muestre un menú en pantalla con opciones para:
//                    1. Cálculo de la hipotenusa de un triángulo.
//                    2. Cálculo de la superficie de una circunferencia.
//                    3. Cálculo del perímetro de una circunferencia.
//                    4. Cálculo del área de un rectángulo.
//                    5. Cálculo del área de un triángulo.
//                    0. Salir de la aplicación.
//        b.- En la opción "1" debe pedir dos datos, correspondientes a las longitudes de los dos catetos de un triángulo. Se debe imprimir la longitud de la hipotenusa. Recuerda que Hipotenusa al cuadrado = cateto1 al cuadrado + cateto2 al cuadrado.
//        c.- En la opción "2" debe pedir la longitud del radio de una circunferencia e imprimir la superficie de la misma. Recuerda que el área es igual a PI por el radio al cuadrado. Recuerda también que PI es igual a 3,1416.
//        d.- En la opción "3" debe pedir la longitud del radio de una circunferencia e imprimir la longitud del perímetro de la misma. Recuerda que la longitud de la circunferencia = 2 por PI por el radio.
//        e.- En la opción "4" debe pedir las longitudes de la base y la altura de un rectángulo, e imprimir el área de dicho rectángulo. Recuerda que el área del rectángulo es igual a la base por la altura.
//        f.- En la opción "5" debe pedir la base y la altura de un tríangulo e imprimir el área del mismo. Recuerda que el área del triángulo es la mitad del área del rectángulo de igual base y altura.
//        g.- Tras mostrar el resultado de cada opción, el programa debe hacer una pausa (para poder observar el resultado), y volver a pintar el menú. Esto se repetirá siempre que la opción no sea "0", en cuyo caso el programa acabará.
//        h.- Si la opción no fuese "0", "1", "2", "3", "4" o "5", el programa deberá dar el mensaje de "opción incorrecta" y volverá a mostrar el menú.

	public static void main(String[] args) {
		
		String opcion1;
		String cateto12;
		String cateto22;
		String radioCirculo12;
		String radioCirculo22;
		String baseRectangulo12;
		String baseRectangulo22;
		String baseTriangulo12;
		String alturaTriangulo22;
		
		System.out.println("1-Cálculo hipotenusa triángulo");
		System.out.println("2-Cálculo superficie circunferencia");
		System.out.println("3-Cálculo perímetro circunferencia");
		System.out.println("4-Calculo área rectángulo");
		System.out.println("5-Cálculo área triángulo");
		System.out.println("0-Salir de la aplicación");
		opcion1 = JOptionPane.showInputDialog("¿Qué quieres calcular?");
		int opcion = Integer.parseInt(opcion1);
				
		switch (opcion) {
		
		case 1:
		cateto12 = JOptionPane.showInputDialog("Introduzca cuanto mide el primer cateto");
		cateto22 = JOptionPane.showInputDialog("Introduzca cuanto mide el segundo cateto");
		double cateto1 = Double.parseDouble(cateto12);
		double cateto2 = Double.parseDouble(cateto22);
		System.out.println("La hipotenusa del triángulo es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		break;
		
		case 2: 
		radioCirculo12 = JOptionPane.showInputDialog("Introduzca el radio del círculo");
		double radioCirculo1 = Double.parseDouble(radioCirculo12);
		System.out.println("La superficie de la circunferencia es: " + Math.PI * Math.pow(radioCirculo1, 2));
		break;
		
		case 3:
		radioCirculo22 = JOptionPane.showInputDialog("Introduzca el radio del círculo");
		double radioCirculo2 = Double.parseDouble(radioCirculo22);
		System.out.println("El perímetro de la circunferencia es: " + 2 * Math.PI * radioCirculo2);
		break;
		
		case 4:
		baseRectangulo12 = JOptionPane.showInputDialog("Introduzca la base del rectángulo");
		double baseRectangulo1 = Double.parseDouble(baseRectangulo12);
		baseRectangulo22 = JOptionPane.showInputDialog("Introduzca la altura del rectángulo");
		double alturaRectangulo1 = Double.parseDouble(baseRectangulo22);
		System.out.println("El área del rectángulo es: " + baseRectangulo1 * alturaRectangulo1);
		break;
		
		case 5: 
		baseTriangulo12 = JOptionPane.showInputDialog("Introduzca la base del triángulo");
		double baseTriangulo1 = Double.parseDouble(baseTriangulo12);
		alturaTriangulo22 = JOptionPane.showInputDialog("Introduzca la altura del triángulo");
		double alturaTriangulo1 = Double.parseDouble(alturaTriangulo22);
		System.out.println("La base del triángulo es: " + (baseTriangulo1 * alturaTriangulo1) / 2);
		break;
		
		case 0: 
		return;
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
