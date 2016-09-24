package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//awt
//swing
//javafx

public class Formulario extends JFrame{
	public Formulario(){
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
						100, 267, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Se ejecuto el metodo paint");
	}

	public static void main(String[] args) {
		new Formulario();
	}
}
