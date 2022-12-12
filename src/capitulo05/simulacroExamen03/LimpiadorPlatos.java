package capitulo05.simulacroExamen03;

import capitulo04.bloque04.Utils;
public class LimpiadorPlatos {

	public static void main(String[] args) {
		
		 Platos[] platos = new Platos[5];
		 Platos[] platosLimpios = new Platos[5];
		 
			for (int i = 0; i < platos.length; i++) {
				int suciedad =  Utils.obtenerNumeroAzar(10, 100);
				int dureza = Utils.obtenerNumeroAzar(1, 3);
				platos[i] = new Platos(i,suciedad, dureza, suciedad * dureza, false);
			}
		
			for (int i = 0; i < platos.length; i++) {
				System.out.println(platos[i].toString());
			}
			
			System.out.println(" ");
			
			for (int i = platos.length - 1; i != -1; i--) {
				if (seRompe() == true) {
					platos[i].setRoto(true);
					platos[i] = null;
					
				}
				else {
					platos[i].setSuciedadReal(platos[i].getSuciedadReal() - Utils.obtenerNumeroAzar(20, 40));
					
					if (platos[i].getSuciedadReal() <= 0) {
						platosLimpios[i] = platos[i];
						platos[i] = null;
					}
					else { 
						i++;
					}
				}
 				
				
				
				for (int k = 0; k < platos.length; k++) {
					if (platos[k] == null) {
						
					}
					else {
					System.out.println(platos[k].toString());
					}
				}
				
				System.out.println(" ");
			}
			
			for (int k = 0; k < platosLimpios.length; k++) {
				if (platosLimpios[k] == null) {
					
				}
				else {
				System.out.println(platosLimpios[k].toString());
				}
			}

	}
	
	public static boolean seRompe () {
		
		if (Math.random() >= 0.90) {
			return true;
		}
		
		return false;
	}

}
