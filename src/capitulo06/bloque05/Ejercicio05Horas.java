package capitulo06.bloque05;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05Horas {

	public static void main(String[] args) {
		Calendar ahoraEnWashinton = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		
		int horaEnWashinton = ahoraEnWashinton.get(Calendar.HOUR_OF_DAY);
		int horaEnItalia = ahoraEnItalia.get(Calendar.HOUR_OF_DAY);
		int hora = horaEnItalia - horaEnWashinton;
		
	
		
		System.out.println("Horas: " + hora);

	}

}
