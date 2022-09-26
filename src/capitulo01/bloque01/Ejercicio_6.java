package capitulo01.bloque01;
import javax.swing.JOptionPane;

public class Ejercicio_6 {
	
//	Realiza un ejercicio en Java para el cálculo de la cuota mensual de una hipóteca 

	public static void main(String[] args) {
		
		
		String euribor1;
			euribor1 = JOptionPane.showInputDialog("¿Cuál es el euribor?");
				float euribor = Float.parseFloat(euribor1);
			String diferencial1;
			diferencial1 = JOptionPane.showInputDialog("¿Cuál es el diferencial?"); 
		float diferencial = Float.parseFloat(diferencial1);
			String capital1;
				capital1 = JOptionPane.showInputDialog("¿Cuál es el capital?");
		float capital = Float.parseFloat(capital1);
			String plazos1;
				plazos1 = JOptionPane.showInputDialog("¿Cuál es el número de plazos mensuales?");
		int plazos = Integer.parseInt(plazos1);
		
		float interesa = (euribor + diferencial);
		
		float interesm = ((interesa/12)/100);
		
		System.out.println("Tu cuota mensual es: " + (capital * (interesm * Math.pow((1 + interesm), plazos))/(Math.pow((1+interesm), plazos)-1)));
		
		
		
		
		
		
		
		
		
		
	}

}
