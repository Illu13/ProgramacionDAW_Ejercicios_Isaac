package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorFabricante {
	
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
	 * @param cif
	 * @param modelo
	 * @throws SQLException
	 */

	public static void InsertarRegistro(Connection conn, String cif, String modelo) throws SQLException {

		int id = escogerPrimerIDDisponible(conn);

		PreparedStatement ps = conn.prepareStatement(
				"insert into tutorialjavacoches.fabricante " + "(id, cif, nombre) " + "values (?, ?, ?)");

		ps.setInt(1, escogerPrimerIDDisponible(conn));
		ps.setString(2, cif);
		ps.setString(3, modelo);

		
		
		int filasAlteradas = ps.executeUpdate();
		
		ps.close();

		System.out.println(filasAlteradas);

	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @param cif
	 * @param nombre
	 * @throws SQLException
	 */
	
	public static void updateRegistro(Connection conn, int id, String cif, String nombre) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(
				"update tutorialjavacoches.fabricante set cif = ?, nombre = ? where id = " + id);
		ps.setString(1, cif);
		ps.setString(2, nombre);


		int filasAlteradas = ps.executeUpdate();

		System.out.println(filasAlteradas);
		
		ps.close();

	}
	
	/**
	 * 
	 * @param conn
	 * @param id
	 * @throws SQLException
	 */
	
	public static void realizaDelete (Connection conn, int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.fabricante where id = ?");
		
		ps.setInt(1, id);
		
		int filasAlteradas = ps.executeUpdate();
		
	
	   
		System.out.println("Filas afectadas: " + filasAlteradas);
		
		ps.close();
	}
	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public static void verRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");

		// Navegaci�n del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		// Cierre de los elementos
		rs.close();
		s.close();

	}

}
