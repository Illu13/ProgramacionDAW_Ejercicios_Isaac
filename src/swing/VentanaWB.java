package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo04.bloque04.Utils;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class VentanaWB extends JFrame {

	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfDesc;
	private static Connection conn = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaWB frame = new VentanaWB();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();

					try {
						Connection conn = ConnectionManagerV1.getConexion();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				try {
					conn = ConnectionManagerV1.getConexion();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0};
//		gbl_contentPane.rowHeights = new int[]{0};
//		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel_2 = new JLabel("Gestión de cursos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 15, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("Identificador: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Descrpición: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		jtfDesc = new JTextField();
		GridBagConstraints gbc_jtfDesc = new GridBagConstraints();
		gbc_jtfDesc.gridwidth = 2;
		gbc_jtfDesc.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDesc.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDesc.gridx = 1;
		gbc_jtfDesc.gridy = 2;
		contentPane.add(jtfDesc, gbc_jtfDesc);
		jtfDesc.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weightx = 2.0;
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);

		JButton btnPrimerRegistro = new JButton("<<");
		btnPrimerRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cargarPrimerRegistro(conn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		panel.add(btnPrimerRegistro);

		JButton btnAnteriorRegistro = new JButton("<");
		btnAnteriorRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					cargarAnteriorRegistro(conn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnAnteriorRegistro);

		JButton btnSiguienteRegistro = new JButton(">");
		btnSiguienteRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					cargarSiguienteRegistro(conn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnSiguienteRegistro);

		JButton btnUltimoRegistro = new JButton(">>");
		btnUltimoRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					cargarUltimoRegistro(conn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnUltimoRegistro);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!jtfId.getText().isBlank()) {
					try {
						realizaUpdate(conn);
					} catch (SQLException e1) {

						e1.printStackTrace();
					}
				} else {
					try {
						InsertarRegistro(conn);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		panel.add(btnGuardar);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiarCampos();

				
			}
		});
		panel.add(btnNuevo);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					confirmarDelete(conn);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnEliminar);
	}

	/*
	 * 
	 */

	private void cargarPrimerRegistro(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from centroeducativo.curso order by id limit 1");

		while (rs.next()) {
			this.jtfId.setText(rs.getString(1));
			this.jtfDesc.setText(rs.getString(2));
		}

		rs.close();
		s.close();
	}

	private void cargarUltimoRegistro(Connection conn) throws SQLException {

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from centroeducativo.curso order by id desc limit 1");

		while (rs.next()) {
			this.jtfId.setText(rs.getString(1));
			this.jtfDesc.setText(rs.getString(2));
		}

		rs.close();
		s.close();
	}

	private void cargarSiguienteRegistro(Connection conn) throws SQLException {

		int idActual = Integer.parseInt(jtfId.getText());

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s
				.executeQuery("select * from centroeducativo.curso where id > " + idActual + " order by id limit " + 1);

		while (rs.next()) {
			this.jtfId.setText(rs.getString(1));
			this.jtfDesc.setText(rs.getString(2));
		}

		rs.close();
		s.close();
	}

	private void cargarAnteriorRegistro(Connection conn) throws SQLException {

		int idActual = Integer.parseInt(jtfId.getText());

		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select * from centroeducativo.curso where id < " + idActual + " order by id desc limit " + 1);

		while (rs.next()) {
			this.jtfId.setText(rs.getString(1));
			this.jtfDesc.setText(rs.getString(2));
		}

		rs.close();
		s.close();
	}

	private void realizaUpdate(Connection conn) throws SQLException {

		int id = Integer.parseInt(jtfId.getText());
		String fecha = jtfDesc.getText();

		PreparedStatement ps = conn
				.prepareStatement("update centroeducativo.curso set descripcion = ? where id = " + id);
		ps.setString(1, fecha);

		int filasAlteradas = ps.executeUpdate();

		System.out.println(filasAlteradas);

		ps.close();

	}

	public void InsertarRegistro(Connection conn) throws SQLException {

		int id = escogerPrimerIDDisponible(conn);
		String fecha = jtfDesc.getText();

		PreparedStatement ps = conn
				.prepareStatement("insert into centroeducativo.curso " + "(id, descripcion) " + "values (?, ?)");

		ps.setInt(1, escogerPrimerIDDisponible(conn));
		ps.setString(2, fecha);

		int filasAlteradas = ps.executeUpdate();

		ps.close();

		System.out.println(filasAlteradas);

	}

	public static int escogerPrimerIDDisponible(Connection conn) throws SQLException {

		int idDisponible = 0;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) from curso");

		while (rs.next()) {
			idDisponible = rs.getInt(1);

		}

		rs.close();
		s.close();

		return idDisponible + 1;

	}

	public void realizaDelete(Connection conn) throws SQLException {
		
		int idActual = Integer.parseInt(jtfId.getText());

		PreparedStatement ps = conn.prepareStatement("Delete from centroeducativo.curso where id = ?");

		ps.setInt(1, idActual);

		int filasAlteradas = ps.executeUpdate();

		System.out.println("Filas afectadas: " + filasAlteradas);

		ps.close();
	}
	
	private void limpiarCampos() {
		jtfDesc.setText(" ");
		jtfId.setText(" ");
	}
	
	private void confirmarDelete(Connection conn) throws SQLException {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(null,"¿Desea borrar el registro?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			realizaDelete(conn);
			limpiarCampos();
		}
	}

}
