package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//awt
//swing
//javafx

public class Formulario extends JFrame implements KeyListener{
	private int coordenadaX=100;
	public Formulario(){
		addKeyListener(this);
		setTitle("Super formulario");
		setSize(500, 500);
		/*Point p = new Point(200,20);
		setLocation(p);*/
		setLocationRelativeTo(null);//Centrar el formulario

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g){
		super.paint(g);
		try {
			g.drawImage(
					ImageIO.read(
						getClass().getResource("/imagenes/background.png")),
						0, 0, this);
			g.drawImage(
					ImageIO.read(
						getClass().getResource("/imagenes/mario.png")),
						coordenadaX, 267, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Se ejecuto el metodo paint");
	}

	public static void main(String[] args) {
		new Formulario();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT)
			System.out.println("Se presiono la tecla espacio");
		coordenadaX+=10;
		repaint();
		//System.out.println("Tecla presionada: "+arg0.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT)
			System.out.println("Se solto la tecla espacio");
		//System.out.println("Tecla soltada: "+arg0.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
