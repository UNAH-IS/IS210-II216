package formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class FormularioGestionProductos extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public FormularioGestionProductos() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(33, 24, 46, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(33, 56, 46, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(33, 81, 46, 14);
		getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(89, 21, 200, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 56, 200, 20);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 81, 200, 20);
		getContentPane().add(textField_2);

	}
}
