package formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FormularioGestionCategorias extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public FormularioGestionCategorias() {
		setTitle("Gestion de categorias");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(67, 29, 46, 14);
		getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(47, 78, 89, 23);
		getContentPane().add(btnNewButton);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 127, 166, 20);
		getContentPane().add(comboBox);

	}
}
