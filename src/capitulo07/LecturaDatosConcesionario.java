package capitulo07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.UpdatableResultSet;

import capitulo04.bloque04.Utils;

public class LecturaDatosConcesionario {
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			pruebaConsultaPorFicheroDePropiedades();
		} while(true);
	}

	
	/**
	 * 
	 */
	private static void pruebaConsultaPorFicheroDePropiedades() {
		String marca = null;
		String cif = null;
		int id = 0;
		
		try {

			int opcion = Utils.obtenerEnteroPorJOptionPaneConDescripcion(
					"0.-Salir" + "\n1.-Ver todos los registros" + "\n2.-Insertar un registro"
					+ "\n3.-Modificar un registro"
					+ "\n4.-Eliminar un registro"
					+ "\nIntroduzca una opción.");

			Connection conn = getConnection();

			switch (opcion) {
			case 0:
				conn.close();
				System.exit(0);

			case 1:
				verRegistros(conn);
				conn.close();
				break;
				
			case 2:
				cif = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el CIF" + " del nuevo fabricante");
				marca = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre del nuevo fabricante");
				insertarRegistro(conn, cif, marca);
				conn.close();
				break;
				
			case 3:
				 id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del registro "
				 		+ "a modificar");
				 cif = Utils
						.obtenerStringPorJOptionPaneConDescripcion("Introduzca el CIF" + " del fabricante");
				 marca = Utils
						.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre del fabricante");
				 
				 if (cif.isEmpty()) {
					 cif = tenerNombreIDActual(conn, id);
				 }
				 if (marca.isEmpty()) {
					 marca = tenerMarcaIDActual(conn, id);
				 }
				
				 updateRegistro(conn, cif, marca, id);
				 conn.close();
				 break;
				 
			case 4 :
				id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del registro "
				 		+ "a borrar");
				
				deleteRegistro(conn, id);
				conn.close();
				break;	
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		} catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}

	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");


		Class.forName(driver);


		return DriverManager.getConnection("jdbc:mysql://" + host + "/" + schema + properties, user, password);

	}
	
	

	public static void verRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");


		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}


		rs.close();
		s.close();

	}

	/**
	 * 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public static int escogerPrimerIDDisponible(Connection conn) throws SQLException {

		int idDisponible = 0;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from fabricante");

		while (rs.next()) {
			idDisponible = rs.getInt(1);

		}

		rs.close();
		s.close();

		return idDisponible + 1;

	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	
	public static String tenerMarcaIDActual(Connection conn, int id) throws SQLException {

		String nombre = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select nombre from fabricante where id = " + id);

		while (rs.next()) {
			nombre = rs.getString(1);

		}

		rs.close();
		s.close();

		return nombre;

	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	
	public static String tenerNombreIDActual(Connection conn, int id) throws SQLException {

		String nombre = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select cif from fabricante where id = " + id);

		while (rs.next()) {
			nombre = rs.getString(1);


		}

		rs.close();
		s.close();

		return nombre;

	}


	/**
	 * 
	 * @param conn
	 * @param cif
	 * @param modelo
	 * @throws SQLException
	 */
	public static void insertarRegistro(Connection conn, String cif, String modelo) throws SQLException {

		int id = escogerPrimerIDDisponible(conn);

		Statement s = (Statement) conn.createStatement();
		int filasAlteradas = s.executeUpdate("insert into tutorialjavacoches.fabricante (id, cif, nombre) values (" + id
				+ "," + "'" + cif + "', " + "'" + modelo + "')");

		s.close();

		System.out.println(filasAlteradas);

	}

	/**
	 * 
	 * @param conn
	 * @param cif
	 * @param modelo
	 * @param id
	 * @throws SQLException
	 */
	public static void updateRegistro(Connection conn, String cif, String modelo, int id) throws SQLException {


		Statement s = (Statement) conn.createStatement();
		int filasAlteradas = s.executeUpdate("update tutorialjavacoches.fabricante set cif = " + "'" + cif
				+ "'" + ", nombre =" + "'" + modelo + "'" + "where id = " + id);
		s.close();

		System.out.println(filasAlteradas);

	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @throws SQLException
	 */
	public static void deleteRegistro(Connection conn, int id) throws SQLException {


		Statement s = (Statement) conn.createStatement();
		int filasAlteradas = s.executeUpdate("delete from tutorialjavacoches.fabricante where id = " + id);
		

		s.close();

		System.out.println(filasAlteradas);

	}

}
