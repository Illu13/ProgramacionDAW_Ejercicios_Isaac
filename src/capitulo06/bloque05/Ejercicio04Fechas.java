package capitulo06.bloque05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import capitulo04.bloque04.Utils;

public class Ejercicio04Fechas {

	public static void main(String[] args) {

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		String fecha = Utils
				.obtenerStringPorJOptionPaneConDescripcion("Introduzca una fecha en este formato dd/MM/yyyy HH:mm:ss");

		Date fechaParseada = null;

		try {
			fechaParseada = formatoFecha.parse(fecha);
		} catch (ParseException e) {
			System.out.println("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaParseada);
 
		
		
		
		System.out.println(formatoFecha.format(fechaParseada));
		System.out.println(calendar.getTime());
		
		System.out.println(fechaParseada.getYear());
		System.out.println(fechaParseada.getMonth());
		System.out.println(fechaParseada.getDate());
		System.out.println(fechaParseada.getHours());
		System.out.println(fechaParseada.getMinutes());
		System.out.println(fechaParseada.getSeconds());
		System.out.println(fechaParseada.getTime());
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.getTimeInMillis());
		
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, -3);
		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.WEEK_OF_MONTH, 2);
		calendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, -300);
		calendar.add(Calendar.YEAR, 4);
		System.out.println(calendar.getTime());
	}

}
