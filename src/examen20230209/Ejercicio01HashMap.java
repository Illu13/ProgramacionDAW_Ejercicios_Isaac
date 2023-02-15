package examen20230209;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import capitulo06.bloque04.EjemploFicheroPropiedades;

public class Ejercicio01HashMap {
//	
//	(2 puntos) Crea un fichero de propiedades, asígnale al menos cuatro propiedades con cualquier nombre
//	pero cuyo valor sea numérico. Asígnale también cuatro propiedades con cualquier nombre pero con valor
//	de tipo String. Lee el fichero de propiedades y pasa todas las propiedades leídas a un objeto de tipo
//	Hashmap<String, Object>. Extrae todos los objetos almacenados en el Hashmap, localiza sólo aquellos
//	cuyo valor sea numérico y pasa estos valores a un objeto de tipo List<Integer>.

	public static void main(String[] args) {

		String usuario = EjemploFicheroPropiedades.getProperty("USUARIO");
		String mes = EjemploFicheroPropiedades.getProperty("MES");
		String marca = EjemploFicheroPropiedades.getProperty("MARCA");
		String jefe = EjemploFicheroPropiedades.getProperty("JEFE");
		String id = EjemploFicheroPropiedades.getProperty("ID");
		String password = EjemploFicheroPropiedades.getProperty("PASSWORD");
		String idOrdenador = EjemploFicheroPropiedades.getProperty("ID_ORDENADOR");
		String dia = EjemploFicheroPropiedades.getProperty("DIA");

		HashMap<String, Object> hm = new HashMap<String, Object>();
		List<Integer> numeros = new ArrayList<Integer>();

		hm.put(usuario, null);
		hm.put(mes, null);
		hm.put(marca, null);
		hm.put(jefe, null);
		hm.put(id, null);
		hm.put(password, null);
		hm.put(idOrdenador, null);
		hm.put(dia, null);

		System.out.println("\nRecorrido del fichero de propiedades:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(claves[i]);
		}
	

		for (int i = 0; i < claves.length; i++) {
			if (Character.isDigit(((String) claves[i]).charAt(1))) {
				int numeroParseado = Integer.parseInt((String) claves[i]);
				numeros.add(numeroParseado);

			}
			else {
				
			}

		}
		System.out.println(" ");
		System.out.println(" ");
		
		for (Integer c : numeros) {
			System.out.println(c);
		}	
	}
}
