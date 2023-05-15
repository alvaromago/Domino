package es.studium.domino;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long seriaVersionUTD = 1L;
	
	Image fondo, nuevaPartida, ayuda, ranking;
	Toolkit herramienta;
	
	public MenuPrincipal()
	{
		setTitle("Dominó");
		setSize(1000, 600);
		// Activamos la herramienta
		herramienta = getToolkit();
		fondo = herramienta.getImage("Inicio.jpg");
		nuevaPartida = herramienta.getImage(""); // cargar la imagen
		ranking = herramienta.getImage("");
		ayuda = herramienta.getImage("");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
	// Dibujar la imagen
		g.drawImage(fondo, 0, 0, 1000, 600, this);	
	}
}
