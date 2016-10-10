package clases;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario {
	private JFrame formulario;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblGenero;

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;

	private JRadioButton rbtFemenino;
	private JRadioButton rbtMasculino;

	private JButton btnGuardar;
	private JButton btnNuevo;

	private ButtonGroup grupoGenero;

	public Formulario(){
		inicializarFormulario();
		inicializarComponentes();

		formulario.setVisible(true);
	}

	public void inicializarFormulario(){
		formulario = new JFrame("Registro alumnos");
		formulario.setSize(350,350);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);//Se necesita hacer esto para poder utilizar coordenadas
		formulario.setResizable(false);
	}

	public void inicializarComponentes(){
		//Instanciar
		lblNombre = new JLabel("Nombre:");
		lblApellido = new JLabel("Apellido:");
		lblEdad = new JLabel("Edad:");
		lblGenero = new JLabel("Genero:");
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtEdad = new JTextField();
		grupoGenero = new ButtonGroup();
		btnGuardar = new JButton("Guardar");
		btnNuevo = new JButton("Nuevo");

		rbtFemenino = new JRadioButton("Femenino");
		rbtMasculino = new JRadioButton("Masculino");
		//Agregar logica para que solo se pueda seleccionar un boton
		grupoGenero.add(rbtFemenino);
		grupoGenero.add(rbtMasculino);

		//Ubicar y dar tama�o
		lblNombre.setBounds(20, 20, 90, 25);
		lblApellido.setBounds(20, 50, 90, 25);
		lblEdad.setBounds(20, 80, 90, 25);
		lblGenero.setBounds(20, 110, 90, 25);
		txtNombre.setBounds(120, 20, 200, 25);
		txtApellido.setBounds(120, 50, 200, 25);
		txtEdad.setBounds(120, 80, 60, 25);
		rbtFemenino.setBounds(120, 110, 100, 25);
		rbtMasculino.setBounds(220, 110, 100, 25);
		btnGuardar.setBounds(20, 150, 100, 25);
		btnNuevo.setBounds(125, 150, 100, 25);

		//Propiedades especiales
		lblNombre.setHorizontalAlignment(JLabel.RIGHT);
		lblApellido.setHorizontalAlignment(JLabel.RIGHT);
		lblEdad.setHorizontalAlignment(JLabel.RIGHT);
		lblGenero.setHorizontalAlignment(JLabel.RIGHT);

		//Agregarlos al formulario
		formulario.add(lblNombre);
		formulario.add(lblApellido);
		formulario.add(lblEdad);
		formulario.add(lblGenero);
		formulario.add(txtNombre);
		formulario.add(txtEdad);
		formulario.add(txtApellido);
		formulario.add(rbtFemenino);
		formulario.add(rbtMasculino);
		formulario.add(btnGuardar);
		formulario.add(btnNuevo);

	}

	public static void main(String[] args) {
		new Formulario();
	}

}
