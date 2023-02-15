package examen20230209;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import capitulo06.bloque04.EjemploFicheroPropiedades;

public class LectorPropiedadesFichero {
	
	private static Properties propiedades = null;

	public LectorPropiedadesFichero () {
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/capitulo06/bloque04/ejemplo.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}
	
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	public static Boolean getBooleanProperty (String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
		
	}
	
	
	

	public static void main(String[] args) {
		
		String usuario = EjemploFicheroPropiedades.getProperty("USUARIO");
		String mes = EjemploFicheroPropiedades.getProperty("MES");
		String marca = EjemploFicheroPropiedades.getProperty("MARCA");
		String jefe = EjemploFicheroPropiedades.getProperty("JEFE");
		String id = EjemploFicheroPropiedades.getProperty("ID");
		String password = EjemploFicheroPropiedades.getProperty("PASSWORD");
		String idOrdenador = EjemploFicheroPropiedades.getProperty("ID_ORDENADOR");
		String dia = EjemploFicheroPropiedades.getProperty("DIA");
		
		System.out.println("Usuario leído del fichero de propiedades: " + usuario);
		System.out.println("Mes leído del fichero de propiedades: " + mes);
		System.out.println("Marca leído del fichero de propiedades: " + marca);
		System.out.println("Jefe leído del fichero de propiedades: " + jefe);
		System.out.println("Id leído del fichero de propiedades: " + id);
		System.out.println("Password leído del fichero de propiedades: " + password);
		System.out.println("Id ordenador leído del fichero de propiedades: " + idOrdenador);
		System.out.println("Dia leído del fichero de propiedades: " + dia);

	}


}
