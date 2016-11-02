package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setTitle("Registro de Telefonos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setBounds(10, 24, 147, 14);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(10, 49, 147, 14);
		contentPane.add(lblModelo);
		
		JLabel lblCapacidadDeMemoria = new JLabel("Capacidad de Memoria");
		lblCapacidadDeMemoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadDeMemoria.setBounds(10, 102, 147, 14);
		contentPane.add(lblCapacidadDeMemoria);
		
		JLabel lblCapacidadDisco = new JLabel("Capacidad Disco:");
		lblCapacidadDisco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadDisco.setBounds(10, 127, 147, 14);
		contentPane.add(lblCapacidadDisco);
		
		JLabel lblResolucion = new JLabel("Resolucion:");
		lblResolucion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResolucion.setBounds(10, 152, 147, 14);
		contentPane.add(lblResolucion);
		
		JLabel lblTamaoDePantalla = new JLabel("Tama\u00F1o de pantalla:");
		lblTamaoDePantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTamaoDePantalla.setBounds(10, 177, 147, 14);
		contentPane.add(lblTamaoDePantalla);
		
		JLabel lblCompaia = new JLabel("Compa\u00F1ia:");
		lblCompaia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompaia.setBounds(10, 202, 147, 14);
		contentPane.add(lblCompaia);
		
		JLabel lblNumeroTelefonico = new JLabel("Numero Telefonico:");
		lblNumeroTelefonico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroTelefonico.setBounds(10, 230, 147, 14);
		contentPane.add(lblNumeroTelefonico);
		
		JLabel lblSistemaOperativo = new JLabel("Sistema Operativo");
		lblSistemaOperativo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSistemaOperativo.setBounds(10, 74, 147, 14);
		contentPane.add(lblSistemaOperativo);
		
		JLabel lblOtrosComponentes = new JLabel("Otros Componentes:");
		lblOtrosComponentes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOtrosComponentes.setBounds(10, 277, 147, 14);
		contentPane.add(lblOtrosComponentes);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 21, 242, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(160, 46, 242, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(160, 71, 242, 20);
		contentPane.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(160, 99, 104, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 124, 104, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 149, 104, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 174, 147, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnTigo = new JRadioButton("Tigo");
		rdbtnTigo.setBounds(163, 198, 65, 23);
		contentPane.add(rdbtnTigo);
		
		JRadioButton rdbtnClaro = new JRadioButton("Claro");
		rdbtnClaro.setBounds(230, 198, 65, 23);
		contentPane.add(rdbtnClaro);
		
		JRadioButton rdbtnHondutel = new JRadioButton("Hondutel");
		rdbtnHondutel.setBounds(297, 198, 109, 23);
		contentPane.add(rdbtnHondutel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 227, 194, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNfc = new JCheckBox("NFC");
		chckbxNfc.setBounds(161, 273, 55, 23);
		contentPane.add(chckbxNfc);
		
		JCheckBox chckbxLte = new JCheckBox("LTE");
		chckbxLte.setBounds(218, 273, 49, 23);
		contentPane.add(chckbxLte);
		
		JCheckBox chckbxBluetooth = new JCheckBox("Bluetooth");
		chckbxBluetooth.setBounds(272, 273, 97, 23);
		contentPane.add(chckbxBluetooth);
		
		JLabel lblCapacidadCamara = new JLabel("Capacidad camara:");
		lblCapacidadCamara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadCamara.setBounds(34, 254, 123, 14);
		contentPane.add(lblCapacidadCamara);
		
		textField_5 = new JTextField();
		textField_5.setBounds(160, 253, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setMnemonic('n');
		btnNuevo.setBounds(417, 19, 107, 23);
		contentPane.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setMnemonic('g');
		btnGuardar.setBounds(417, 44, 107, 23);
		contentPane.add(btnGuardar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setMnemonic('a');
		btnActualizar.setBounds(417, 69, 107, 23);
		contentPane.add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setMnemonic('e');
		btnEliminar.setBounds(417, 95, 107, 23);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setMnemonic('s');
		btnSalir.setBounds(417, 121, 107, 23);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 302, 522, 208);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
