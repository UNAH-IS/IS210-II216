import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class EjemploHashmap extends JFrame{
	private ArrayList<String> cadenas;
	private HashMap<String, String> pares;
	private HashMap<String, BufferedImage> imagenes;

	public EjemploHashmap(){
		pares = new HashMap<String,String>();
		imagenes = new HashMap<String,BufferedImage>();
		pares.put("Elemento1", "Hola");
		pares.put("Elemento2", "Mundo");
		try {
			imagenes.put("carrito",
					ImageIO.read(getClass().getResource("/recursos/auto.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(pares.get("Elemento1") + " " + pares.get("Elemento2"));
		pares.remove("Elemento1");

		inicializarFormulario();
	}

	public void inicializarFormulario(){
		setTitle("Need4Speed");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(imagenes.get("carrito"), 100, 100, this);
	}

	public static void main(String[] args) {
		//llave-valor
		new EjemploHashmap();
	}

}
