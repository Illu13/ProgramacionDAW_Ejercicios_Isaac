package capitulo05.simulacroExamen2;



public class Juego {

	public static void main(String[] args) {
		
		CampoBatalla campoBatalla = new CampoBatalla();
	
		System.out.println(campoBatalla.toString());
		campoBatalla.mezclarHumanos();
		campoBatalla.mezclarMonstruos();
		campoBatalla.inicializarBatalla();
		System.out.println(campoBatalla.toString());
		
	}

}
