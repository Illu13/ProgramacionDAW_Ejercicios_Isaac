package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

import capitulo04.bloque04.Utils;

public class ControladorCliente {
	
	/**
	 * 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */

	public static int escogerPrimerIDDisponible(Connection conn) throws SQLException {

		int idDisponible = 0;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from cliente");

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
	 * @throws SQLException
	 */

	public static void realizaDelete(Connection conn, int id) throws SQLException {

		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.cliente where id = ?");

		ps.setInt(1, id);

		int filasAlteradas = ps.executeUpdate();

		System.out.println("Filas afectadas: " + filasAlteradas);

		ps.close();
	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param localidad
	 * @param dni
	 * @param fechaNac
	 * @param activo
	 * @throws SQLException
	 */

	public static void updateRegistro(Connection conn, int id, String nombre, String apellidos, String localidad,
			String dni, String fechaNac, boolean activo) throws SQLException {

		Date fecha = Utils.parseoFecha(fechaNac);

		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());

		PreparedStatement ps = conn.prepareStatement("update tutorialjavacoches.cliente set nombre = ?, apellidos = ?, "
				+ "localidad = ?, dniNie = ?, fechaNac = ?, activo = ? where id = " + id);

		ps.setString(1, nombre);
		ps.setString(2, apellidos);
		ps.setString(3, localidad);
		ps.setString(4, dni);
		ps.setDate(5, fechaSql);
		ps.setBoolean(6, activo);

		int filasAlteradas = ps.executeUpdate();

		System.out.println(filasAlteradas);

		ps.close();

	}
	
	/**
	 * 
	 * @param conn
	 * @param nombre
	 * @param apellidos
	 * @param localidad
	 * @param dni
	 * @param fechaNac
	 * @param activo
	 * @throws SQLException
	 */

	public static void realizaInsert(Connection conn, String nombre, String apellidos, String localidad, String dni,
			String fechaNac, boolean activo) throws SQLException {

		Date fecha = Utils.parseoFecha(fechaNac);

		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());

		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.cliente "
				+ "(id, nombre, apellidos, localidad, dniNie, fechaNac, activo) " + "values (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, escogerPrimerIDDisponible(conn));
		ps.setString(2, nombre);
		ps.setString(3, apellidos);
		ps.setString(4, localidad);
		ps.setString(5, dni);
		ps.setDate(6, fechaSql);
		ps.setBoolean(7, activo);

		int filasAfectadas = ps.executeUpdate();

		System.out.println("Filas afectadas: " + filasAfectadas);

		ps.close();
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
		ResultSet rs = s.executeQuery("select nombre from cliente where id = " + id);

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
	
	public static String tenerApellidosIDActual(Connection conn, int id) throws SQLException {

		String nombre = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select apellidos from cliente where id = " + id);

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
	
	public static String tenerLocalidadIDActual(Connection conn, int id) throws SQLException {

		String nombre = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select localidad from cliente where id = " + id);

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
	
	public static String tenerDniIDActual(Connection conn, int id) throws SQLException {

		String nombre = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select dni from cliente where id = " + id);

		while (rs.next()) {
			nombre = rs.getString(1);

		}

		rs.close();
		s.close();

		return nombre;

	}
	
	public static Date tenerFechaNacIDActual(Connection conn, int id) throws SQLException {

		String fecha = null;
		java.sql.Date date = null;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select fechaNac from cliente where id = " + id);

		while (rs.next()) {
			date = rs.getDate(1);

		}

		rs.close();
		s.close();

		return date;

	}
	

	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */

	public static void verRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from cliente");

		// Navegaci�n del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5) + " " + rs.getDate(6) + " " + rs.getBoolean(7));
		}

		// Cierre de los elementos
		rs.close();
		s.close();

	}

}
