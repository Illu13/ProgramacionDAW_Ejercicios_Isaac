package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import capitulo04.bloque04.Utils;

public class ControladorVentas {

	public static int EscogerPrimerIDDisponible(Connection conn) throws SQLException {

		int idDisponible = 0;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from venta");

		while (rs.next()) {
			idDisponible = rs.getInt(1);

		}

		rs.close();
		s.close();

		return idDisponible + 1;

	}
	public static void VerRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from venta");

		// Navegaci�n del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getString(4)
			+ " " + rs.getString(5));
		}

		// Cierre de los elementos
		rs.close();
		s.close();

	}

	public static void realizaInsert(Connection conn, int idCli, int idCon, int idCoc, String fechaNac,
			float precioVenta) throws SQLException {

		Date fecha = Utils.parseoFecha(fechaNac);

		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());

		PreparedStatement ps = conn.prepareStatement("insert into tutorialjavacoches.venta "
				+ "(id, idCliente, idConcesionario, idCoche, fecha, precioVenta) " + "values (?, ?, ?, ?, ?, ?)");
		ps.setInt(1, EscogerPrimerIDDisponible(conn));
		ps.setInt(2, idCli);
		ps.setInt(3, idCon);
		ps.setInt(4, idCoc);
		ps.setDate(5, fechaSql);
		ps.setFloat(6, precioVenta);

		int filasAfectadas = ps.executeUpdate();

		System.out.println("Filas afectadas: " + filasAfectadas);

		ps.close();
	}

	public static void realizaUpdate(Connection conn, int id, int idCli, int idCon, int idCoc, String fechaNac,
			float precioVenta) throws SQLException {

		Date fecha = Utils.parseoFecha(fechaNac);

		java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());

		PreparedStatement ps = conn.prepareStatement("update tutorialjavacoches.venta set"
				+ " idCliente = ?, idConcesionario = ?, " + "idCoche = ?,"
						+ " fecha = ?, precioVenta = ? where id = " + id);
		ps.setInt(1, idCli);
		ps.setInt(2, idCon);
		ps.setInt(3, idCoc);
		ps.setDate(4, fechaSql);
		ps.setFloat(5, precioVenta);

		int filasAfectadas = ps.executeUpdate();

		System.out.println("Filas afectadas: " + filasAfectadas);

		ps.close();
	}
	
	public static void realizaDelete (Connection conn, int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.venta where id = ?");
		
		ps.setInt(1, id);
		
		int filasAlteradas = ps.executeUpdate();
		
	
	   
		System.out.println("Filas afectadas: " + filasAlteradas);
		
		ps.close();
	}

}
