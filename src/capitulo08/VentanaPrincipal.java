package capitulo08;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	public static int ANCHO = 500;
	public static int ALTO = 500;

	public VentanaPrincipal() {
		super("Título de la ventana");
		setDimensionesBasicas();

		this.setContentPane(getPanelPrincipal());
	}

	/**
	 * 
	 * @return
	 */

	private JPanel getPanelPrincipal() {
		JPanel jp = new JPanel();

		jp.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb = new JLabel("Introduzca un ID: ");
		jp.add(jlb, c);

		c = new GridBagConstraints();

		JLabel jlb3 = new JLabel("Gestión del estudiante");

		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.NORTH;
		c.weighty = 1;
		c.weightx = 1;

		jp.add(jlb3, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf = new JTextField();
		jp.add(jtf, c);

		// segunda fila.

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb2 = new JLabel("Introduzca el ID: ");
		jp.add(jlb2, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf2 = new JTextField();
		jp.add(jtf2, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb4 = new JLabel("Introduzca el nombre: ");
		jp.add(jlb4, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf3 = new JTextField();
		jp.add(jtf3, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb5 = new JLabel("Introduzca el apellido: ");
		jp.add(jlb5, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf4 = new JTextField();
		jp.add(jtf4, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb6 = new JLabel("Introduzca el apellido: ");
		jp.add(jlb6, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf5 = new JTextField();
		jp.add(jtf5, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb7 = new JLabel("Introduzca el DNI: ");
		jp.add(jlb7, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf6 = new JTextField();
		jp.add(jtf6, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 7;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb8 = new JLabel("Introduzca la dirección: ");
		jp.add(jlb8, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 7;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf7 = new JTextField();
		jp.add(jtf7, c);

		c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 8;
		c.fill = GridBagConstraints.NONE;
		c.weighty = 0;
		c.weightx = 0;

		JLabel jlb9 = new JLabel("Introduzca el email: ");
		jp.add(jlb9, c);

		c = new GridBagConstraints();

		c.gridx = 1;
		c.gridy = 8;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		JTextField jtf8 = new JTextField();
		jp.add(jtf8, c);

		// tercera fila.
		
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 2;
		c.weighty = 1;
		c.weightx = 0;
		JButton jbt = new JButton("Enviar valores");
		jp.add(jbt, c);
		

		jp.add(new JPanel(), c);

		return jp;

	}

	private void setDimensionesBasicas() {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, ANCHO, ALTO);
		this.setMinimumSize(new Dimension(ANCHO, ALTO));
	}

}
