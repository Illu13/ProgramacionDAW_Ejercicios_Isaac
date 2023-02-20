package capitulo07.ControlBBDDCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.UpdatableResultSet;

import capitulo04.bloque04.Utils;

public class LecturaBBDDConcesionario {

	/**
	 * 
	 * @param args1
	 */

	public static void main(String[] args) {
		do {
			pruebaConsultaPorFicheroDePropiedades();
		} while (true);
	}

	/**
	 * 
	 */

	private static void pruebaConsultaPorFicheroDePropiedades() {

		String nombre = null;
		String localidad = null;
		String cif = null;
		int id = 0;
		String apellidos = null;
		String dni = null;
		String fechaNac = null;
		String confirmacion = null;
		boolean activo = false;
		int idFab;
		int idCoc;
		int idCon;
		int idCli;
		float precioVenta;

		try {

			int opcion = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
					+ "\n1.-Modificar registros de los concesionarios" + "\n2.-Modificar registros de los fabricantes"
					+ "\n3.-Modificar registros de los clientes" + "\n4.-Modificar registros de los coches"
					+ "\n5.-Modificar registros de las ventas" + "\nIntroduzca una opción.");

			Connection conn = ControladorConcesionario.getConnection();

			switch (opcion) {

			case 0:
				conn.close();
				System.exit(0);

			case 1:

				int opcionC = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
						+ "\n1.-Ver todos los registros" + "\n2.-Insertar un registro" + "\n3.-Modificar un registro"
						+ "\n4.-Eliminar un registro" + "\nIntroduzca una opción.");

				switch (opcionC) {

				case 1:

					ControladorConcesionario.verRegistros(conn);
					conn.close();
					break;

				case 2:

					cif = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el cif");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca la localidad");
					ControladorConcesionario.realizaInsert(conn, cif, nombre, localidad);
					conn.close();
					break;

				case 3:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del concesionario");
					cif = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el cif");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca la localidad");

					if (cif.isEmpty()) {
						cif = ControladorConcesionario.tenerCifIDActual(conn, id);
					}
					if (nombre.isEmpty()) {
						nombre = ControladorConcesionario.tenerNombreIDActual(conn, id);
					}
					if (localidad.isEmpty()) {
						nombre = ControladorConcesionario.tenerLocalidadIDActual(conn, id);
					}
					ControladorConcesionario.updateRegistro(conn, id, cif, nombre, localidad);
					conn.close();
					break;
				case 4:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del concesionario");
					ControladorConcesionario.realizaDelete(conn, id);
					conn.close();
					break;

				}

				break;

			case 2:
				int opcionF = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
						+ "\n1.-Ver todos los registros" + "\n2.-Insertar un registro" + "\n3.-Modificar un registro"
						+ "\n4.-Eliminar un registro" + "\nIntroduzca una opción.");

				switch (opcionF) {

				case 1:

					ControladorFabricante.verRegistros(conn);
					conn.close();
					break;

				case 2:

					cif = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el cif");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");
					ControladorFabricante.InsertarRegistro(conn, cif, nombre);
					conn.close();
					break;

				case 3:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del fabricante");
					cif = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el cif");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");

					if (cif.isEmpty()) {
						cif = ControladorFabricante.tenerNombreIDActual(conn, id);
					}
					if (nombre.isEmpty()) {
						nombre = ControladorFabricante.tenerMarcaIDActual(conn, id);
					}
					ControladorFabricante.updateRegistro(conn, id, cif, nombre);
					conn.close();
					break;
				case 4:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del fabricante");
					ControladorFabricante.realizaDelete(conn, id);
					conn.close();
					break;
				}
				break;

			case 3:

				int opcionCli = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
						+ "\n1.-Ver todos los registros" + "\n2.-Insertar un registro" + "\n3.-Modificar un registro"
						+ "\n4.-Eliminar un registro" + "\nIntroduzca una opción.");

				switch (opcionCli) {

				case 1:

					ControladorCliente.verRegistros(conn);
					conn.close();
					break;

				case 2:

					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");
					apellidos = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca los apellidos");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca la localidad");
					dni = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el dni");
					fechaNac = Utils.obtenerStringPorJOptionPaneConDescripcion(
							"Introduzca la " + "fecha en este formato yyyy-MM-dd");
					confirmacion = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca si el "
							+ "cliente está activo, si lo está pon 'S', si no, pon cualquier otra cosa");
					if (confirmacion.equals("S")) {
						activo = true;
					} else {
						activo = false;
					}

					ControladorCliente.realizaInsert(conn, nombre, apellidos, localidad, dni, fechaNac, activo);

					conn.close();
					break;

				case 3:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del cliente");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el nombre");
					apellidos = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca los apellidos");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca la localidad");
					dni = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el dni");
					fechaNac = Utils.obtenerStringPorJOptionPaneConDescripcion(
							"Introduzca la " + "fecha en este formato yyyy-MM-dd");
					confirmacion = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca si el "
							+ "cliente está activo, si lo está pon 'S', si no, pon cualquier otra cosa");
					if (confirmacion.equals("S")) {
						activo = true;
					} else {
						activo = false;
					}

					if (nombre.isEmpty()) {
						nombre = ControladorCliente.tenerNombreIDActual(conn, id);
					}
					if (apellidos.isEmpty()) {
						apellidos = ControladorCliente.tenerApellidosIDActual(conn, id);
					}
					if (localidad.isEmpty()) {
						localidad = ControladorCliente.tenerLocalidadIDActual(conn, id);
					}
					if (dni.isEmpty()) {
						dni = ControladorCliente.tenerDniIDActual(conn, id);
					}

					ControladorCliente.updateRegistro(conn, id, nombre, apellidos, localidad, dni, fechaNac, activo);
					conn.close();
					break;
				case 4:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del cliente");
					ControladorCliente.realizaDelete(conn, id);
					conn.close();
					break;
				}
				break;

			case 4:

				int opcionCo = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
						+ "\n1.-Ver todos los registros" + "\n2.-Insertar un registro" + "\n3.-Modificar un registro"
						+ "\n4.-Eliminar un registro" + "\nIntroduzca una opción.");

				switch (opcionCo) {

				case 1:
					ControladorCoche.verRegistros(conn);
					conn.close();
					break;
				case 2:
					ControladorFabricante.verRegistros(conn);
					idFab = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del fabricante "
							+ "este tiene que estar en la tabla mostrada por consola.");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el número de bastidor");
					apellidos = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el modelo");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el color");

					ControladorCoche.realizaInsert(conn, idFab, nombre, apellidos, localidad);
					conn.close();
					break;
				case 3:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del coche a cambiar");
					ControladorFabricante.verRegistros(conn);
					idFab = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del fabricante "
							+ "este tiene que estar en la tabla mostrada por consola.");
					nombre = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el número de bastidor");
					apellidos = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el modelo");
					localidad = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca el color");

					ControladorCoche.updateRegistro(conn, id, idFab, nombre, apellidos, localidad);
					conn.close();
					break;
				case 4:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca el id del coche");
					ControladorCoche.realizaDelete(conn, id);
					conn.close();
					break;

				}

			case 5:
				int opcionVe = Utils.obtenerEnteroPorJOptionPaneConDescripcion("0.-Salir"
						+ "\n1.-Ver todos los registros" + "\n2.-Insertar un registro" + "\n3.-Modificar un registro"
						+ "\n4.-Eliminar un registro" + "\nIntroduzca una opción.");

				switch (opcionVe) {

				case 1:

					ControladorVentas.verRegistros(conn);

				case 2:

					System.out.println("Registros cliente");
					ControladorCliente.verRegistros(conn);
					idCli = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del cliente, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					System.out.println("Registros concesionario");
					ControladorConcesionario.verRegistros(conn);
					idCon = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del concesionario, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					System.out.println("Registros coches");
					ControladorCoche.verRegistros(conn);
					idCoc = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del coche, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					fechaNac = Utils.obtenerStringPorJOptionPaneConDescripcion(
							"Introduzca la " + "fecha en este formato yyyy-MM-dd");
					precioVenta = Utils.obtenerFloatPorJOptionPaneConDescripcion("Introduzca el precio de la venta");

					ControladorVentas.realizaInsert(conn, idCli, idCon, idCoc, fechaNac, precioVenta);
					break;
				case 3:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id de la venta a modificar");
					System.out.println("Registros cliente");
					ControladorCliente.verRegistros(conn);
					idCli = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del cliente, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					System.out.println("Registros concesionario");
					ControladorConcesionario.verRegistros(conn);
					idCon = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del concesionario, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					System.out.println("Registros coches");
					ControladorCoche.verRegistros(conn);
					idCoc = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id del coche, "
							+ "tiene que estar en la tabla que acaba de salir en consola");
					fechaNac = Utils.obtenerStringPorJOptionPaneConDescripcion(
							"Introduzca la " + "fecha en este formato yyyy-MM-dd");
					precioVenta = Utils.obtenerFloatPorJOptionPaneConDescripcion("Introduzca el precio de la venta");

					ControladorVentas.realizaUpdate(conn, id, idCli, idCon, idCoc, fechaNac, precioVenta);
					break;
				case 4:
					id = Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduzca la id de la venta a eliminar");
					ControladorVentas.realizaDelete(conn, id);
				}

				break;
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		} catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}

	}

	/*
	 * 
	 */

}
