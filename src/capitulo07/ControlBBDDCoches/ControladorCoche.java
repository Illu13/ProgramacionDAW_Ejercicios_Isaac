package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class ControladorCoche {
	
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
	
	public static void VerRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from coche");

		// Navegaci�n del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getString(4)
			+ " " + rs.getString(5));
		}

		// Cierre de los elementos
		rs.close();
		s.close();

	}
	
	public static void realizaDelete (Connection conn, int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.coche where id = ?");
		
		ps.setInt(1, id);
		
		int filasAlteradas = ps.executeUpdate();
		
	
	   
		System.out.println("Filas afectadas: " + filasAlteradas);
		
		ps.close();
	}
	
	public static void UpdateRegistro(Connection conn, int id, int idFabricante, String bastidor,
			String modelo, String color) throws SQLException {
		

		
		PreparedStatement ps = conn.prepareStatement(
				"update tutorialjavacoches.coche set idFabricante = ?, bastidor = ?, "
				+ "modelo = ?, color = ? where id = " + id);
	
		ps.setInt(1, idFabricante);
		ps.setString(2, bastidor);
		ps.setString(3, modelo);
		ps.setString(4, color);


		int filasAlteradas = ps.executeUpdate();

		System.out.println(filasAlteradas);
		
		ps.close();

	}
	
	public static void realizaInsert (Connection conn, int idFabricante, String bastidor,
			String modelo, String color) throws SQLException {
		

		
		PreparedStatement ps = conn.prepareStatement(
				"insert into tutorialjavacoches.coche "
				+ "(id, idFabricante, bastidor, modelo, color) "
				+ "values (?, ?, ?, ?, ?)");
		ps.setInt(1, EscogerPrimerIDDisponible(conn));
		ps.setInt(2, idFabricante);
		ps.setString(3, bastidor);
		ps.setString(4, modelo);
		ps.setString(5, color);

		

		int filasAfectadas = ps.executeUpdate();
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		ps.close();
	}
	

}
