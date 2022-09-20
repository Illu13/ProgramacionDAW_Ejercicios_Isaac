import javax.swing.JOptionPane;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero1;
		String numero2;
		String numero3;
		
		numero1 = JOptionPane.showInputDialog("Introduzca un número entero");
		numero2 = JOptionPane.showInputDialog("Introduzca un número decimal");
		numero3 = JOptionPane.showInputDialog("Introduzca otro número entero");
		
		int num1 = Integer.parseInt(numero1);
		float num2 = Float.parseFloat(numero2);
		Double num3 = Double.parseDouble(numero3);
		
		System.out.println(num1 + num2 + num3);
		
		
	}

}
