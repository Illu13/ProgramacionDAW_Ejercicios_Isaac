package capitulo05.bloque02Herencia;

import javax.swing.JOptionPane;

import capitulo04.bloque04.Utils;

public class Tienda {

	public static void main(String[] args) {
		
		ArticulosPerecederos array1[] = new ArticulosPerecederos[2];
		ArticulosNoPerecederos array2[] = new ArticulosNoPerecederos[2];
 		
		for (int i = 0; i < 2; i++) {
			JOptionPane.showMessageDialog(null, "Introduzca los datos del artículo perecedero.");
			String codigo = JOptionPane.showInputDialog("¿Cuál es el código del artículo?");
			String nombre = JOptionPane.showInputDialog("¿Cuál es el nombre del artículo?");
			float precio = Utils.obtenerFloatPorJOptionPaneConDescripcion("¿Cuál es el precio del artículo?");
			String fecha = JOptionPane.showInputDialog("¿Cuándo caduca?");
			 ArticulosPerecederos art1 = new ArticulosPerecederos(codigo, nombre, precio, fecha);
			array1[i] = art1;
		}
		
		for (int i = 0; i < 2; i++) {
			JOptionPane.showMessageDialog(null, "Introduzca los datos del artículo no perecedero.");
			String codigo = JOptionPane.showInputDialog("¿Cuál es el código del artículo?");
			String nombre = JOptionPane.showInputDialog("¿Cuál es el nombre del artículo?");
			float precio = Utils.obtenerFloatPorJOptionPaneConDescripcion("¿Cuál es el precio del artículo?");
			String etiqueta = JOptionPane.showInputDialog("¿Cuál es la etiqueta?");
			ArticulosNoPerecederos art2 = new ArticulosNoPerecederos(codigo, nombre, precio, etiqueta);
			array2[i] = art2;
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i].toString());
		}

	}

}
