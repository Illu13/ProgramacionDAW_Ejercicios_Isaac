package pruebas;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Scanner;

import capitulo04.bloque04.Utils;

public class Bolos {

	public static void main(String[] args) {
		
		String ejemplo = Utils.obtenerStringPorJOptionPaneConDescripcion(null);
		
		Date fecha = Utils.parseoFecha(ejemplo);
		
		System.out.println(fecha);

	
	}

}
