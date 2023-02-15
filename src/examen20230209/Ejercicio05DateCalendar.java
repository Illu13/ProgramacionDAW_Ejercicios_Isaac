package examen20230209;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class Ejercicio05DateCalendar {

	public static void main(String[] args) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");

		String fecha = "2023-02-09 10.30.27";

		Date fechaParseada = null;

		try {
			fechaParseada = formatoFecha.parse(fecha);
		} catch (ParseException e) {
			System.out.println("Error en el parseo de la fecha");
			e.printStackTrace();
		}

		System.out.println(formatoFecha.format(fechaParseada));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaParseada);

		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println(calendar.getTime());

		Calendar fechaCalendar = Calendar.getInstance();

		fechaCalendar.set(Calendar.YEAR, 2023);
		fechaCalendar.set(Calendar.MONTH, Calendar.JANUARY);
		fechaCalendar.set(Calendar.DAY_OF_MONTH, 26);
		fechaCalendar.set(Calendar.HOUR_OF_DAY, 10);
		fechaCalendar.set(Calendar.MINUTE, 30);
		fechaCalendar.set(Calendar.SECOND, 27);
		fechaCalendar.set(Calendar.MILLISECOND, 123);
		
		System.out.println(fechaCalendar.getTime());

		Calendar ahoraEnGalapagos = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Galapagos"));
		Calendar ahoraEnPortugal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Lisbon"));

		int horaEnGalapagos = ahoraEnGalapagos.get(Calendar.HOUR_OF_DAY);
		int horaEnPortugal = ahoraEnPortugal.get(Calendar.HOUR_OF_DAY);
		int hora = Math.abs(horaEnGalapagos - horaEnPortugal);

		System.out.println("Horas de diferencia entre Galápagos y Lisboa: " + hora);

	}

}
