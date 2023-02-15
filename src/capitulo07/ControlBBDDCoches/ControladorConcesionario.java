package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorConcesionario {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");

		// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL,
		// si no fuera así
		// no podemos trabajar con esa BBDD.
		Class.forName(driver);

		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
		// tipo Connection, al cual
		// le tenemos que pasar los parámetros de conexión.
		return DriverManager.getConnection("jdbc:mysql://" + host + "/" + schema + properties, user, password);

	}
	
	public static void VerRegistros(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from concesionario");

		// Navegaci�n del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}

		// Cierre de los elementos
		rs.close();
		s.close();

	}
	
	public static void realizaInsert (Connection conn, String cif, String nombre, String localidad) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(
				"insert into tutorialjavacoches.concesionario "
				+ "(id, cif, nombre, localidad) "
				+ "values (?, ?, ?, ?)");
		ps.setInt(1, EscogerPrimerIDDisponible(conn));
		ps.setString(2, cif);
		ps.setString(3, nombre);
		ps.setString(4, localidad);

		int filasAfectadas = ps.executeUpdate();
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		ps.close();
	}
	
	public static void UpdateRegistro(Connection conn, int id, String cif, String nombre, String localidad) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(
				"update tutorialjavacoches.concesionario set cif = ?, nombre = ?, localidad = ? where id = " + id);
		ps.setString(1, cif);
		ps.setString(2, nombre);
		ps.setString(3, localidad);


		int filasAlteradas = ps.executeUpdate();

		System.out.println(filasAlteradas);
		
		ps.close();

	}
	
	public static void realizaDelete (Connection conn, int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("Delete from tutorialjavacoches.concesionario where id = ?");
		
		ps.setInt(1, id);
		
		int filasAlteradas = ps.executeUpdate();
		
	
	   
		System.out.println("Filas afectadas: " + filasAlteradas);
		
		ps.close();
	}
	
	
	
	public static int EscogerPrimerIDDisponible(Connection conn) throws SQLException {

		int idDisponible = 0;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from concesionario");

		while (rs.next()) {
			idDisponible = rs.getInt(1);

		}

		rs.close();
		s.close();

		return idDisponible + 1;

	}



}
