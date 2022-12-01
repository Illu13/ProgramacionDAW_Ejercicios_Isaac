package capitulo05.simulacroExamen;

public class Poker {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Jugador[] jugadores = new Jugador [5];
		
		
		System.out.println(baraja.toString());
		System.out.println(" ");
		baraja.desplazamientoCircular();
		System.out.println(baraja.toString());
		baraja.desplazamientoCircular2();
		System.out.println(baraja.toString());
		baraja.mezclarCartas();
		System.out.println(baraja.toString());
		baraja.ordenarCartas();
		System.out.println(baraja.toString());
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador();
		} 
		System.out.println(baraja.darCartasYNombre(jugadores));
		
		
	}

}
