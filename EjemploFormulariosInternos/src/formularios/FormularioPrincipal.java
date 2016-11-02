package formularios;

import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	private JDesktopPane contentPane;
	private JInternalFrame frmGestionCategorias;
	private JInternalFrame frmGestionProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
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
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 469);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);

		JMenuItem mntmGestionarCategorias = new JMenuItem("Gestionar categorias");
		mntmGestionarCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmGestionCategorias.setVisible(true);
			}
		});
		mnOperaciones.add(mntmGestionarCategorias);

		JMenuItem mntmGestionarProductos = new JMenuItem("Gestionar productos");
		mntmGestionarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGestionProductos.setVisible(true);
			}
		});
		mnOperaciones.add(mntmGestionarProductos);
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		frmGestionProductos = new JInternalFrame("Gestion de productos");
		frmGestionProductos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmGestionProductos.setMaximizable(true);
		frmGestionProductos.setIconifiable(true);
		frmGestionProductos.setClosable(true);
		frmGestionProductos.setBounds(10, 11, 258, 187);
		contentPane.add(frmGestionProductos);

		frmGestionCategorias = new JInternalFrame("Gestion de categorias");
		frmGestionCategorias.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmGestionCategorias.setClosable(true);
		frmGestionCategorias.setIconifiable(true);
		frmGestionCategorias.setMaximizable(true);
		frmGestionCategorias.setBounds(299, 11, 245, 187);
		contentPane.add(frmGestionCategorias);

	}
}