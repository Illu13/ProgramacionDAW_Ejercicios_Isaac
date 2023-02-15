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
	
	public static int EscogerPrimerIDDisponible(Connection conn) throws SQLException {

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
	
	public static void realizaDelete (Connection conn, int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.cliente where id = ?");
		
		ps.setInt(1, id);
		
		int filasAlteradas = ps.executeUpdate();
		
	
	   
		System.out.println("Filas afectadas: " + filasAlteradas);
		
		ps.close();
	}
	
	public static void UpdateRegistro(Connection conn, int id, String nombre, String apellidos,
			String localidad, String dni, String fechaNac, boolean activo) throws SQLException {
		
		Date fecha = Utils.parseoFecha(fechaNac);
		
		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
		
		PreparedStatement ps = conn.prepareStatement(
				"update tutorialjavacoches.cliente set nombre = ?, apellidos = ?, "
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
	
	public static void realizaInsert (Connection conn, String nombre, String apellidos, String localidad, String
			dni, String fechaNac, boolean activo) throws SQLException {
		
		Date fecha = Utils.parseoFecha(fechaNac);
		
		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
		
		
		PreparedStatement ps = conn.prepareStatement(
				"insert into tutorialjavacoches.cliente "
				+ "(id, nombre, apellidos, localidad, dniNie, fechaNac, activo) "
				+ "values (?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, EscogerPrimerIDDisponible(conn));
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
	
	
	public static void VerRegistros(Connection conn) throws SQLException {

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
